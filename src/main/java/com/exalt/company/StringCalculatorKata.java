package com.exalt.company;

public class StringCalculatorKata {

    int add(String numbers) {
            int firstArgument = Integer.parseInt(numbers.split(",")[0]);
            int secondArgument = Integer.parseInt(numbers.split(",")[1]);
            return firstArgument + secondArgument;
    }
}
