package com.isildursbaneuk;

import javax.swing.*;
import java.awt.*;

public class EnigmaGUI {

    private EnigmaMachine em;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EnigmaGUI().createAndShowGUI());
    }

    private void createAndShowGUI() {
        initEnigma();

        JFrame frame = new JFrame("Enigma Machine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Input Field
        JTextField input = new JTextField();
        frame.add(input, BorderLayout.NORTH);

        // Output area
        JTextArea output = new JTextArea(5, 30);
        output.setEditable(false);
        frame.add(new JScrollPane(output), BorderLayout.CENTER);

        // Encode button
        JButton encodeBtn = new JButton("Encode");
        encodeBtn.addActionListener(e -> {
            String text = input.getText().toUpperCase();
            String result = em.typeMessage(text);
            output.setText(result);
        });
        frame.add(encodeBtn, BorderLayout.SOUTH);

        frame.pack();
        frame.setLocationRelativeTo(null); // center on screen
        frame.setVisible(true);
    }

    private void initEnigma() {
        em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorB());
    }
}
