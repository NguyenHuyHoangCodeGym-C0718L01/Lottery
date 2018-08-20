package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //the structure of lottery is made of two integer
        //two integer will be random
        //and then cast them to string
        Random random = new Random();
        int a = random.nextInt(10);
        String first = Integer.toString(a);
        int b = random.nextInt(10);
        String second = Integer.toString(b);

        String lottery = first+second;

        //input is a string
        //the input is cast into char array
        //the two char is cast into int
        Scanner scanner = new Scanner(System.in);
        String firstGuess;
        do {
            System.out.print("Input the first number: ");
            firstGuess = scanner.nextLine();
            char[] firstArray = firstGuess.toCharArray();
            int aFirst = Integer.parseInt(String.valueOf(firstArray[0]));
            int bFirst = Integer.parseInt(String.valueOf(firstArray[1]));
            System.out.println();

            //compare
            if (aFirst == a && bFirst == b) {
                System.out.println("Winner winner chicken dinner: 10000$");
            } else if (aFirst == b && bFirst == a) {
                System.out.println("Second Winner 3000$");
            } else if (aFirst == a || aFirst == b || bFirst == a || bFirst == b) {
                System.out.println("Loser 1000$");
            } else {
                System.out.println("you suck, better luck next time");
            }
        }while (firstGuess.equals(""));
//        for(int i = 1; i < 1001; i++){
//            int count = 0;
//            for(int j = 1; j <= i; j++){
//                if(i%j==0){
//                    count++;
//                }
//            }
//            if(count == 2){
//                System.out.println(i);
//            }
//        }
    }
}
