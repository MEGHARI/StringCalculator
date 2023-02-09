package com.exalt.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

class StringCalculatorKataTest {
    private StringCalculatorKata stringCalculatorKata;

    @BeforeEach
    void setUp() {
        stringCalculatorKata = new StringCalculatorKata();
    }

    @Test
    void shouldReturnSumOFInputsArguments() throws NegativeNumberException {
        // GIVEN
        String inputArgument = "1,2";
        int resultOfOnePlusTwo = 3;
        // WHEN
        int result = stringCalculatorKata.add(inputArgument);
        // THEN
        Assertions.assertEquals(resultOfOnePlusTwo, result);
    }

    @Test
    void shouldReturnZeroWhenInputsIsEmpty() throws NegativeNumberException {
        // GIVEN

        String inputArgument = "";
        int zeroResult = 0;
        // WHEN
        int result = stringCalculatorKata.add(inputArgument);
        // THEN
        Assertions.assertEquals(zeroResult, result);
    }

    @Test
    void shouldReturnZeroWhenPartOfInputsIsEmpty() throws NegativeNumberException {
        // GIVEN

        String inputArgument = "1";
        int valueInputResult = 1;
        // WHEN
        int result = stringCalculatorKata.add(inputArgument);
        // THEN
        Assertions.assertEquals(valueInputResult, result);
    }

    @Test
    void shouldReturnSumOfForNumbers() throws NegativeNumberException {
        // GIVEN

        String inputArgument = "1,2,3,4";
        int tenResult = 10;
        // WHEN
        int result = stringCalculatorKata.add(inputArgument);
        // THEN
        Assertions.assertEquals(tenResult, result);
    }

    @Test
    void shouldReturnSumOFTwoNumbersSeparatedWithNewLine() throws NegativeNumberException {
        // GIVEN

        String inputArgument = "1\n2";
        int resultOfOnePlusTwo = 3;
        // WHEN
        int result = stringCalculatorKata.add(inputArgument);
        // THEN
        Assertions.assertEquals(resultOfOnePlusTwo, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1,2,3", "1\n2\n3", "1\n2,3"})
    void shouldReturnSix(String input) throws NegativeNumberException {
        // GIVEN

        int sixResult = 6;
        // WHEN
        int result = stringCalculatorKata.add(input);
        // THEN
        Assertions.assertEquals(sixResult, result);
    }

    @Test
    void shouldReturnSumOfSixNumbersSeparatedWithNewLineAndComma() throws NegativeNumberException {
        // GIVEN

        String inputArgument = "1\n2,3,4\n5,6";
        int exceptedResult = 21;
        // WHEN
        int result = stringCalculatorKata.add(inputArgument);
        // THEN
        Assertions.assertEquals(exceptedResult, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1,,", "1,\n"})
    void shouldReturnNumberWhenAdditionWithNewlineOrComma(String input) throws NegativeNumberException {
        // Remarque : on ne peut pas effectuer la somme d'un entier avec un
        // caractère special, mais dans cet exercice on l"ignore et on le concidere comme 0.
        // Exemple : si "x,\n" ou "x,,"xet x =  un entier, alors la methode add renvoie X
        // GIVEN

        int finalResult = 1;
        // WHEN
        int result = stringCalculatorKata.add(input);
        // THEN
        Assertions.assertEquals(finalResult, result);
    }

    @Test
    void shouldReturnThreeWhenParameterStartWithDelimiterSemicolon() throws NegativeNumberException {
        // GIVEN

        String inputArgument = "//;\n1;2";
        int finalResult = 3;
        // WHEN
        int result = stringCalculatorKata.add(inputArgument);
        // THEN
        Assertions.assertEquals(finalResult, result);
    }

    @Test
    void shouldReturnThreeWhenParameterStartWithDelimiterComma() throws NegativeNumberException {
        // GIVEN

        String inputArgument = "//,\n1,2";
        int finalResult = 3;
        // WHEN
        int result = stringCalculatorKata.add(inputArgument);
        // THEN
        Assertions.assertEquals(finalResult, result);
    }

    @Test
    void shouldReturnThreeWhenParameterStartWithDelimiterNewLine() throws NegativeNumberException {
        // GIVEN

        String inputArgument = "//\n\n1\n2";
        int finalResult = 3;
        // WHEN
        int result = stringCalculatorKata.add(inputArgument);
        // THEN
        Assertions.assertEquals(finalResult, result);
    }

    @Test
    void shouldThrowExceptionWhenUsingNegativeNumber() {
        // GIVEN

        String inputArgument = "-1,2";
        String messageException = "negatives not allowed - -1";
        int finalResult = 3;
        // WHEN
        Exception exception = assertThrows(NegativeNumberException.class, () -> stringCalculatorKata.add(inputArgument));
        // THEN
        Assertions.assertEquals(messageException, exception.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenUsingTwoNegativeNumbers() {
        // GIVEN
        String inputArgument = "-1,3,-2";
        String messageException = "negatives not allowed - -1,-2";
        int finalResult = 3;
        // WHEN
        Exception exception = assertThrows(NegativeNumberException.class, () -> stringCalculatorKata.add(inputArgument));
        // THEN
        Assertions.assertEquals(messageException, exception.getMessage());
    }

}
