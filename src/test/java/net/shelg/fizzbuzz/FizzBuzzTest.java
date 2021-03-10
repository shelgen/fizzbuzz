package net.shelg.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp() {
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    public void numbers_divisble_by_3_but_not_by_5_give_Fizz() {
        // Given:
        var number = Arrays.asList(3, 6, 9, 21, 33, 99);

        for (int num : number) {
            // When:
            var result = fizzBuzz.numberToString(num);

            // Then:
            assertEquals("Fizz", result, "Unexpected value for number " + num);
        }
    }

    @Test
    public void numbers_divisble_by_5_but_not_by_3_give_Buzz() {
        // Given:
        var number = Arrays.asList(5, 10, 20, 35, 70, 95, 100);

        for (int num : number) {
            // When:
            var result = fizzBuzz.numberToString(num);

            // Then:
            assertEquals("Buzz", result, "Unexpected value for number " + num);
        }
    }

    @Test
    public void numbers_divisble_by_3_and_by_5_give_FizzBuzz() {
        // Given:
        var number = Arrays.asList(15, 30, 45, 60, 75, 90);

        for (int num : number) {
            // When:
            var result = fizzBuzz.numberToString(num);

            // Then:
            assertEquals("FizzBuzz", result, "Unexpected value for number " + num);
        }
    }

    @Test
    public void numbers_not_divisble_by_3_nor_5_give_the_number() {
        // Given:
        var number = Arrays.asList(1, 7, 23, 56, 76, 98);

        for (int num : number) {
            // When:
            var result = fizzBuzz.numberToString(num);

            // Then:
            assertEquals(String.valueOf(num), result, "Unexpected value for number " + num);
        }
    }

    @Test
    public void fizzBuzzString_converts_the_first_36_numbers_as_expected() {
        // When:
        var result = fizzBuzz.fizzBuzzString();

        // Then:
        assertTrue(
                result.startsWith("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz" +
                        "19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz3132Fizz34BuzzFizz"),
                "Expected result to start with " + result + ", but was " + result);
    }

}