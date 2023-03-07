package com.regexuserregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUserRegistration {

    // Validate First name
    public void validateFirstName() {
        Pattern p = Pattern.compile("^[A-Z][a-z]{2,30}");
        Matcher m = p.matcher("Kundan");
        boolean b = m.matches();
        System.out.println(b);
    }

    // Validate last name
    public void validateLastName() {
        Pattern p = Pattern.compile("^[A-Z][a-z]{2,30}");
        Matcher m = p.matcher("Kumar");
        boolean b = m.matches();
        System.out.println(b);
    }

    // Validate Email
    public void validateEmail() {
        Scanner scanner = new Scanner(System.in);
        String emails = scanner.nextLine();
        String regex = "^[a-zA-z0-9+.+a-z]+@+[bl+.+co+.+in]{2,30}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(emails);
        boolean b = m.matches();
        System.out.println(b);
    }

    // Validate mobile number
    public void validateMobileNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Mobile Number: ");
        String mobileNumber = scanner.nextLine();
        String regex = "[\\+][0-9]{2}\\s[0-9]{10}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(mobileNumber);
        boolean b = m.matches();
        System.out.println(b);
    }

    // Validate password
    public void validatePassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        String regex = "[a-zA-Z0-9!@#$%^&*]{8,15}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        boolean b = m.matches();
        System.out.println(b);
    }

    // validate at least one uppercase
    public void checkUppercase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        String regex = "((?=.*[a-z0-9!@#$%^&*])(?=.*[A-Z])).{8,15}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        boolean bool = matcher.matches();
        System.out.println(bool);
    }

    // Validate at least one numeric
    public void checkNumeric() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        String regex = "((?=.*[a-z!@#$%^&*])(?=.*[A-Z])(?=.*[0-9])).{8,15}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        boolean bool = matcher.matches();
        System.out.println(bool);
    }

    // validate exactly one special character
    public void checkExactlyOneSpecialCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        String regex = "((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=[^!@#$%^&*]*[!@#$%^&*][^!@#$%^&*])).{8,15}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        boolean bool = matcher.matches();
        System.out.println(bool);
    }

    public static void main(String[] args) {
        RegexUserRegistration userRegistration = new RegexUserRegistration();
        //  userRegistration.checkUppercase();
        userRegistration.validateMobileNumber();


    }
}
