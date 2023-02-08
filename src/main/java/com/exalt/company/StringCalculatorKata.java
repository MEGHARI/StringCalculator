package com.exalt.company;

public class StringCalculatorKata {

    int add(String numbers) {
        int result = 0;
        if (!numbers.contains(",")) {
            return numbers.isEmpty() ? result : Integer.parseInt(numbers);
        }
        String[] arrayNumbers = numbers.split(",");
        for (String number : arrayNumbers) {
            result += Integer.parseInt(number);
        }
        return result;
    }


}
