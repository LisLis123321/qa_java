package com.example;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class FelineTest {

    @Test
    void checkGetFamilyReturnValidType(){
        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals("Кошачьи", actual);
    }
}