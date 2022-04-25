package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void radioIsAtTheMaximumStationAndTheUserPressesTheNextButton() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void radioIsAtTheMinimumStationAndTheUserPressesTheNextButton() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.nextRadioStation();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void radioIsAtTheMinimumStationAndTheUserPressesThePreviousButton() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void RadioStationNumberIsOneAndTheUserPressesThePrevious() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.prevRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void radioIsAtTheMaximumStationAndTheUserPressesThePreviousButton() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.prevRadioStation();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void userEntersStationGreaterThanTheMaximum() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void userEntersStationLessThanTheMinimum() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void userEntersStationEqualToTheMinimum() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void userEntersStationEqualToTheMaximum() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void soundIsAtItsMaximumValueAndTheUserPressesIncrease() {
        Radio radio = new Radio();
        radio.setSoundVolume(10);
        radio.increaseSoundVolume();
        int expected = 10;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void soundIsAtItsMinimumValueAndTheUserPressesIncrease() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.increaseSoundVolume();
        int expected = 1;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void soundLevelIsLessThanTheMaximumAndTheUserPressedIncreaseButton() {
        Radio radio = new Radio();
        radio.setSoundVolume(9);
        radio.increaseSoundVolume();
        int expected = 10;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void SoundLevelIsAtTheMinimumValueAndTheUserPressesToDecrease() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.decreaseSoundVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void SoundLevelGreaterThanTheMinimumAndTheUserPressedTheDecreaseButton() {
        Radio radio = new Radio();
        radio.setSoundVolume(1);
        radio.decreaseSoundVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void SoundLevelIsAtTheMaximumValueAndTheUserPressesToDecrease() {
        Radio radio = new Radio();
        radio.setSoundVolume(10);
        radio.decreaseSoundVolume();
        int expected = 9;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void userSetsTheVolumeHigherThanTheMaximum() {
        Radio radio = new Radio();
        radio.setSoundVolume(11);
        int expected = 10;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void userSetsTheVolumeToLessThanTheMinimum() {
        Radio radio = new Radio();
        radio.setSoundVolume(-1);
        int expected = 0;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void userSetsTheVolumeToLessThanTheMaximum() {
        Radio radio = new Radio();
        radio.setSoundVolume(9);
        int expected = 9;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }
}

