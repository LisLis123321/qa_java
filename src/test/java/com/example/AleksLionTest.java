package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AleksLionTest {

    @Test
    void checkGetFriendsReturnTrueNames() throws Exception {
        Feline feline = new Feline();
        AleksLion aleks = new AleksLion(feline);
        List<String> actual = aleks.getFriends();
        assertEquals(List.of("Марти", "Глория", "Мелман"), actual);
    }

    @Test
    void checkGetFriendsReturnTruePlace() throws Exception {
        Feline feline = new Feline();
        AleksLion aleks = new AleksLion(feline);
        String actual = aleks.getPlaceOfLiving();
        assertEquals("Нью-Йоркский зоопарк", actual);
    }

    @Test
    void checkGetKittensReturnOneKitten() throws Exception {
        Feline feline = new Feline();
        AleksLion aleks = new AleksLion(feline);
        int actual = aleks.getKittens();
        assertEquals(0, actual);
    }

}