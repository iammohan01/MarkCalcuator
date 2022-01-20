package com.mark.percentage;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Welcome
        System.out.println("Enter Your Name :");
        Scanner input = new Scanner(System.in);
        String nameOfPerson = input.next();
        System.out.println("Hello, " + nameOfPerson.toUpperCase());
        
    }
}
