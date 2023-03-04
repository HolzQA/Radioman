package ru.netology;


import netology.ru.Radiostation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
        @CsvSource({
                "0,10",
                "100,100"
        })
    public void testSetQuantityOfRadiostation(int newQuant, int expected) {
        Radiostation radio = new Radiostation(newQuant);

       Assertions.assertEquals(expected, radio.getQuantityOfRadiostations());
    }

    @ParameterizedTest
        @CsvSource({
                 "9,0",
                 "3,4"
        })
    public void testSetNextRadioctation(int curNum, int expected) {
        Radiostation radio = new Radiostation();

        radio.setCurrentRadiostation(curNum);

        radio.setNextRadiostation();

        Assertions.assertEquals(expected, radio.getCurrentRadiostation());
    }

    @ParameterizedTest
    @CsvSource({
            "0,9",
            "5,4"
    })
    public void testSetPrevRadioctation(int curNum, int expected) {
        Radiostation radio = new Radiostation();

        radio.setCurrentRadiostation(curNum);

        radio.setPrevRadiostation();

        Assertions.assertEquals(expected, radio.getCurrentRadiostation());
    }

    @ParameterizedTest
    @CsvSource({
            "-1,0",
            "3,3",
            "10,0"
    })
    public void testSetRadiostation(int insert, int expected) {
        Radiostation radio = new Radiostation();

        radio.setCurrentRadiostation(insert);

        Assertions.assertEquals(expected, radio.getCurrentRadiostation());
    }

    @ParameterizedTest
    @CsvSource({
            "100,100",
            "3,4"
    })
    public void testSetNextVolume(int curVol, int expected) {
        Radiostation radio = new Radiostation();

        radio.setCurrentVolume(curVol);

        radio.setNextVolume();

        Assertions.assertEquals(expected, radio.getCurrentVolume());

    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "5,4"
    })
    public void testSetPrevVolume(int curVol, int expected) {
        Radiostation radio = new Radiostation();

        radio.setCurrentVolume(curVol);

        radio.setPrevVolume();

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource({
            "-1,0",
            "5,5",
            "101,0"
    })
    public void testSetVolume(int insert, int expected) {
        Radiostation radio = new Radiostation();

        radio.setCurrentVolume(insert);

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }
}
