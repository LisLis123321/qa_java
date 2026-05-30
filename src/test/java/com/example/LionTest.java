package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LionTest {

    @Test

    void checkIfPredatorTestReturnAnimalLogic() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        List<String> actual = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }
@Test
    void checkHasManeIsTrue() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        boolean actual = lion.doesHaveMane();
        assertTrue(actual);
    }

    @Test
    void checkDoesNonHaveMane() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        boolean actual = lion.doesHaveMane();
        assertFalse(actual);
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
        assertThrows(Exception.class, () ->new Lion("Anything", feline));
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