package Basics;

import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scanner.nextInt();
        if(num%2==0){
            System.out.print("The number   : " + num + " is even");
        }
        else {
            System.out.print("The number   : " + num + " is odd");
        }
    }
}