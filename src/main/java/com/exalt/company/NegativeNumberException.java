package com.exalt.company;

public class NegativeNumberException extends Exception {
    private final static String negativeMessageException = "negatives not allowed - ";

    public NegativeNumberException(String message) {
        super(negativeMessageException + message);
    }
}
