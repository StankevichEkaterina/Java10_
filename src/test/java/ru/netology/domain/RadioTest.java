package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(10);
    Radio radioTwo = new Radio();

    @Test
    public void radioIsAtTheMaximumStationAndTheUserPressesTheNextButton() {
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void radioIsAtTheMinimumStationAndTheUserPressesTheNextButton() {
        radio.setCurrentRadioStation(0);
        radio.nextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void radioIsAtTheMinimumStationAndTheUserPressesThePreviousButton() {
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void RadioStationNumberIsOneAndTheUserPressesThePrevious() {
        radio.setCurrentRadioStation(1);
        radio.prevRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void radioIsAtTheMaximumStationAndTheUserPressesThePreviousButton() {
        radio.setCurrentRadioStation(9);
        radio.prevRadioStation();
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void userEntersStationGreaterThanTheMaximum() {
        radioTwo.setCurrentRadioStation(10);
        assertEquals(0, radioTwo.getCurrentRadioStation());
    }

    @Test
    public void userEntersStationLessThanTheMinimum() {
        radioTwo.setCurrentRadioStation(-1);
        assertEquals(0, radioTwo.getCurrentRadioStation());
    }

    @Test
    public void userEntersStationEqualToTheMinimum() {
        radioTwo.setCurrentRadioStation(0);
        assertEquals(0, radioTwo.getCurrentRadioStation());
    }

    @Test
    public void userEntersStationEqualToTheMaximum() {
        radioTwo.setCurrentRadioStation(9);
        assertEquals(9, radioTwo.getCurrentRadioStation());
    }

    @Test
    public void soundIsAtItsMaximumValueAndTheUserPressesIncrease() {
        radio.setSoundVolume(100);
        radio.increaseSoundVolume();
        assertEquals(100, radio.getSoundVolume());
    }

    @Test
    public void soundIsAtItsMinimumValueAndTheUserPressesIncrease() {
        radio.setSoundVolume(0);
        radio.increaseSoundVolume();
        assertEquals(1, radio.getSoundVolume());
    }

    @Test
    public void soundLevelIsLessThanTheMaximumAndTheUserPressedIncreaseButton() {
        radio.setSoundVolume(99);
        radio.increaseSoundVolume();
        assertEquals(100, radio.getSoundVolume());
    }

    @Test
    public void SoundLevelIsAtTheMinimumValueAndTheUserPressesToDecrease() {
        radio.setSoundVolume(0);
        radio.decreaseSoundVolume();
        assertEquals(0, radio.getSoundVolume());
    }

    @Test
    public void SoundLevelGreaterThanTheMinimumAndTheUserPressedTheDecreaseButton() {
        radio.setSoundVolume(1);
        radio.decreaseSoundVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void SoundLevelIsAtTheMaximumValueAndTheUserPressesToDecrease() {
        radio.setSoundVolume(100);
        radio.decreaseSoundVolume();
        assertEquals(99, radio.getSoundVolume());
    }

    @Test
    public void userSetsTheVolumeHigherThanTheMaximum() {
        radio.setSoundVolume(101);
        assertEquals(100, radio.getSoundVolume());
    }

    @Test
    public void userSetsTheVolumeToLessThanTheMinimum() {
        radio.setSoundVolume(-1);
        int expected = 0;
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void userSetsTheVolumeToLessThanTheMaximum() {
        radio.setSoundVolume(99);
        assertEquals(99, radio.getSoundVolume());
    }
}

