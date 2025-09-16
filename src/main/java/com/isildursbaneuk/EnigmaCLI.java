package com.isildursbaneuk;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EnigmaCLI {

    public static void createAndShowCLI(Scanner scanner, EnigmaMachine em) {

        printIntroMessage();

        String letterInput;
        int count = 0;
        for (char plugboardLetter = 'A'; plugboardLetter <= 'Z'; plugboardLetter++) {
            if (allTenCablesHaveBeenUsed(count)) {
                break;
            }
            while (true) {
                if (letterAlreadyPlugged(String.valueOf(plugboardLetter), em.getPlugboardSettingsMap())) {
                    break;
                }
                System.out.println();
                System.out.print("Which letter do you wish to transpose with '" + plugboardLetter + "': ");
                letterInput = scanner.nextLine();
                if (letterInput.matches("[A-Z]")) {
                    if(!String.valueOf(plugboardLetter).equals(letterInput)) {
                        em.addToPlugboardSettingsMap(String.valueOf(plugboardLetter), letterInput);
                        count++;
                    }
                    break;
                } else {
                    System.out.println();
                    System.out.println("Invalid input. Please enter only a single uppercase letter (A-Z).");
                }
            }
        }

        String rotorInput;
        String rotorPositionInput;
        Set<Integer> selectedRotorNumbers = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            while (true) {
                System.out.println();
                System.out.print("Which rotor do you want to put in slot " + (i + 1) + "? (1-5): ");
                rotorInput = scanner.nextLine().trim();
                if (!rotorInput.matches("[1-5]")) {
                    System.out.println("Invalid input. Please enter a single number from 1 to 5.");
                    continue;
                }

                int rotorNumber = Integer.parseInt(rotorInput);

                if (selectedRotorNumbers.contains(rotorNumber)) {
                    System.out.println("You’ve already inserted rotor " + rotorNumber + ". Pick a different one.");
                    continue;
                } else {
                    selectedRotorNumbers.add(rotorNumber);
                }

                Rotor selectedRotor = switch (rotorNumber) {
                    case 1 -> RotorFactory.createRotorI();
                    case 2 -> RotorFactory.createRotorII();
                    case 3 -> RotorFactory.createRotorIII();
                    case 4 -> RotorFactory.createRotorIV();
                    case 5 -> RotorFactory.createRotorV();
                    default -> throw new IllegalStateException("Unexpected rotor number: " + rotorNumber);
                };
                em.getRotorsInUse().add(selectedRotor);
                break;
            }

            while (true) {
                System.out.println();
                System.out.print("Which position do you want that rotor to start in? (1-26): ");
                rotorPositionInput = scanner.nextLine().trim();
                if (!rotorPositionInput.matches("[1-26]")) {
                    System.out.println("Invalid input. Please enter a single number from 1 to 26.");
                    continue;
                }

                int rotorStartingPosition = Integer.parseInt(rotorPositionInput);
                em.setInitialRotorPosition(rotorStartingPosition - 1, i);

                break;
            }

        }

        String reflectorToUse;
        while (true) {
            System.out.println();
            System.out.print("Which reflector do you wish to use? (A, B or C): ");
            reflectorToUse = scanner.nextLine().trim();
            if (!reflectorToUse.matches("[ABC]")) {
                System.out.println("Invalid input. Please enter a single letter A, B or C.");
                continue;
            }

            if (reflectorToUse.equalsIgnoreCase("A")) {
                em.setReflector(em.getReflectorA());
            } else if (reflectorToUse.equalsIgnoreCase("B")) {
                em.setReflector(em.getReflectorB());
            } else {
                em.setReflector(em.getReflectorC());
            }

            break;
        }

        String originalMessage;
        while (true) {
            System.out.println();
            System.out.print("Enter the message you want Enigma to encrypt: ");

            originalMessage = scanner.nextLine();
            if (originalMessage.matches("[A-Z]+")) {
                break;
            } else {
                System.out.println();
                System.out.println("Invalid input. Please enter only uppercase letters (A-Z).");
            }
        }

        String encryptedMessage = em.typeMessage(originalMessage);

        System.out.println();
        System.out.println("Original Message: " + originalMessage + "\n" + "Encrypted Message: " + encryptedMessage);
        scanner.close();
    }

    public static void printIntroMessage() {
        System.out.println();
        System.out.print("We will begin by setting up our plugboard.\n");
        System.out.print("For each letter of the alphabet I will ask you to type a transposition letter.\n");
        System.out.print("If you do not want to transpose that letter, simply type the letter itself.\n");
    }

    public static boolean allTenCablesHaveBeenUsed(int count) {
        if (count >= 10) {
            System.out.println();
            System.out.println("You have used all 10 cables, so we will move on.");
            return true;
        }
        return false;
    }

    public static boolean letterAlreadyPlugged(String letter, Map<String, String> settingsMap) {
        if (settingsMap.containsKey(String.valueOf(letter))) {
            System.out.println();
            System.out.println("You have already transposed " + letter + " with " + settingsMap.get(String.valueOf(letter)) + " so we will skip that.");
            return true;
        }
        return false;
    }

}
