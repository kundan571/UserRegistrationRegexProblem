package com.regexuserregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUserRegistration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String mobileNumber = scanner.nextLine();
        String regex = "[+](?:[0-9]\\s?){11}[0-9]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(mobileNumber);
        boolean b = m.matches();
        System.out.println(b);
    }
}
