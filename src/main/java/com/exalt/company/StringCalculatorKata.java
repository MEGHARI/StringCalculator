package com.exalt.company;

public class StringCalculatorKata {

    int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        int firstArgument = Integer.parseInt(numbers.split(",")[0]);
        int secondArgument = Integer.parseInt(numbers.split(",")[1]);
        return firstArgument + secondArgument;
    }
}
