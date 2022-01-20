package com.mark.percentage;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Welcome
        System.out.println(" ____                                   __                                ____              ___                    ___             __                   \n" +
                "/\\  _`\\                                /\\ \\__                            /\\  _`\\           /\\_ \\                  /\\_ \\           /\\ \\__                \n" +
                "\\ \\ \\L\\ \\ __   _ __   ___     __    ___\\ \\ ,_\\    __       __      __    \\ \\ \\/\\_\\     __  \\//\\ \\     ___   __  __\\//\\ \\      __  \\ \\ ,_\\   ___   _ __  \n" +
                " \\ \\ ,__/'__`\\/\\`'__\\/'___\\ /'__`\\/' _ `\\ \\ \\/  /'__`\\   /'_ `\\  /'__`\\   \\ \\ \\/_/_  /'__`\\  \\ \\ \\   /'___\\/\\ \\/\\ \\ \\ \\ \\   /'__`\\ \\ \\ \\/  / __`\\/\\`'__\\\n" +
                "  \\ \\ \\/\\  __/\\ \\ \\//\\ \\__//\\  __//\\ \\/\\ \\ \\ \\_/\\ \\L\\.\\_/\\ \\L\\ \\/\\  __/    \\ \\ \\L\\ \\/\\ \\L\\.\\_ \\_\\ \\_/\\ \\__/\\ \\ \\_\\ \\ \\_\\ \\_/\\ \\L\\.\\_\\ \\ \\_/\\ \\L\\ \\ \\ \\/ \n" +
                "   \\ \\_\\ \\____\\\\ \\_\\\\ \\____\\ \\____\\ \\_\\ \\_\\ \\__\\ \\__/.\\_\\ \\____ \\ \\____\\    \\ \\____/\\ \\__/.\\_\\/\\____\\ \\____\\\\ \\____/ /\\____\\ \\__/.\\_\\\\ \\__\\ \\____/\\ \\_\\ \n" +
                "    \\/_/\\/____/ \\/_/ \\/____/\\/____/\\/_/\\/_/\\/__/\\/__/\\/_/\\/___L\\ \\/____/     \\/___/  \\/__/\\/_/\\/____/\\/____/ \\/___/  \\/____/\\/__/\\/_/ \\/__/\\/___/  \\/_/ \n" +
                "                                                           /\\____/                                                                                      \n" +
                "                                                           \\_/__/                                                                                       ");
        System.out.println("Enter Your Name :");
        Scanner input = new Scanner(System.in);
        String nameOfPerson = input.next();
        System.out.println("Hello, " + nameOfPerson.toUpperCase());

        // No Of Paper
        System.out.println("Enter No. Of papers : ");
        short noOfPapers = input.nextShort();
        System.out.println(noOfPapers + " Papers . Is that correct ? If correct, Type " + '"' +'1' + '"'+ ",  Else wrong , press any number ");

        //confirmation
        byte get1 = input.nextByte();
        String wrong;
        wrong = "You Entered Wrong No of paper . so please restart program ";
        String confirmation = get1 != 1 ? wrong : "ok. Now Enter Full Mark Of Single Paper :"  ;
        System.out.println(confirmation);
        //boolean = confirmation == "ok" ?  ;

        // Total Mark of single paper
        byte totalMarks1paper = input.nextByte();
        int totalMarkOfAll = totalMarks1paper * noOfPapers ;
        System.out.println(totalMarkOfAll + " was your total marks . Now Enter Your 1st subject Name : ");

        // 1st Subject
        String sub1Name = input.next();
        sub1Name = sub1Name.toUpperCase();
        System.out.println("Enter Your "+ sub1Name + " mark :");
        byte sub1Mark = input.nextByte();

        //System.out.println(sub1Name + " Mark = " + sub1Mark );
        System.out.println("Now Enter 2nd Subject Name : ");

        // 2nd Subject
        String sub2Name = input.next();
        sub2Name = sub2Name.toUpperCase();
        System.out.println("Enter Your "+ sub2Name + " mark :");
        byte sub2Mark = input.nextByte();

        /*System.out.println(sub1Name + " Mark = " + sub1Mark );
        System.out.println(sub2Name + " Mark = " + sub2Mark );*/

        System.out.println("Now Enter 3rd Subject Name : ");

        // 3rd Subject
        String sub3Name = input.next();
        sub3Name = sub3Name.toUpperCase();
        System.out.println("Enter Your "+ sub3Name + " mark :");
        byte sub3Mark = input.nextByte();

        /*System.out.println(sub1Name + " Mark = " + sub1Mark );
        System.out.println(sub2Name + " Mark = " + sub2Mark );
        System.out.println(sub3Name + " Mark = " + sub3Mark );*/
        System.out.println("Now Enter 4th Subject Name  : ");

        // 4th subject
        String sub4Name = input.next();
        sub4Name = sub4Name.toUpperCase();
        System.out.println("Enter Your "+ sub4Name + " mark :");
        byte sub4Mark = input.nextByte();

        /*System.out.println(sub1Name + " Mark = " + sub1Mark );
        System.out.println(sub2Name + " Mark = " + sub2Mark );
        System.out.println(sub3Name + " Mark = " + sub3Mark );
        System.out.println(sub4Mark + " Mark = " + sub4Mark ); */
        System.out.println("Now Enter 5th Subject Name :");

        // 5 th Subject
        String sub5Name = input.next();
        sub5Name = sub5Name.toUpperCase();
        System.out.println("Enter Your " + sub5Name + " mark :");
        byte sub5Mark = input.nextByte();

        /*System.out.println(sub1Name + " Mark = " + sub1Mark );
        System.out.println(sub2Name + " Mark = " + sub2Mark );
        System.out.println(sub3Name + " Mark = " + sub3Mark );
        System.out.println(sub4Mark + " Mark = " + sub4Mark );
        System.out.println(sub5Mark + " Mark = " + sub5Mark );*/
        System.out.println("Now Enter 6th Subject Name :");

        // 6th Subject
        String sub6Name = input.next();
        sub6Name = sub6Name.toUpperCase(Locale.ROOT);
        System.out.println("Enter Your " + sub6Name + " mark : ");
        byte sub6Mark = input.nextByte();

       /* System.out.println(sub1Name + " Mark = " + sub1Mark );
        System.out.println(sub2Name + " Mark = " + sub2Mark );
        System.out.println(sub3Name + " Mark = " + sub3Mark );
        System.out.println(sub4Name + " Mark = " + sub4Mark );
        System.out.println(sub5Name + " Mark = " + sub5Mark );
        System.out.println(sub6Name + " Mark = " + sub6Mark );*/
        System.out.println("Now Enter 7th Subject Name : ");

        // 7th Subject
        String sub7Name = input.next();
        sub7Name = sub7Name.toUpperCase();
        System.out.println("Enter Your "+ sub7Name + " mark : ");
        byte sub7Mark = input.nextByte();


        System.out.println(sub1Name + " Mark = " + sub1Mark );
        System.out.println(sub2Name + " Mark = " + sub2Mark );
        System.out.println(sub3Name + " Mark = " + sub3Mark );
        System.out.println(sub4Name + " Mark = " + sub4Mark );
        System.out.println(sub5Name + " Mark = " + sub5Mark );
        System.out.println(sub6Name + " Mark = " + sub6Mark );
        System.out.println(sub7Name + " Mark + " + sub7Mark );

        //Total
        int total= sub1Mark + sub2Mark + sub3Mark + sub4Mark + sub5Mark + sub6Mark + sub7Mark ;
        int percentage = total/totalMarkOfAll*100 ;
        System.out.println("Your ( " + nameOfPerson.toUpperCase() + " ) Total Marks = " + total );
        System.out.println("Your ( " + nameOfPerson.toUpperCase() + " ) Percentage = " + percentage );



    }
}
