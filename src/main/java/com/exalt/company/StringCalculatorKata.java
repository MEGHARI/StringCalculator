package com.exalt.company;

public class StringCalculatorKata {

    int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        if (!numbers.contains(",")) {
            return Integer.parseInt(numbers);
        } else {
            String[] arrayNumbers = numbers.split(",");
            int resultSum = 0;
            for (String number : arrayNumbers) {
                resultSum += Integer.parseInt(number);
            }
            return resultSum;
        }

    }
}
