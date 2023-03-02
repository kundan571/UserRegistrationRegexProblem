package com.regexuserregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUserRegistration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String regex = "[a-zA-Z0-9!@#$%^&*]{8,15}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        boolean b = m.matches();
        System.out.println(b);
    }
}
