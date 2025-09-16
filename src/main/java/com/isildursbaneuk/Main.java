package com.isildursbaneuk;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 * Main Enigma Program
 *
 */
public class Main {

    private static EnigmaMachine em;
    private static Scanner scanner;

    public static void main( String[] args ) {
        em = new EnigmaMachine();

        scanner = new Scanner(System.in);

        String interfaceToUse;
        while (true) {
            System.out.println();
            System.out.print("Do you wish to use the CLI (1) or GUI (2): ");
            interfaceToUse = scanner.nextLine().trim();
            if (!interfaceToUse.matches("[1-2]")) {
                System.out.println("Invalid input. Please enter a single number 1 or 2.");
                continue;
            }

            if (interfaceToUse.equalsIgnoreCase("1")) {
                EnigmaCLI.createAndShowCLI(scanner, em);
            } else {
                SwingUtilities.invokeLater(() -> EnigmaGUI.createAndShowGUI(em));
            }

            break;
        }
    }
}
