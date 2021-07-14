package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void switchStationNext() {
        if (currentStation == 9) {
            currentStation = 0;
            return;
        }
        currentStation++;
    }

    public void switchStationPrev() {
        if (currentStation == 0) {
            currentStation = 9;
            return;
        }
        currentStation = currentStation - 1;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }

    }

}
