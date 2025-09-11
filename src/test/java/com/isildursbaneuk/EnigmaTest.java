package com.isildursbaneuk;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EnigmaTest {

    @Test
    public void testEnigmaPressKey() {

        EnigmaMachine em = new EnigmaMachine();

        assertEquals(0, em.convertLetterToNumber("Q"));
        assertEquals(8, em.convertLetterToNumber("O"));

        assertEquals(9, em.convertLetterToNumber("A"));
        assertEquals(16, em.convertLetterToNumber("K"));

        assertEquals(17, em.convertLetterToNumber("P"));
        assertEquals(25, em.convertLetterToNumber("L"));
    }

    @Test
    public void testEnigmaDisplayKey() {

        EnigmaMachine em = new EnigmaMachine();

        assertEquals("Q", em.convertNumberToLetter(0));
        assertEquals("O", em.convertNumberToLetter(8));

        assertEquals("A", em.convertNumberToLetter(9));
        assertEquals("K", em.convertNumberToLetter(16));

        assertEquals("P", em.convertNumberToLetter(17));
        assertEquals("L", em.convertNumberToLetter(25));
    }

    @Test
    public void testEnigmaWithKeyboardAndDisplay() {

        EnigmaMachine em = new EnigmaMachine();

        assertEquals("HELLOWORLD", em.typeMessage("HELLOWORLD"));
    }

    @Test
    public void testEnigmaSimplestSetup() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("BDZGO", em.typeMessage("AAAAA"));
    }

    @Test
    public void testEnigmaChangeInitialPositions() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(4, 0);
        em.setInitialRotorPosition(2, 1);
        em.setInitialRotorPosition(3, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("ZIVGM", em.typeMessage("AAAAA"));
    }

    @Test
    public void testEnigmaChangeRotorOrder() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());
        em.getRotorsInUse().add(em.getRotorI());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("XOGLH", em.typeMessage("AAAAA"));
    }

    @Test
    public void testEnigmaChangeInitialPositionsAndRotorOrder() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());
        em.getRotorsInUse().add(em.getRotorI());

        em.setInitialRotorPosition(5, 0);
        em.setInitialRotorPosition(7, 1);
        em.setInitialRotorPosition(10, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("HOXVI", em.typeMessage("AAAAA"));
    }

    @Test
    public void testEnigmaNoPlugboardOneRotorInitialPosition0() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("BDZGOWCXLTKSBTMCDLPBMUQOFXY", em.typeMessage("AAAAAAAAAAAAAAAAAAAAAAAAAAA"));
    }

    @Test
    public void testEnigmaNoPlugboardOneRotorInitialPosition1() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(1, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("DZGOWCXLTKSBTMCDLPBMUQOFXYH", em.typeMessage("AAAAAAAAAAAAAAAAAAAAAAAAAAA"));
    }

    @Test
    public void testEnigmaNoPlugboardOneRotorInitialPosition2() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(2, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("ZGOWCXLTKSBTMCDLPBMUQOFXYHC", em.typeMessage("AAAAAAAAAAAAAAAAAAAAAAAAAAA"));
    }

    @Test
    public void testEnigmaNoPlugboardOneRotorInitialPosition3() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(3, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("GOWCXLTKSBTMCDLPBMUQOFXYHCX", em.typeMessage("AAAAAAAAAAAAAAAAAAAAAAAAAAA"));
    }

    @Test
    public void testEnigmaNoPlugboardOneRotorInitialPosition10() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(10, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("KSBTMCDLPBMUQOFXYHCXTGYJFLI", em.typeMessage("AAAAAAAAAAAAAAAAAAAAAAAAAAA"));
    }

    @Test
    public void testEnigmaNoPlugboardOneRotorInitialPosition0x0x25() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(25, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("UBDZGOWCXLTKSBTMCDLPBMUQOFX", em.typeMessage("AAAAAAAAAAAAAAAAAAAAAAAAAAA"));
    }

    @Test
    public void testEnigmaNoPlugboardOneRotorInitialPosition0x1x25() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(1, 1);
        em.setInitialRotorPosition(25, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("XYHCXTGYJFLINHNXSHIUNTHEORX", em.typeMessage("AAAAAAAAAAAAAAAAAAAAAAAAAAA"));
    }

    @Test
    public void testEnigmaNoPlugboardOneRotorInitialPosition26() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(26, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("BDZGOWCXLTKSBTMCDLPBMUQOFXY", em.typeMessage("AAAAAAAAAAAAAAAAAAAAAAAAAAA"));
    }

    @Test
    public void testEnigmaNoPlugboardOneRotorInitialPosition51() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(51, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("UBDZGOWCXLTKSBTMCDLPBMUQOFX", em.typeMessage("AAAAAAAAAAAAAAAAAAAAAAAAAAA"));
    }

    @Test
    public void testEnigmaNoPlugboardOneRotorInitialPosition52() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(52, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("BDZGOWCXLTKSBTMCDLPBMUQOFXY", em.typeMessage("AAAAAAAAAAAAAAAAAAAAAAAAAAA"));
    }

    @Test
    public void testEnigmaNoPlugboardTwoRotorSInitialPosition00AAAsEncryption() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("BDZ", em.typeMessage("AAA"));
    }

    @Test
    public void testRotorHelperAPlus1Step() {

        RotorHelper rh = new RotorHelper();

        String newLetter = rh.getLetterXStepsAhead("A",1);

        assertEquals("B", newLetter);
    }

    @Test
    public void testRotorHelperAPlus25Step() {

        RotorHelper rh = new RotorHelper();

        String newLetter = rh.getLetterXStepsAhead("A",3);

        assertEquals("D", newLetter);
    }

    @Test
    public void testEnigmaNoPlugboardOneRotorInitialPosition0x() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0); // 18
        em.setInitialRotorPosition(0, 1); // 6
        em.setInitialRotorPosition(20, 2); // 23

        em.setReflector(em.getReflectorB());

        assertEquals("MUQOFXY", em.typeMessage("AAAAAAA"));
    }

    @Test
    public void testEnigmaNoPlugboardOneRotorInitialPosition0y() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0); // 18
        em.setInitialRotorPosition(0, 1); // 6
        em.setInitialRotorPosition(1, 2); // 23

        em.setReflector(em.getReflectorB());

        assertEquals("DZGO", em.typeMessage("AAAA"));
    }

    @Test
    public void testEnigmaPlugboardAndOneRotorAAAAAAEncryption() {

        EnigmaMachine em = new EnigmaMachine();
        em.addToPlugboardSettingsMap("A", "Q");
        em.addToPlugboardSettingsMap("B", "S");
        em.addToPlugboardSettingsMap("C", "G");
        em.addToPlugboardSettingsMap("D", "T");
        em.addToPlugboardSettingsMap("E", "J");
        em.addToPlugboardSettingsMap("K", "W");
        em.addToPlugboardSettingsMap("M", "N");
        em.addToPlugboardSettingsMap("O", "P");
        em.addToPlugboardSettingsMap("R", "Y");
        em.addToPlugboardSettingsMap("X", "U");

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("GMVIKF", em.typeMessage("AAAAAA"));
    }

    @Test
    public void testEnigmaPlugboardAndOneRotorABCDEFEncryption() {

        EnigmaMachine em = new EnigmaMachine();
        em.addToPlugboardSettingsMap("A", "Q");
        em.addToPlugboardSettingsMap("B", "S");
        em.addToPlugboardSettingsMap("C", "G");
        em.addToPlugboardSettingsMap("D", "T");
        em.addToPlugboardSettingsMap("E", "J");
        em.addToPlugboardSettingsMap("K", "W");
        em.addToPlugboardSettingsMap("M", "N");
        em.addToPlugboardSettingsMap("O", "P");
        em.addToPlugboardSettingsMap("R", "Y");
        em.addToPlugboardSettingsMap("X", "U");

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("GUIFOA", em.typeMessage("ABCDEF"));
    }

    @Test
    public void testEnigmaPlugboardAndOneRotorAlphabetEncryption() {

        EnigmaMachine em = new EnigmaMachine();
        em.addToPlugboardSettingsMap("A", "Q");
        em.addToPlugboardSettingsMap("B", "S");
        em.addToPlugboardSettingsMap("C", "G");
        em.addToPlugboardSettingsMap("D", "T");
        em.addToPlugboardSettingsMap("E", "J");
        em.addToPlugboardSettingsMap("K", "W");
        em.addToPlugboardSettingsMap("M", "N");
        em.addToPlugboardSettingsMap("O", "P");
        em.addToPlugboardSettingsMap("R", "Y");
        em.addToPlugboardSettingsMap("X", "U");

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("GUIFOAQVEGGYDYTVTGXCAMYIPJ", em.typeMessage("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    public void testEnigmaPlugboardAndRotorOneTwoThreeAndReflectorBHelloWorldEncryption() {

        EnigmaMachine em = new EnigmaMachine();
        em.addToPlugboardSettingsMap("A", "Q");
        em.addToPlugboardSettingsMap("B", "S");
        em.addToPlugboardSettingsMap("C", "G");
        em.addToPlugboardSettingsMap("D", "T");
        em.addToPlugboardSettingsMap("E", "J");
        em.addToPlugboardSettingsMap("K", "W");
        em.addToPlugboardSettingsMap("M", "N");
        em.addToPlugboardSettingsMap("O", "P");
        em.addToPlugboardSettingsMap("R", "Y");
        em.addToPlugboardSettingsMap("X", "U");

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("ISSTEPIJQQ", em.typeMessage("HELLOWORLD"));
    }

    @Test
    public void testEnigmaPlugboardAndRotorOneTwoThreeAndReflectorCHelloWorldEncryption() {

        EnigmaMachine em = new EnigmaMachine();
        em.addToPlugboardSettingsMap("A", "Q");
        em.addToPlugboardSettingsMap("B", "S");
        em.addToPlugboardSettingsMap("C", "G");
        em.addToPlugboardSettingsMap("D", "T");
        em.addToPlugboardSettingsMap("E", "J");
        em.addToPlugboardSettingsMap("K", "W");
        em.addToPlugboardSettingsMap("M", "N");
        em.addToPlugboardSettingsMap("O", "P");
        em.addToPlugboardSettingsMap("R", "Y");
        em.addToPlugboardSettingsMap("X", "U");

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorC());

        assertEquals("UQVKTHZWHW", em.typeMessage("HELLOWORLD"));
    }

    @Test
    public void testEnigmaPlugboardAndOneRotorHelloWorldDecryption() {

        EnigmaMachine em = new EnigmaMachine();
        em.addToPlugboardSettingsMap("A", "Q");
        em.addToPlugboardSettingsMap("B", "S");
        em.addToPlugboardSettingsMap("C", "G");
        em.addToPlugboardSettingsMap("D", "T");
        em.addToPlugboardSettingsMap("E", "J");
        em.addToPlugboardSettingsMap("K", "W");
        em.addToPlugboardSettingsMap("M", "N");
        em.addToPlugboardSettingsMap("O", "P");
        em.addToPlugboardSettingsMap("R", "Y");
        em.addToPlugboardSettingsMap("X", "U");

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("HELLOWORLD", em.typeMessage("ISSTEPIJQQ"));
    }

    @Test
    public void testEnigmaPlugboardAndRotorThreeTwoOneAndReflectorBHelloWorldEncryption() {

        EnigmaMachine em = new EnigmaMachine();
        em.addToPlugboardSettingsMap("A", "Q");
        em.addToPlugboardSettingsMap("B", "S");
        em.addToPlugboardSettingsMap("C", "G");
        em.addToPlugboardSettingsMap("D", "T");
        em.addToPlugboardSettingsMap("E", "J");
        em.addToPlugboardSettingsMap("K", "W");
        em.addToPlugboardSettingsMap("M", "N");
        em.addToPlugboardSettingsMap("O", "P");
        em.addToPlugboardSettingsMap("R", "Y");
        em.addToPlugboardSettingsMap("X", "U");

        em.getRotorsInUse().add(em.getRotorIII());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorI());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("NWMGJNYAZA", em.typeMessage("HELLOWORLD"));
    }

    @Test
    public void testEnigmaDiffPlugboardAndRotorThreeTwoOneAndReflectorBHelloWorldEncryption() {

        EnigmaMachine em = new EnigmaMachine();
        em.addToPlugboardSettingsMap("A", "A");
        em.addToPlugboardSettingsMap("B", "B");
        em.addToPlugboardSettingsMap("C", "C");
        em.addToPlugboardSettingsMap("D", "D");
        em.addToPlugboardSettingsMap("E", "E");
        em.addToPlugboardSettingsMap("F", "F");
        em.addToPlugboardSettingsMap("G", "G");
        em.addToPlugboardSettingsMap("H", "H");
        em.addToPlugboardSettingsMap("I", "I");
        em.addToPlugboardSettingsMap("J", "J");
        em.addToPlugboardSettingsMap("K", "K");
        em.addToPlugboardSettingsMap("L", "L");
        em.addToPlugboardSettingsMap("M", "M");
        em.addToPlugboardSettingsMap("N", "N");
        em.addToPlugboardSettingsMap("O", "O");
        em.addToPlugboardSettingsMap("P", "P");
        em.addToPlugboardSettingsMap("Q", "Q");
        em.addToPlugboardSettingsMap("R", "R");
        em.addToPlugboardSettingsMap("S", "S");
        em.addToPlugboardSettingsMap("T", "T");
        em.addToPlugboardSettingsMap("U", "U");
        em.addToPlugboardSettingsMap("V", "V");
        em.addToPlugboardSettingsMap("W", "W");
        em.addToPlugboardSettingsMap("X", "X");
        em.addToPlugboardSettingsMap("Y", "Y");
        em.addToPlugboardSettingsMap("Z", "Z");

        em.getRotorsInUse().add(em.getRotorIII());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorI());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("MFNCZBBFZM", em.typeMessage("HELLOWORLD"));
    }

    @Test
    public void testEnigmaNoPlugboardAndRotorThreeTwoOneAndReflectorBHelloWorldEncryption() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorIII());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorI());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("MFNCZBBFZM", em.typeMessage("HELLOWORLD"));
    }

    @Test
    public void testEnigmaPlugboardAndOneRotor25AsEncryption() {

        EnigmaMachine em = new EnigmaMachine();
        em.addToPlugboardSettingsMap("A", "Q");
        em.addToPlugboardSettingsMap("B", "S");
        em.addToPlugboardSettingsMap("C", "G");
        em.addToPlugboardSettingsMap("D", "T");
        em.addToPlugboardSettingsMap("E", "J");
        em.addToPlugboardSettingsMap("K", "W");
        em.addToPlugboardSettingsMap("M", "N");
        em.addToPlugboardSettingsMap("O", "P");
        em.addToPlugboardSettingsMap("R", "Y");
        em.addToPlugboardSettingsMap("X", "U");

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("GMVIKFKPUFOKGIWRUHKHUYQMO", em.typeMessage("AAAAAAAAAAAAAAAAAAAAAAAAA"));
    }

    @Test
    public void testEnigmaPlugboardAndOneRotor26AsEncryption() {

        EnigmaMachine em = new EnigmaMachine();
        em.addToPlugboardSettingsMap("A", "Q");
        em.addToPlugboardSettingsMap("B", "S");
        em.addToPlugboardSettingsMap("C", "G");
        em.addToPlugboardSettingsMap("D", "T");
        em.addToPlugboardSettingsMap("E", "J");
        em.addToPlugboardSettingsMap("K", "W");
        em.addToPlugboardSettingsMap("M", "N");
        em.addToPlugboardSettingsMap("O", "P");
        em.addToPlugboardSettingsMap("R", "Y");
        em.addToPlugboardSettingsMap("X", "U");

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("GMVIKFKPUFOKGIWRUHKHUYQMOO", em.typeMessage("AAAAAAAAAAAAAAAAAAAAAAAAAA"));
    }

    @Test
    public void testEnigmaPlugboardAndOneRotor27AsEncryption() {

        EnigmaMachine em = new EnigmaMachine();
        em.addToPlugboardSettingsMap("A", "Q");
        em.addToPlugboardSettingsMap("B", "S");
        em.addToPlugboardSettingsMap("C", "G");
        em.addToPlugboardSettingsMap("D", "T");
        em.addToPlugboardSettingsMap("E", "J");
        em.addToPlugboardSettingsMap("K", "W");
        em.addToPlugboardSettingsMap("M", "N");
        em.addToPlugboardSettingsMap("O", "P");
        em.addToPlugboardSettingsMap("R", "Y");
        em.addToPlugboardSettingsMap("X", "U");

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("GMVIKFKPUFOKGIWRUHKHUYQMOOH", em.typeMessage("AAAAAAAAAAAAAAAAAAAAAAAAAAA"));
    }

    @Test
    public void testRotorIHas26UniqueLetters() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        Rotor rotorI = em.getRotorsInUse().get(0);

        assertEquals(26, rotorI.getRotorTranslationMap().size());

        Map<String, String> rtm = rotorI.getRotorTranslationMap();

        for (char c = 'A'; c <= 'Z'; c++) {
            assertTrue(rtm.containsKey(String.valueOf(c)), "Missing letter in rotorTranslation: " + c);
        }
        assertEquals("E", rtm.get("A"));
        assertEquals("J", rtm.get("Z"));
        assertEquals(18, rotorI.getStepPoint());
    }

    @Test
    public void testRotorIIHas26UniqueLetters() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        Rotor rotorII = em.getRotorsInUse().get(1);

        assertEquals(26, rotorII.getRotorTranslationMap().size());

        Map<String, String> rtm = rotorII.getRotorTranslationMap();

        for (char c = 'A'; c <= 'Z'; c++) {
            assertTrue(rtm.containsKey(String.valueOf(c)), "Missing letter in rotorTranslation: " + c);
        }
        assertEquals("A", rtm.get("A"));
        assertEquals("E", rtm.get("Z"));
        assertEquals(6, rotorII.getStepPoint());
    }

    @Test
    public void testRotorIIIHas26UniqueLetters() {

        EnigmaMachine em = new EnigmaMachine();

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIII());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        Rotor rotorIII = em.getRotorsInUse().get(2);

        assertEquals(26, rotorIII.getRotorTranslationMap().size());

        Map<String, String> rtm = rotorIII.getRotorTranslationMap();

        for (char c = 'A'; c <= 'Z'; c++) {
            assertTrue(rtm.containsKey(String.valueOf(c)), "Missing letter in rotorTranslation: " + c);
        }
        assertEquals("B", rtm.get("A"));
        assertEquals("O", rtm.get("Z"));
        assertEquals(23, rotorIII.getStepPoint());
    }

    @Test
    public void testEnigmaPlugboardAndRotorOneTwoFourAndReflectorBHelloWorldEncryption() {

        EnigmaMachine em = new EnigmaMachine();
        em.addToPlugboardSettingsMap("A", "Q");
        em.addToPlugboardSettingsMap("B", "S");
        em.addToPlugboardSettingsMap("C", "G");
        em.addToPlugboardSettingsMap("D", "T");
        em.addToPlugboardSettingsMap("E", "J");
        em.addToPlugboardSettingsMap("K", "W");
        em.addToPlugboardSettingsMap("M", "N");
        em.addToPlugboardSettingsMap("O", "P");
        em.addToPlugboardSettingsMap("R", "Y");
        em.addToPlugboardSettingsMap("X", "U");

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorIV());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("SNHBTXEDEZ", em.typeMessage("HELLOWORLD"));
    }

    @Test
    public void testEnigmaPlugboardAndRotorOneTwoFiveAndReflectorBHelloWorldEncryption() {

        EnigmaMachine em = new EnigmaMachine();
        em.addToPlugboardSettingsMap("A", "Q");
        em.addToPlugboardSettingsMap("B", "S");
        em.addToPlugboardSettingsMap("C", "G");
        em.addToPlugboardSettingsMap("D", "T");
        em.addToPlugboardSettingsMap("E", "J");
        em.addToPlugboardSettingsMap("K", "W");
        em.addToPlugboardSettingsMap("M", "N");
        em.addToPlugboardSettingsMap("O", "P");
        em.addToPlugboardSettingsMap("R", "Y");
        em.addToPlugboardSettingsMap("X", "U");

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorII());
        em.getRotorsInUse().add(em.getRotorV());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("TACOYEPUJV", em.typeMessage("HELLOWORLD"));
    }

    @Test
    public void testEnigmaPlugboardAndRotorOneFourFiveAndReflectorBHelloWorldEncryption() {

        EnigmaMachine em = new EnigmaMachine();
        em.addToPlugboardSettingsMap("A", "Q");
        em.addToPlugboardSettingsMap("B", "S");
        em.addToPlugboardSettingsMap("C", "G");
        em.addToPlugboardSettingsMap("D", "T");
        em.addToPlugboardSettingsMap("E", "J");
        em.addToPlugboardSettingsMap("K", "W");
        em.addToPlugboardSettingsMap("M", "N");
        em.addToPlugboardSettingsMap("O", "P");
        em.addToPlugboardSettingsMap("R", "Y");
        em.addToPlugboardSettingsMap("X", "U");

        em.getRotorsInUse().add(em.getRotorI());
        em.getRotorsInUse().add(em.getRotorIV());
        em.getRotorsInUse().add(em.getRotorV());

        em.setInitialRotorPosition(0, 0);
        em.setInitialRotorPosition(0, 1);
        em.setInitialRotorPosition(0, 2);

        em.setReflector(em.getReflectorB());

        assertEquals("VMCSVADZIF", em.typeMessage("HELLOWORLD"));
    }

}
