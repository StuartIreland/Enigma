package com.isildursbaneuk;

import java.util.LinkedHashMap;
import java.util.Map;

public class RotorFactory {

    public static Rotor createRotorI() {

        Map<String, String> rotorWiring = new LinkedHashMap<>();
        String wiring = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
        for (int i = 0; i < 26; i++) {
            char inputChar = (char) ('A' + i);
            char outputChar = wiring.charAt(i);
            rotorWiring.put(String.valueOf(inputChar), String.valueOf(outputChar));
        }

        int stepPoint = 18;

        int setPoint = 0;

        return new Rotor(rotorWiring, stepPoint, setPoint);
    }

    public static Rotor createRotorII() {

        Map<String, String> rotorWiring = new LinkedHashMap<>();
        String wiring = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
        for (int i = 0; i < 26; i++) {
            char inputChar = (char) ('A' + i);
            char outputChar = wiring.charAt(i);
            rotorWiring.put(String.valueOf(inputChar), String.valueOf(outputChar));
        }

        int stepPoint = 6;

        int setPoint = 0;

        return new Rotor(rotorWiring, stepPoint, setPoint);
    }

    public static Rotor createRotorIII() {

        Map<String, String> rotorWiring = new LinkedHashMap<>();
        String wiring = "BDFHJLCPRTXVZNYEIWGAKMUSQO";
        for (int i = 0; i < 26; i++) {
            char inputChar = (char) ('A' + i);
            char outputChar = wiring.charAt(i);
            rotorWiring.put(String.valueOf(inputChar), String.valueOf(outputChar));
        }

        int stepPoint = 23;

        int setPoint = 0;

        return new Rotor(rotorWiring, stepPoint, setPoint);
    }

    public static Rotor createRotorIV() {

        Map<String, String> rotorWiring = new LinkedHashMap<>();
        String wiring = "ESOVPZJAYQUIRHXLNFTGKDCMWB";
        for (int i = 0; i < 26; i++) {
            char inputChar = (char) ('A' + i);
            char outputChar = wiring.charAt(i);
            rotorWiring.put(String.valueOf(inputChar), String.valueOf(outputChar));
        }

        int stepPoint = 11;

        int setPoint = 0;

        return new Rotor(rotorWiring, stepPoint, setPoint);
    }

    public static Rotor createRotorV() {

        Map<String, String> rotorWiring = new LinkedHashMap<>();
        String wiring = "VZBRGITYUPSDNHLXAWMJQOFECK";
        for (int i = 0; i < 26; i++) {
            char inputChar = (char) ('A' + i);
            char outputChar = wiring.charAt(i);
            rotorWiring.put(String.valueOf(inputChar), String.valueOf(outputChar));
        }

        int stepPoint = 27;

        int setPoint = 0;

        return new Rotor(rotorWiring, stepPoint, setPoint);
    }

    public static Rotor createReflectorA() {

        Map<String, String> rotorWiring = new LinkedHashMap<>();
        String wiring = "EJMZALYXVBWFCRQUONTSPIKHGD";
        for (int i = 0; i < 26; i++) {
            char inputChar = (char) ('A' + i);
            char outputChar = wiring.charAt(i);
            rotorWiring.put(String.valueOf(inputChar), String.valueOf(outputChar));
        }

        int stepPoint = 0;

        int setPoint = 0;

        return new Rotor(rotorWiring, stepPoint, setPoint);
    }

    public static Rotor createReflectorB() {

        Map<String, String> rotorWiring = new LinkedHashMap<>();
        String wiring = "YRUHQSLDPXNGOKMIEBFZCWVJAT";
        for (int i = 0; i < 26; i++) {
            char inputChar = (char) ('A' + i);
            char outputChar = wiring.charAt(i);
            rotorWiring.put(String.valueOf(inputChar), String.valueOf(outputChar));
        }

        int stepPoint = 0;

        int setPoint = 0;

        return new Rotor(rotorWiring, stepPoint, setPoint);
    }

    public static Rotor createReflectorC() {

        Map<String, String> rotorWiring = new LinkedHashMap<>();
        String wiring = "FVPJIAOYEDRZXWGCTKUQSBNMHL";
        for (int i = 0; i < 26; i++) {
            char inputChar = (char) ('A' + i);
            char outputChar = wiring.charAt(i);
            rotorWiring.put(String.valueOf(inputChar), String.valueOf(outputChar));
        }

        int stepPoint = 0;

        int setPoint = 0;

        return new Rotor(rotorWiring, stepPoint, setPoint);
    }
}
