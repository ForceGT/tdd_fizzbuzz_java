package com.gtxtreme;

public class ResponseHandler {
    public static void main(String[] args){
        FizzBuzzer fizzBuzzer = new FizzBuzzer();
        for (int i=1;i<=100;i++)
            System.out.print(fizzBuzzer.checkFizzBuzz(i) + " ");
    }

}
