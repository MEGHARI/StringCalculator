package com.exalt.company;

public class MainCalculatorString {

    public static void main(String... args) {
        StringCalculatorKata stringCalculatorKata = new StringCalculatorKata();
        String inputs = "1,2,3\n4";
        try {
            int result = stringCalculatorKata.add(inputs);
            System.out.println("le résultat de la chaine " + inputs + " est "+result);
        } catch (NegativeNumberException e) {
            e.printStackTrace();
        }

    }
}
