package com.exalt.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCalculatorKataTest {

    @Test
    void shouldReturnSumOFInputsArguments() {
        // GIVEN
        StringCalculatorKata stringCalculatorKata = new StringCalculatorKata();
        String inputArgument = "1,2";
        int resultOfOnePlusTwo = 3;
        // WHEN
        int result = stringCalculatorKata.add(inputArgument);
        // THEN
        Assertions.assertEquals(result, resultOfOnePlusTwo);
    }

    @Test
    void shouldReturnZeroWhenInputsIsEmpty() {
        // GIVEN
        StringCalculatorKata stringCalculatorKata = new StringCalculatorKata();
        String inputArgument = "";
        int zeroResult = 0;
        // WHEN
        int result = stringCalculatorKata.add(inputArgument);
        // THEN
        Assertions.assertEquals(result, zeroResult);
    }

    @Test
    void shouldReturnZeroWhenPartOfInputsIsEmpty() {
        // GIVEN
        StringCalculatorKata stringCalculatorKata = new StringCalculatorKata();
        String inputArgument = "1";
        int valueInputResult = 1;
        // WHEN
        int result = stringCalculatorKata.add(inputArgument);
        // THEN
        Assertions.assertEquals(result, valueInputResult);
    }

    @Test
    void shouldReturnSumOfThreeNumbers() {
        // GIVEN
        StringCalculatorKata stringCalculatorKata = new StringCalculatorKata();
        String inputArgument = "1,2,3";
        int sixResult = 6;
        // WHEN
        int result = stringCalculatorKata.add(inputArgument);
        // THEN
        Assertions.assertEquals(result, sixResult);
    }

    @Test
    void shouldReturnSumOfForNumbers() {
        // GIVEN
        StringCalculatorKata stringCalculatorKata = new StringCalculatorKata();
        String inputArgument = "1,2,3,4";
        int tenResult = 10;
        // WHEN
        int result = stringCalculatorKata.add(inputArgument);
        // THEN
        Assertions.assertEquals(result, tenResult);
    }

    @Test
    void shouldReturnSumOFTwoNumbersSeparatedWithNewLine() {
        // GIVEN
        StringCalculatorKata stringCalculatorKata = new StringCalculatorKata();
        String inputArgument = "1\n2";
        int resultOfOnePlusTwo = 3;
        // WHEN
        int result = stringCalculatorKata.add(inputArgument);
        // THEN
        Assertions.assertEquals(result, resultOfOnePlusTwo);
    }

    @Test
    void shouldReturnSumOFTHreeNumbersSeparatedWithNewLine() {
        // GIVEN
        StringCalculatorKata stringCalculatorKata = new StringCalculatorKata();
        String inputArgument = "1\n2\n3";
        int sixResult = 6;
        // WHEN
        int result = stringCalculatorKata.add(inputArgument);
        // THEN
        Assertions.assertEquals(result, sixResult);
    }


}
