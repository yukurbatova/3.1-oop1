package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void shouldSwitchMaxStationNext() {
        Radio radio = new Radio(11);
        radio.setCurrentStation(10);
        radio.switchStationNext();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchMinStationNext() {
        Radio radio = new Radio(11);
        radio.switchStationNext();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchMinStationPrev() {
        Radio radio = new Radio(11);
        radio.switchStationPrev();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchMaxStationPrev() {
        Radio radio = new Radio(11);
        radio.setCurrentStation(10);
        radio.switchStationPrev();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseMinVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceMinVolume() {
        Radio radio = new Radio();
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.reduceVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceOverMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.reduceVolume();
        assertEquals(101, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }
}
