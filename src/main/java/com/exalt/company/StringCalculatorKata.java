package com.exalt.company;

public class StringCalculatorKata {

    int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        if(!numbers.contains(",")) {
            return Integer.parseInt(numbers);
        }
        int firstArgument = Integer.parseInt(numbers.split(",")[0]);
        int secondArgument = Integer.parseInt(numbers.split(",")[1]);
        return firstArgument + secondArgument;
    }
}
