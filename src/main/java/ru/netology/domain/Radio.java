package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int soundVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;

    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void increaseSoundVolume() {
        if (soundVolume >= 10) {
            soundVolume = 10;
        } else {
            soundVolume = soundVolume + 1;
        }
    }

    public void decreaseSoundVolume() {
        if (soundVolume <= 0) {
            soundVolume = 0;
        } else {
            soundVolume = soundVolume - 1;
        }
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume > 10) {
            soundVolume = 10;
        }
        this.soundVolume = soundVolume;

    }
}




