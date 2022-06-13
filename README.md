# String Calculator Kata

This repo contains a sample to start the kata of this [link](https://kata-log.rocks/string-calculator-kata)

We only ask to complete the 5 first steps of the kata

## Requirements
- [ ] Java 11
- [ ] Maven 3
- [ ] Junit 5

### Step 1
Goto StringCalculatorKata and put your first implementation of:

```
 int add(String numbers)
```
The method can take up to two numbers, separated by commas, and will return their sum.

For example “” or “1” or “1,2” as inputs.

For an empty string it will return 0.

### Step 2

Allow the Add method to handle an unknown amount of numbers.

### Step 3

Allow the "add" method to handle new lines between numbers (instead of commas):

- The following input is ok: “1\n2,3” (will equal 6)
- The following input is NOT ok: “1,\n” (not need to prove it - just clarifying)

### Step 4
Support different delimiters:

- To change a delimiter, the beginning of the string will contain a separate line that looks like this: “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’.
- The first line is optional. All existing scenarios should still be supported.

### Step 5
Calling "add" with a negative number will throw an exception “negatives not allowed” - and the negative that was passed.
If there are multiple negatives, show all of them in the exception message.
