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
}
