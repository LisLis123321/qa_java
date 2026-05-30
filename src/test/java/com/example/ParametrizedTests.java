package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrizedTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/typeAnimal.csv")
    void checkGetFamilyReturnValidTypeParametrized(String familyName, boolean expected){
        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals(expected, actual.equals(familyName));

    }

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    void checkParametrizedTestHasMane(String sex, boolean expectedHasMane) throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }

    @ParameterizedTest
    @CsvSource({
            "0, true",
            "2, false",
            "3, false"
    })
    void checkGetKittensParametrized(int value, boolean expected) throws Exception {
        Feline feline = new Feline();
        AleksLion aleks = new AleksLion(feline);
        int actual = aleks.getKittens();
        boolean actualResult = (actual == value);
        assertEquals(expected, actualResult);

    }
}
