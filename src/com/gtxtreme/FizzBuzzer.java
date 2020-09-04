package com.gtxtreme;

public class FizzBuzzer {
    public String checkFizzBuzz(int number){
        // Three Test Cases / If constructs
        // Following conditions here
        if (number%5==0 && number%3==0)
            // IF it's divisible by 3 and 5 it is divisible by 15
            return "FizzBuzz";
        if(number%5==0)
            return "Buzz";
        if (number%3==0)
            return "Fizz";

        // Last Condition , just in case no other conditions match
        return String.valueOf(number);
    }
}