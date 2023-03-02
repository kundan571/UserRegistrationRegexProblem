package com.regexuserregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUserRegistration {

        public void checkUppercase() {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter password: ");
            String password = scanner.nextLine();
            String regex = "((?=.*[a-z!@#$%^&*])(?=.*[A-Z])(?=.*[0-9])).{8,15}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);
            boolean bool = matcher.matches();
            System.out.println(bool);
        }
    public static void main(String[] args) {
            RegexUserRegistration userRegistration = new RegexUserRegistration();
            userRegistration.checkUppercase();

    }
}
