package com.exalt.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringCalculatorKata {


    private static final String NEW_LINE = "\n";
    private static final String COMMA = ",";
    private static final String DOUBLE_SLASH = "//";
    private static final String EMPTY_STRING = "";

    int add(String numbers) throws NegativeNumberException {
        //les parametres à traiter réelement après son traitement
        String numbersToProcess = "";
        // delimiter pa defaut
        String delimiter = NEW_LINE;
        if (numbers.startsWith(DOUBLE_SLASH)) {
            String numbersWithoutDoubleSlash = numbers.replaceFirst(DOUBLE_SLASH, EMPTY_STRING);
            // le separator est une nouvelle ligne
            if (numbersWithoutDoubleSlash.startsWith(NEW_LINE)) {
                // on supprime les deux sauts de lignes
                numbersToProcess = numbersWithoutDoubleSlash.replaceFirst(NEW_LINE + NEW_LINE, EMPTY_STRING);
                return addWithDelimiter(numbersToProcess, delimiter);
            }
            delimiter = numbersWithoutDoubleSlash.split(NEW_LINE)[0];
            numbersToProcess = numbersWithoutDoubleSlash.replaceFirst(delimiter + NEW_LINE, EMPTY_STRING);
            return addWithDelimiter(numbersToProcess, delimiter);
        }
        return addWithDelimiter(numbers, delimiter);
    }

    /**
     * Methode qui remplace els occurences d'un delimiter en virgule point defaut pour traitement.
     *
     * @param input     : l'entrée
     * @param delimiter : le delimiter utilisé
     * @return : la somme
     */
    private int addWithDelimiter(String input, String delimiter) throws NegativeNumberException {
        String inputsWithComaDelimiter = input.replace(delimiter, COMMA);
        int result = 0;
        if (!inputsWithComaDelimiter.contains(COMMA)) {
            result = inputsWithComaDelimiter.isEmpty() ? result : Integer.parseInt(inputsWithComaDelimiter);
            if (result >= 0) {
                return result;
            } else {
                throw new NegativeNumberException(String.valueOf(result));

            }
        }
        String negativesNumber = Arrays.stream(inputsWithComaDelimiter.split(COMMA)).filter(number -> Integer.parseInt(number) < 0).collect(Collectors.joining(COMMA));
        if (!negativesNumber.isEmpty()) {
            throw new NegativeNumberException(String.valueOf(negativesNumber));
        } else {
            return Arrays.stream(inputsWithComaDelimiter.split(COMMA)).mapToInt(Integer::parseInt).sum();
        }

    }


}
