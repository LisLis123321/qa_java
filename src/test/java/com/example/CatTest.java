package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void checkCatSound(){
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        assertEquals("Мяу", actual);
    }

    @Test
    void checkListFoodPredator() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> actual = cat.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }

    @Test
    void checkListFoodPredatorMock()throws Exception {
        Feline mockFeline = Mockito.mock(Feline.class);
        Mockito.when(mockFeline.eatMeat()).thenReturn(List.of("Шоколад", "Суши", "Трава"));
        Cat cat = new Cat(mockFeline);
        List<String> actual = cat.getFood();
        assertEquals(List.of("Шоколад", "Суши", "Трава"), actual);
        Mockito.verify(mockFeline).eatMeat();
    }

}