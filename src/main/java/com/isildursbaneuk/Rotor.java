package com.isildursbaneuk;

import java.util.*;

public class Rotor {

    private Map<String, String> rotorTranslationMap;
    private final int stepPoint;
    private int setPoint;

    public Rotor(Map<String, String> rotorTranslationMap, int stepPoint, int setPoint) {
        this.rotorTranslationMap = new LinkedHashMap<>(rotorTranslationMap);
        this.stepPoint = stepPoint;
        this.setPoint = setPoint;
    }

    public void step() {
        List<String> keys = new ArrayList<>(rotorTranslationMap.keySet());
        List<String> values = new ArrayList<>(rotorTranslationMap.values());

        // Rotate values to the left by 1
        Collections.rotate(values, -1);

        // Rebuild the map with rotated values
        Map<String, String> rotatedMap = new LinkedHashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            rotatedMap.put(keys.get(i), values.get(i));
        }

        rotorTranslationMap = rotatedMap;
    }

    public String getKeyFromValue(Map<String, String> map, String value) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(value)) {
                return entry.getKey();
            }
        }
        return null; // or throw exception if not found
    }

    public boolean stepRequired(Rotor rotor) {
        return rotor.getStepPoint() - 1 == rotor.getSetPoint();//23//22
    }

    public String getLetter(String input) {
        return rotorTranslationMap.get(input);
    }

    public String getLetterBackward(String input) {
        return getKeyFromValue(rotorTranslationMap, input);
    }

    public Map<String, String> getRotorTranslationMap() {
        return rotorTranslationMap;
    }

    public int getStepPoint() {
        return stepPoint;
    }

    public int getSetPoint() {
        return setPoint;
    }

    public void setSetPoint(int setPoint) {
        this.setPoint = setPoint;
    }
}
