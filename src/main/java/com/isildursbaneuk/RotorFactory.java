package com.isildursbaneuk;

import java.util.LinkedHashMap;
import java.util.Map;

public class RotorFactory {

    public static Rotor createRotorI() {
        Map<String, String> rotorWiring = new LinkedHashMap<>();

        rotorWiring.put("A", "E");
        rotorWiring.put("B", "K");
        rotorWiring.put("C", "M");
        rotorWiring.put("D", "F");
        rotorWiring.put("E", "L");
        rotorWiring.put("F", "G");
        rotorWiring.put("G", "D");
        rotorWiring.put("H", "Q");
        rotorWiring.put("I", "V");
        rotorWiring.put("J", "Z");
        rotorWiring.put("K", "N");
        rotorWiring.put("L", "T");
        rotorWiring.put("M", "O");
        rotorWiring.put("N", "W");
        rotorWiring.put("O", "Y");
        rotorWiring.put("P", "H");
        rotorWiring.put("Q", "X");
        rotorWiring.put("R", "U");
        rotorWiring.put("S", "S");
        rotorWiring.put("T", "P");
        rotorWiring.put("U", "A");
        rotorWiring.put("V", "I");
        rotorWiring.put("W", "B");
        rotorWiring.put("X", "R");
        rotorWiring.put("Y", "C");
        rotorWiring.put("Z", "J");

        int stepPoint = 18;

        int setPoint = 0;

        return new Rotor(rotorWiring, stepPoint, setPoint);
    }

    public static Rotor createRotorII() {

        Map<String, String> rotorWiring = new LinkedHashMap<>();

        rotorWiring.put("A", "A");
        rotorWiring.put("B", "J");
        rotorWiring.put("C", "D");
        rotorWiring.put("D", "K");
        rotorWiring.put("E", "S");
        rotorWiring.put("F", "I");
        rotorWiring.put("G", "R");
        rotorWiring.put("H", "U");
        rotorWiring.put("I", "X");
        rotorWiring.put("J", "B");
        rotorWiring.put("K", "L");
        rotorWiring.put("L", "H");
        rotorWiring.put("M", "W");
        rotorWiring.put("N", "T");
        rotorWiring.put("O", "M");
        rotorWiring.put("P", "C");
        rotorWiring.put("Q", "Q");
        rotorWiring.put("R", "G");
        rotorWiring.put("S", "Z");
        rotorWiring.put("T", "N");
        rotorWiring.put("U", "P");
        rotorWiring.put("V", "Y");
        rotorWiring.put("W", "F");
        rotorWiring.put("X", "V");
        rotorWiring.put("Y", "O");
        rotorWiring.put("Z", "E");

        int stepPoint = 6;

        int setPoint = 0;

        return new Rotor(rotorWiring, stepPoint, setPoint);
    }

    public static Rotor createRotorIII() {

        Map<String, String> rotorWiring = new LinkedHashMap<>();

        rotorWiring.put("A", "B");
        rotorWiring.put("B", "D");
        rotorWiring.put("C", "F");
        rotorWiring.put("D", "H");
        rotorWiring.put("E", "J");
        rotorWiring.put("F", "L");
        rotorWiring.put("G", "C");
        rotorWiring.put("H", "P");
        rotorWiring.put("I", "R");
        rotorWiring.put("J", "T");
        rotorWiring.put("K", "X");
        rotorWiring.put("L", "V");
        rotorWiring.put("M", "Z");
        rotorWiring.put("N", "N");
        rotorWiring.put("O", "Y");
        rotorWiring.put("P", "E");
        rotorWiring.put("Q", "I");
        rotorWiring.put("R", "W");
        rotorWiring.put("S", "G");
        rotorWiring.put("T", "A");
        rotorWiring.put("U", "K");
        rotorWiring.put("V", "M");
        rotorWiring.put("W", "U");
        rotorWiring.put("X", "S");
        rotorWiring.put("Y", "Q");
        rotorWiring.put("Z", "O");

        int stepPoint = 23;

        int setPoint = 0;

        return new Rotor(rotorWiring, stepPoint, setPoint);
    }

