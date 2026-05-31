package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.junit.jupiter.api.Assertions.*;

class LionTest {


    @Test
    void checkHasManeIsTrue() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        boolean actual = lion.doesHaveMane();
        assertTrue(actual);
    }


    @Test
    void checkGetKittensWithoutArguments() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        int actual = lion.getKittens();
        assertEquals(1, actual);
    }

    @Test
    void checkForeignTypeOfAnimal() throws Exception {
        Feline feline = new Feline();
        assertThrows(Exception.class, () -> new Lion("Anything", feline));
    }

    @Test
    void checkGetKittensWithoutArgumentsMock() throws Exception {
        Feline mockedFeline = Mockito.mock(Feline.class);
        Mockito.when(mockedFeline.getKittens()).thenReturn(5);
        Lion lion = new Lion("Самец", mockedFeline);
        int actual = lion.getKittens();
        assertEquals(5, actual);
        Mockito.verify(mockedFeline).getKittens();
    }
}