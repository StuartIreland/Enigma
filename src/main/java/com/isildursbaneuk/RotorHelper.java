package com.isildursbaneuk;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RotorHelper {

    Map<Integer, String> letterMapping = new LinkedHashMap<>();
    private final List<String> letterList;

    public RotorHelper() {
        letterMapping.put(0, "A");
        letterMapping.put(1, "B");
        letterMapping.put(2, "C");
        letterMapping.put(3, "D");
        letterMapping.put(4, "E");
        letterMapping.put(5, "F");
        letterMapping.put(6, "G");
        letterMapping.put(7, "H");
        letterMapping.put(8, "I");
        letterMapping.put(9, "J");
        letterMapping.put(10, "K");
        letterMapping.put(11, "L");
        letterMapping.put(12, "M");
        letterMapping.put(13, "N");
        letterMapping.put(14, "O");
        letterMapping.put(15, "P");
        letterMapping.put(16, "Q");
        letterMapping.put(17, "R");
        letterMapping.put(18, "S");
        letterMapping.put(19, "T");
        letterMapping.put(20, "U");
        letterMapping.put(21, "V");
        letterMapping.put(22, "W");
        letterMapping.put(23, "X");
        letterMapping.put(24, "Y");
        letterMapping.put(25, "Z");

        letterList = new ArrayList<>(letterMapping.values());
    }

    public String getLetterXStepsAhead(String letter, int steps) {
        int currentIndex = letterList.indexOf(letter.toUpperCase());

        if (currentIndex == -1) {
            throw new IllegalArgumentException("Letter '" + letter + "' not found in mapping.");
        }

        int thingy = currentIndex + steps;
        if (thingy < 0) {
            thingy = 26 + steps + currentIndex;
        }

        int newIndex = (thingy) % letterList.size();

        return letterList.get(newIndex);
    }

}
