package tech.kemboi;

import java.util.Random;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int a= 5;
//        for (int i=0 ; i<a; i++ ){
//            System.out.println(i);
//        }

//        while (a<10){
//            a++;
//            if(a==8){
//                continue;
//            }
//            System.out.println(a);
//        }

//        do {
//            System.out.println("Hello");
//        } while (a<5);

//        SCANNER- enables a user insert
//        System.out.println("Please enter a number:");
//        Scanner scanner = new Scanner(System.in);
//        int answer = scanner.nextInt();
//        System.out.println("The answer is: " + answer);
//        System.out.println("Enter your name:");
//        String name = scanner.next();
//        System.out.println("Hello " + name);

//        GENERATE A RUNDOM NUMBER
        Random random = new Random();
        int number = random.nextInt(20) +1;
        System.out.println("The number is " + number);
    }
}
