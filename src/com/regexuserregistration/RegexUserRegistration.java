package com.regexuserregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUserRegistration {
    public static void main(String[] args) {
        // taking user input
        Scanner scanner = new Scanner(System.in);
        String emails = scanner.nextLine();
        String regex = "^[a-zA-z0-9+.+a-z]+@+[bl+.+co+.+in]{2,30}";
        Pattern p = Pattern.compile(regex);
        // for taking user input pass regex instead of Kundan
        Matcher m = p.matcher(emails);
        boolean b = m.matches();
        System.out.println(b);
        // for user input
//        if (firstName.matches(regex)){
//            System.out.println("Valid name: ");
//        }
//        else {
//            System.out.println("Invalid name: ");
//        }
    }
}
