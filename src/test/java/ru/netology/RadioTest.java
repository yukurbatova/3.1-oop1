package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void shouldSwitchMaxStationNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.switchStationNext();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchMinStationNext() {
        Radio radio = new Radio();
        radio.switchStationNext();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchMinStationPrev() {
        Radio radio=new Radio();
        radio.switchStationPrev();
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchMaxStationPrev() {
        Radio radio=new Radio();
        radio.setCurrentStation(9);
        radio.switchStationPrev();
        assertEquals(8,radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseMinVolume() {
        Radio radio=new Radio();
        radio.increaseVolume();
        assertEquals(1,radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        Radio radio=new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10,radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceMinVolume() {
        Radio radio=new Radio();
        radio.reduceVolume();
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceMaxVolume() {
        Radio radio=new Radio();
        radio.setCurrentVolume(10);
        radio.reduceVolume();
        assertEquals(9,radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceOverMaxVolume() {
        Radio radio=new Radio();
        radio.setCurrentVolume(11);
        radio.reduceVolume();
        assertEquals(11,radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentStationOverMax() {
        Radio radio=new Radio();
        radio.setCurrentStation(10);
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationUnderMin() {
        Radio radio=new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0,radio.getCurrentStation());
    }
}