    public static Rotor createReflectorA() {

        Map<String, String> rotorWiring = new LinkedHashMap<>();

        rotorWiring.put("A", "E");
        rotorWiring.put("B", "J");
        rotorWiring.put("C", "M");
        rotorWiring.put("D", "Z");
        rotorWiring.put("E", "A");
        rotorWiring.put("F", "L");
        rotorWiring.put("G", "Y");
        rotorWiring.put("H", "X");
        rotorWiring.put("I", "V");
        rotorWiring.put("J", "B");
        rotorWiring.put("K", "W");
        rotorWiring.put("L", "F");
        rotorWiring.put("M", "C");
        rotorWiring.put("N", "R");
        rotorWiring.put("O", "Q");
        rotorWiring.put("P", "U");
        rotorWiring.put("Q", "O");
        rotorWiring.put("R", "N");
        rotorWiring.put("S", "T");
        rotorWiring.put("T", "S");
        rotorWiring.put("U", "P");
        rotorWiring.put("V", "I");
        rotorWiring.put("W", "K");
        rotorWiring.put("X", "H");
        rotorWiring.put("Y", "G");
        rotorWiring.put("Z", "D");

        int stepPoint = 0;

        int setPoint = 0;

        return new Rotor(rotorWiring, stepPoint, setPoint);
    }

    public static Rotor createReflectorB() {

        Map<String, String> rotorWiring = new LinkedHashMap<>();

        rotorWiring.put("A", "Y");
        rotorWiring.put("B", "R");
        rotorWiring.put("C", "U");
        rotorWiring.put("D", "H");
        rotorWiring.put("E", "Q");
        rotorWiring.put("F", "S");
        rotorWiring.put("G", "L");
        rotorWiring.put("H", "D");
        rotorWiring.put("I", "P");
        rotorWiring.put("J", "X");
        rotorWiring.put("K", "N");
        rotorWiring.put("L", "G");
        rotorWiring.put("M", "O");
        rotorWiring.put("N", "K");
        rotorWiring.put("O", "M");
        rotorWiring.put("P", "I");
        rotorWiring.put("Q", "E");
        rotorWiring.put("R", "B");
        rotorWiring.put("S", "F");
        rotorWiring.put("T", "Z");
        rotorWiring.put("U", "C");
        rotorWiring.put("V", "W");
        rotorWiring.put("W", "V");
        rotorWiring.put("X", "J");
        rotorWiring.put("Y", "A");
        rotorWiring.put("Z", "T");

        int stepPoint = 0;

        int setPoint = 0;

        return new Rotor(rotorWiring, stepPoint, setPoint);
    }

    public static Rotor createReflectorC() {

        Map<String, String> rotorWiring = new LinkedHashMap<>();

        rotorWiring.put("A", "F");
        rotorWiring.put("B", "V");
        rotorWiring.put("C", "P");
        rotorWiring.put("D", "J");
        rotorWiring.put("E", "I");
        rotorWiring.put("F", "A");
        rotorWiring.put("G", "O");
        rotorWiring.put("H", "Y");
        rotorWiring.put("I", "E");
        rotorWiring.put("J", "D");
        rotorWiring.put("K", "R");
        rotorWiring.put("L", "Z");
        rotorWiring.put("M", "X");
        rotorWiring.put("N", "W");
        rotorWiring.put("O", "G");
        rotorWiring.put("P", "C");
        rotorWiring.put("Q", "T");
        rotorWiring.put("R", "K");
        rotorWiring.put("S", "U");
        rotorWiring.put("T", "Q");
        rotorWiring.put("U", "S");
        rotorWiring.put("V", "B");
        rotorWiring.put("W", "N");
        rotorWiring.put("X", "M");
        rotorWiring.put("Y", "H");
        rotorWiring.put("Z", "L");

        int stepPoint = 0;

        int setPoint = 0;

        return new Rotor(rotorWiring, stepPoint, setPoint);
    }
}
