package com.isildursbaneuk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnigmaMachine {

    private final Map<String, Integer> letterToNumberMap = new HashMap<>();
    private final Map<Integer, String> numberToLetterMap = new HashMap<>();
    private final Map<String, String> plugboardSettingsMap = new HashMap<>();
    private final ArrayList<Rotor> rotorsInUse = new ArrayList<>();
    private Rotor reflector = null;

    final private Rotor rotorI = RotorFactory.createRotorI();
    final private Rotor rotorII = RotorFactory.createRotorII();
    final private Rotor rotorIII = RotorFactory.createRotorIII();
    final private Rotor rotorIV = RotorFactory.createRotorIV();
    final private Rotor rotorV = RotorFactory.createRotorV();
    final private Rotor reflectorA = RotorFactory.createReflectorA();
    final private Rotor reflectorB = RotorFactory.createReflectorB();
    final private Rotor reflectorC = RotorFactory.createReflectorC();

    public EnigmaMachine() {
        String[] letterOrder = {
                "Q", "W", "E", "R", "T", "Z", "U", "I", "O",
                "A", "S", "D", "F", "G", "H", "J", "K",
                "P", "Y", "X", "C", "V", "B", "N", "M", "L"
        };
        for (int i = 0; i < letterOrder.length; i++) {
            letterToNumberMap.put(letterOrder[i], i);
        }

        for (int i = 0; i < letterOrder.length; i++) {
            numberToLetterMap.put(i, letterOrder[i]);
        }
    }

    public int convertLetterToNumber(String keyPressed) {
        return letterToNumberMap.get(keyPressed);
    }

    public String convertNumberToLetter(int keyToDisplay) {
        return numberToLetterMap.get(keyToDisplay);
    }

    /*
     * Method to take a user typed message, encrypt it and display the results on the screen
     */
    public String typeMessage(String messageToEncrypt) {

        List<String> encryptedMessageCharacters = new ArrayList<>();

        // Take the messageToEncrypt,
        // pass each letter to the keyboard pressKey method and
        // run it past the plugboard and
        // pass each result to the display displayKey method
        for (int i = 0; i < messageToEncrypt.length(); i++) {

            // Get the first letter of the string we have to encrypt
            String nextLetter = String.valueOf(messageToEncrypt.charAt(i));

            // Run that letter through the plugboard
            if (plugboardSettingsMap.containsKey(nextLetter)) {
                nextLetter = plugboardSettingsMap.get(nextLetter);
            }

            if (!getRotorsInUse().isEmpty()) {
                // Run that letter through the first rotor, then advance it
                nextLetter = dealWithRightHandRotor(nextLetter, false);

                // Run that letter through the second rotor
                nextLetter = dealWithMiddleRotor(nextLetter, false);

                // Run that letter through the third rotor
                nextLetter = dealWithLeftHandRotor(nextLetter, false);

                // Run that letter through the reflector
                nextLetter = dealWithReflector(nextLetter);

                // Run that letter back through the third rotor
                nextLetter = dealWithLeftHandRotor(nextLetter, true);

                // Run that letter back through the second rotor
                nextLetter = dealWithMiddleRotor(nextLetter, true);

                // Run that letter back through the first rotor
                nextLetter = dealWithRightHandRotor(nextLetter, true);
            }

            // Run that letter through the plugboard again
            if (plugboardSettingsMap.containsKey(nextLetter)) {
                nextLetter = plugboardSettingsMap.get(nextLetter);
            }

            encryptedMessageCharacters.add(nextLetter);
        }

        return String.join("", encryptedMessageCharacters);
    }

    private String dealWithRightHandRotor(String nextLetter, boolean reflected) {
        Rotor rightRotor = getRotorsInUse().get(2);

        // Advance right rotor one place every time
        int oldRightRotorSetPoint = rightRotor.getSetPoint();
        if (!reflected) {
            if (oldRightRotorSetPoint == 25) {
                rightRotor.setSetPoint(0);
            } else {
                rightRotor.setSetPoint(oldRightRotorSetPoint + 1);
            }
        }
        int newRightRotorSetPoint = rightRotor.getSetPoint();

        RotorHelper rh = new RotorHelper();
        String newLetter = rh.getLetterXStepsAhead(nextLetter, newRightRotorSetPoint);

        if (reflected) {
            nextLetter = rightRotor.getLetterBackward(newLetter);
        } else {
            nextLetter = rightRotor.getLetter(newLetter);
        }

        return rh.getLetterXStepsAhead(nextLetter,-newRightRotorSetPoint);
    }

    private String dealWithMiddleRotor(String nextLetter, boolean reflected) {

        Rotor middleRotor = getRotorsInUse().get(1);
        Rotor rightRotor = getRotorsInUse().get(2);

        // Advance Middle rotor one place every time the right knocks it over
        int oldMiddleRotorSetPoint = middleRotor.getSetPoint();
        if (!reflected && rightRotor.stepRequired(rightRotor)) {
            middleRotor.setSetPoint(oldMiddleRotorSetPoint + 1);
        }
        int newMiddleRotorSetPoint = middleRotor.getSetPoint();

        RotorHelper rh = new RotorHelper();
        String newLetter = rh.getLetterXStepsAhead(nextLetter, newMiddleRotorSetPoint);

        if (reflected) {
            nextLetter = middleRotor.getLetterBackward(newLetter);
        } else {
            nextLetter = middleRotor.getLetter(newLetter);
        }

        return rh.getLetterXStepsAhead(nextLetter,-newMiddleRotorSetPoint);
    }

    private String dealWithLeftHandRotor(String nextLetter, boolean reflected) {

        Rotor leftRotor = getRotorsInUse().get(0);
        Rotor middleRotor = getRotorsInUse().get(1);

        // Advance Left rotor one place every time the middle knocks it over
        int oldLeftRotorSetPoint = leftRotor.getSetPoint();
        if (!reflected && middleRotor.stepRequired(middleRotor)) {
            leftRotor.setSetPoint(oldLeftRotorSetPoint + 1);
        }
        int newLeftRotorSetPoint = leftRotor.getSetPoint();

        RotorHelper rh = new RotorHelper();
        String newLetter = rh.getLetterXStepsAhead(nextLetter, newLeftRotorSetPoint);

        if (reflected) {
            nextLetter = leftRotor.getLetterBackward(newLetter);
        } else {
            nextLetter = leftRotor.getLetter(newLetter);
        }

        return rh.getLetterXStepsAhead(nextLetter,-newLeftRotorSetPoint);
    }

    private String dealWithReflector(String nextLetter) {

        nextLetter = reflector.getLetter(nextLetter);

        return nextLetter;
    }

    public Map<String, String> getPlugboardSettingsMap() {
        return plugboardSettingsMap;
    }

    public void addToPlugboardSettingsMap(String letterToAdd, String letterTransposed) {
        plugboardSettingsMap.put(letterToAdd, letterTransposed);
        plugboardSettingsMap.put(letterTransposed, letterToAdd);
    }

    public void setInitialRotorPosition(int startingPosition, int rotorNumber) {
        Rotor rotor = getRotorsInUse().get(rotorNumber);
        startingPosition = translateToAppropriateStartingPosition(startingPosition);
        rotor.setSetPoint(startingPosition);
    }

    private int translateToAppropriateStartingPosition(int startingPosition) {
        if (startingPosition > 25) {
            startingPosition = startingPosition - 26;
            startingPosition = translateToAppropriateStartingPosition(startingPosition);
        }
        return startingPosition;
    }

    public ArrayList<Rotor> getRotorsInUse() {
        return rotorsInUse;
    }

    public void setReflector(Rotor reflector) {
        this.reflector = reflector;
    }

    public Rotor getRotorI() {
        return rotorI;
    }

    public Rotor getRotorII() {
        return rotorII;
    }

    public Rotor getRotorIII() {
        return rotorIII;
    }

    public Rotor getRotorIV() {
        return rotorIV;
    }

    public Rotor getRotorV() {
        return rotorV;
    }

    public Rotor getReflectorA() {
        return reflectorA;
    }

    public Rotor getReflectorB() {
        return reflectorB;
    }

    public Rotor getReflectorC() {
        return reflectorC;
    }
}
