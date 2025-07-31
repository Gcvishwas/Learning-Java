package Basics;

public class SumEvenOdd {
    public static void main(String[] args) {
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                evenSum += i;
            else
                oddSum += i;
        }
        System.out.println("The sum of even numbers is : " + evenSum);
        System.out.println("The sum of odd  numbers is : " + oddSum);
    }
}