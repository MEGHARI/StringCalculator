package com.exalt.company;

import java.util.Arrays;

public class StringCalculatorKata {


    private static final String NEW_LINE = "\n";
    private static final String COMMA = ",";

    int add(String numbers) {
        int result = 0;
        String numbersWithoutNewLine = numbers.replace(NEW_LINE, COMMA);
        if (!numbersWithoutNewLine.contains(COMMA)) {
            return numbers.isEmpty() ? result : Integer.parseInt(numbers);
        }
        return Arrays.stream(numbersWithoutNewLine.split(COMMA)).mapToInt(Integer::parseInt).sum();


    }


}
