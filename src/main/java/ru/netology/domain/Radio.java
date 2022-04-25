package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int soundVolume;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;

    public Radio(int numberOfRadioStations) {
        this.maxRadioStation = numberOfRadioStations - 1;
    }

    public Radio() {
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation >= maxRadioStation) {
            currentRadioStation = minRadioStation;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;

    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void increaseSoundVolume() {
        if (soundVolume >= maxSoundVolume) {
            soundVolume = maxSoundVolume;
        } else {
            soundVolume = soundVolume + 1;
        }
    }

    public void decreaseSoundVolume() {
        if (soundVolume <= minSoundVolume) {
            soundVolume = minSoundVolume;
        } else {
            soundVolume = soundVolume - 1;
        }
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < minSoundVolume) {
            return;
        }
        if (soundVolume > maxSoundVolume) {
            soundVolume = maxSoundVolume;
        }
        this.soundVolume = soundVolume;

    }
}




