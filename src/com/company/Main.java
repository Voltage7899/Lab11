package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String [] args) throws Exception
    {
        System.out.println("Enter the line");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println("How do u want split line?\n" +
                "1)Only numbers " +
                "2)Only letters " +
                "3)Whitespace between number and letters "+
                "4) Ex2 " +
                "5) Price " +
                "6) Data" +
                "7) ");
        Scanner scanner1=new Scanner(System.in);
        Split spl=new Split();
        int i=scanner1.nextInt();
        if(i==1)
        {
        spl.split1(str,1);
        }
        if(i==2)
        {
            spl.split2(str,1);
        }
        if(i==3)
        {
            spl.split3(str,1);
        }
        if(i==4)
        {
            spl.ex2(str);
        }
        if(i==5)
        {
            spl.Price(str);
        }
        if(i==6)
        {
            spl.Data(str);
        }
        if(i==7)
        {
            spl.Email(str);
        }
        if(i==8)
        {
            spl.Password(str);
        }


    }
}
