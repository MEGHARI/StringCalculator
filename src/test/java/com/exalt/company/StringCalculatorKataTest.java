package com.exalt.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
        Assertions.assertEquals(resultOfOnePlusTwo,result);
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
        Assertions.assertEquals(zeroResult,result);
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
        Assertions.assertEquals(valueInputResult,result);
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
        Assertions.assertEquals(tenResult,result);
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
        Assertions.assertEquals(resultOfOnePlusTwo,result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1,2,3", "1\n2\n3", "1\n2,3"})
    void shouldReturnSix(String input) {
        // GIVEN
        StringCalculatorKata stringCalculatorKata = new StringCalculatorKata();
        int sixResult = 6;
        // WHEN
        int result = stringCalculatorKata.add(input);
        // THEN
        Assertions.assertEquals(sixResult, result);
    }

    @Test
    void shouldReturnSumOfSixNumbersSeparatedWithNewLineAndComma() {
        // GIVEN
        StringCalculatorKata stringCalculatorKata = new StringCalculatorKata();
        String inputArgument = "1\n2,3,4\n5,6";
        int finalResult = 21;
        // WHEN
        int result = stringCalculatorKata.add(inputArgument);
        // THEN
        Assertions.assertEquals(finalResult,result);
    }

    @Test
    void shouldReturnSumOfNumbersSeparatedWithNewLineAndComma() {
        // GIVEN
        StringCalculatorKata stringCalculatorKata = new StringCalculatorKata();
        String inputArgument = "1,\n";
        int finalResult = 1;
        // WHEN
        int result = stringCalculatorKata.add(inputArgument);
        // THEN
        Assertions.assertEquals(finalResult,result);
    }


}
