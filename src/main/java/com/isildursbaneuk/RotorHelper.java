package com.isildursbaneuk;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RotorHelper {

    Map<Integer, String> letterMapping = new LinkedHashMap<>();
    private final List<String> letterList;

    public RotorHelper() {
        for (int i = 0; i < 26; i++) {
            letterMapping.put(i, String.valueOf((char) ('A' + i)));
        }

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
