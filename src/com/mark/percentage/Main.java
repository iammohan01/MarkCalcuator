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

        // No Of Paper
        System.out.println("Enter No. Of papers : ");
        byte noOfPapers = input.nextByte();
        System.out.println(noOfPapers + "Papers . Is that correct ? If correct type " + ('"') + "yes" + ('"'));

        //confirmation
        String yes = "yes" ;
        String getYes = input.next();
        getYes = getYes.toUpperCase() ;
        boolean confirmation = getYes == "YES" ;
        System.out.println(getYes);
        System.out.println(confirmation);





    }
}
