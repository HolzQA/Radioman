package ru.netology;


import netology.ru.Radiostation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    @ParameterizedTest
        @CsvSource({
                 "9,0",
                 "3,4"
        })
    public void testSetNextRadioctation(int curNum, int expexted) {
        Radiostation radio = new Radiostation();

        radio.setRadiostation(curNum);

        radio.setNextRadiostation();

        Assertions.assertEquals(expexted, radio.getCurrentRadiostation());
    }

    @ParameterizedTest
    @CsvSource({
            "0,9",
            "5,4"
    })
    public void testSetPrevRadioctation(int curNum, int expexted) {
        Radiostation radio = new Radiostation();

        radio.setRadiostation(curNum);

        radio.setPrevRadiostation();

        Assertions.assertEquals(expexted, radio.getCurrentRadiostation());
    }

    @ParameterizedTest
    @CsvSource({
            "-1,0",
            "3,3",
            "10,0"
    })
    public void testSetRadiostation(int insert, int expected) {
        Radiostation radio = new Radiostation();

        radio.setRadiostation(insert);

        Assertions.assertEquals(expected, radio.getCurrentRadiostation());
    }

    @ParameterizedTest
    @CsvSource({
            "10,0",
            "3,4"
    })
    public void testSetNextVolume(int curVol, int expexted) {
        Radiostation radio = new Radiostation();

        radio.setNextVolume(curVol);

        Assertions.assertEquals(expexted, radio.getCurrentVolume());

    }

    @ParameterizedTest
    @CsvSource({
            "0,10",
            "5,4"
    })
    public void testSetPrevVolume(int curVol, int expexted) {
        Radiostation radio = new Radiostation();

        radio.setPrevVolume(curVol);

        Assertions.assertEquals(expexted, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource({
            "-1,0",
            "3,3",
            "11,0"
    })
    public void testSetVolume(int insert, int expected) {
        Radiostation radio = new Radiostation();

        radio.setVolume(insert);

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }
}
