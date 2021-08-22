package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationCount = 10;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int stationCount) {
        this.stationCount = stationCount;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > stationCount - 1) {
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
        if (currentStation == stationCount - 1) {
            currentStation = 0;
            return;
        }
        currentStation++;
    }

    public void switchStationPrev() {
        if (currentStation == 0) {
            currentStation = stationCount - 1;
            return;
        }
        currentStation = currentStation - 1;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }

    }

}
