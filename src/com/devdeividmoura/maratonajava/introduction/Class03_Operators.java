package com.devdeividmoura.maratonajava.introduction;

/**
 * Class Class03_Operators - Demonstration of operators usage in Java.
 *
 * @author DevDeividMoura
 * @version 1.0
 */
public class Class03_Operators {
    public static void main(String[] args) {

        int number7 = 7;
        int number10 = 10;
        int number20 = 20;

        // Arithmetic operators
        System.out.println("\nArithmetic operators:");

        // + (Addition)
        int sumResult = number10 + number20;
        System.out.println("The result of " + number10 + " + " + number20 + " is: " + sumResult);

        // + (Concatenation)
        String concatenationExample = number10 + number20 + " Hello " + number10;
        System.out.println(
                "Concatenation Example: (" + number10 + " + " + number20 + ") + \" Hello \" + "
                        + number10 + " = " + concatenationExample);
        // The numbers are summed first, then concatenated with the string.

        // - (Subtraction)
        int subtractionResult = number20 - number10;
        System.out.println("The result of " + number20 + " - " + number10 + " is: " + subtractionResult);

        // / (Division)
        double divisionResult = (double) number20 / number7; // Casting to get a decimal result
        System.out.println("The result of " + number20 + " / " + number7 + " is: " + divisionResult);

        // * (Multiplication)
        int multiplicationResult = number10 * number20;
        System.out.println("The result of " + number10 + " * " + number20 + " is: " + multiplicationResult);

        // % (Modulo)
        int remainder = number20 % number7;
        System.out.println("The remainder of " + number20 + " % " + number7 + " is: " + remainder);

        // Comparative operators
        System.out.println("\nComparative Operators:");

        // > (Greater than)
        boolean isTenGreaterThanTwenty = number10 > number20;
        System.out.println(number10 + " > " + number20 + " : " + isTenGreaterThanTwenty);

        // < (Less than)
        boolean isTenLessThanTwenty = number10 < number20;
        System.out.println(number10 + " < " + number20 + " : " + isTenLessThanTwenty);

        // == (Equal to)
        boolean isTenEqualToTwenty = number10 == number20;
        System.out.println(number10 + " == " + number20 + " : " + isTenEqualToTwenty);

        boolean isTenEqualToTen = number10 == number10;
        System.out.println(number10 + " == " + number10 + " : " + isTenEqualToTen);

        // Comparison of Integer
        int intType = 10;
        Integer intObj = 10; // autoboxing
        System.out.println("int intType (10) == intObj (10): " + (intType == intObj)); // true, unboxing happens here

        // Comparison of Strings
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println("str1 == str2: " + (str1 == str2)); // true, same string pool
        System.out.println("str1 == str3: " + (str1 == str3)); // false, different references
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true, compares values

        // != (Not equal to)
        boolean isTenDifferentFromTwenty = number10 != number20;
        System.out.println(number10 + " != " + number20 + " : " + isTenDifferentFromTwenty);

        // Logical operators
        System.out.println("\nLogical Operators:");

        int age = 29;
        float salary = 3500F;

        // && (AND)
        boolean isEligibleOverThirty = age >= 30 && salary >= 4612;
        boolean isEligibleUnderThirty = age < 30 && salary >= 3381;

        System.out.println("Age: " + age + ", Salary: " + salary);
        System.out.println("Eligible (30+ years, salary >= 4612): " + isEligibleOverThirty);
        System.out.println("Eligible (under 30 years, salary >= 3381): " + isEligibleUnderThirty);

        // ! (NOT)
        boolean isNotEligible = !isEligibleOverThirty;
        System.out.println("Not eligible (30+ years): " + isNotEligible);

        // || (OR)
        double checkingAccountBalance = 200;
        double savingsAccountBalance = 10000;
        float playstationPrice = 5088F;
        boolean canBuyPlayStation = checkingAccountBalance > playstationPrice || savingsAccountBalance > playstationPrice;

        System.out.println("Can buy PlayStation 5 (Price: " + playstationPrice + "): " + canBuyPlayStation);

        // Attribution operators
        System.out.println("\nAttribution Operators:");

        double bonus = 1800;
        System.out.println("Initial bonus value: " + bonus);

        // += (Addition assignment)
        bonus += 1080;
        System.out.println("After bonus += 1080 (bonus = bonus + 1080): " + bonus); // 2880

        // -= (Subtraction assignment)
        bonus -= 1000;
        System.out.println("After bonus -= 1000 (bonus = bonus - 1000): " + bonus); // 1880

        // *= (Multiplication assignment)
        bonus *= 2;
        System.out.println("After bonus *= 2 (bonus = bonus * 2): " + bonus); // 3760

        // /= (Division assignment)
        bonus /= 2;
        System.out.println("After bonus /= 2 (bonus = bonus / 2): " + bonus); // 1880

        // %= (Modulo assignment)
        bonus %= 2;
        System.out.println("After bonus %= 2 (bonus = bonus % 2): " + bonus); // 0 (remainder when divided by 2)



        // Increment and Decrement operators
        System.out.println("\nIncrement and Decrement operators:");

        int counter = 0;
        counter += 1;  // Equivalent to counter = counter + 1
        counter++;     // Post-increment
        counter--;     // Post-decrement
        ++counter;     // Pre-increment
        --counter;     // Pre-decrement

        System.out.println("Counter value: " + counter);

        int counter2 = 0;
        System.out.println("Pre-increment (++counter2): " + ++counter2); // First increments, then prints

        int counter3 = 0;
        System.out.println("Post-increment (counter3++): " + counter3++); // First prints, then increments
        System.out.println("Value after post-increment: " + counter3);

    }
}
