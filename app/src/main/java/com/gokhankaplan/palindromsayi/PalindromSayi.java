package com.gokhankaplan.palindromsayi;

import java.util.Scanner;

public class PalindromSayi {

    static boolean isPalindrom (int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp !=0){
            System.out.println("=========");
            lastNumber = temp % 10;
            System.out.println("Son basamak: " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("yeni sayı: " + reverseNumber);
            temp /= 10;
            System.out.println("yeni temp: " + temp);
        }
        if (number == reverseNumber) {
            System.out.println(number + " is palindrom");
            return true;
        }
        else {
                System.out.println(number + " is not palindrom");
                return false;
            }
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin:");
        int n = inp.nextInt();
        System.out.println(isPalindrom(n));
    }
}
