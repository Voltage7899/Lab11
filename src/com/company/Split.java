package com.company;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Split {
    void split1(String str,int i)
    {
        Pattern pattern= Pattern.compile("[0-9]");
        Matcher m1=pattern.matcher(str);
        while(m1.find()) {
            System.out.println(m1.start() + " " + m1.group() + " ");
        }
    }
    void split2(String str,int i)
    {
        Pattern pattern= Pattern.compile("\\w");
        Matcher m1=pattern.matcher(str);
        while(m1.find()) {
            System.out.println(m1.start() + " " + m1.group() + " ");
        }
    }
    void split3(String str,int i)
    {
        Pattern pattern= Pattern.compile(",");
        String [] strings=pattern.split(str);
        for(String word:strings)
            System.out.println(word);

    }
    void ex2(String str)
    {
        Pattern pattern= Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher m1=pattern.matcher(str);
        while(m1.find()) {
            System.out.println(m1.start() + " " + m1.group() + " ");
        }
    }
    void Price(String str)
    {
        Pattern pattern= Pattern.compile("[0-9.(EU)(RUS)(USD)]");
        Matcher m1=pattern.matcher(str);
        while(m1.find()) {
            System.out.print( m1.group() + " ");
        }
    }
    void Plus(String str)
    {
        Pattern pattern= Pattern.compile("\\d\\s\\+");
        Matcher m1=pattern.matcher(str);
        while(m1.find()) {
            System.out.print( m1.group() + " ");
        }
    }
    void Data(String str)
    {
        Pattern pattern= Pattern.compile("\\d\\d[/]\\d\\d[/]\\d\\d\\d\\d");
        Matcher m1=pattern.matcher(str);
        while(m1.find()) {
            System.out.print( m1.group() + " ");
        }
    }
    void Email(String str)
    {
        Pattern pattern= Pattern.compile("\\w+[@]\\w+[.]com");
        Matcher m1=pattern.matcher(str);
        while(m1.find()) {
            System.out.print( m1.group() + " ");
        }
    }
    void Password(String str)
    {
        Pattern pattern= Pattern.compile("(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$");
        Matcher m1=pattern.matcher(str);
        while(m1.find()) {
            System.out.print( m1.group() + " ");
        }
    }



}
