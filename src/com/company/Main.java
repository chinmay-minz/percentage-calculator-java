package com.company;
import java.util.Scanner;
public class Main {
//huhi
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("1st. subject");
        float a = sc.nextInt();
        System.out.println("2nd. subject");
        float b = sc.nextInt();
        System.out.println("3th. subject");
        float c = sc.nextInt();
        System.out.println("4th. subject");
        float d = sc.nextInt();
        float totalsum = ( a + b + c +d );
        float percent = (totalsum/400)*100;
        System.out.println("your percent");
        System.out.println(percent);


        /* write your code here */
    }
}
