package com.exalt.company;

import java.util.Arrays;

public class StringCalculatorKata {

    int add(String numbers) {
        int result = 0;
        if (!numbers.contains(",")) {
            if (numbers.contains("\n")) {
                return Arrays.stream(numbers.split("\n")).mapToInt(Integer::parseInt).sum();
            }
            return numbers.isEmpty() ? result : Integer.parseInt(numbers);
        }
        return Arrays.stream(numbers.split(",")).mapToInt(Integer::parseInt).sum();
    }


}
