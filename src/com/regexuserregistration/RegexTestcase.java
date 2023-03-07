package com.regexuserregistration;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestcase {

    // Validate First name

    @Test
    public void validateFirstNameAtLeastThreeLetter() {
        Pattern p = Pattern.compile("^[A-Z][a-z]{2,30}");
        Matcher m = p.matcher("Kundan");
        boolean b = m.matches();
        Assert.assertEquals(true, b);
    }

    // Validate last name
    @Test
    public void validateLastNameAtLeastThreeLetter() {
        Pattern p = Pattern.compile("^[A-Z][a-z]{2,30}");
        Matcher m = p.matcher("Kumar");
        boolean b = m.matches();
        Assert.assertEquals(true, b);
    }

    // Validate Email
    @Test
    public void validateEmailWhichShouldFollowSomeLimitation() {
        String regex = "^[a-zA-z0-9+.+a-z]+@+[a-z{2,5}+.+a-z{2,3}+.+a-z{2,3}]{2,30}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("kundanchauhan1997@gmail.com");
        boolean b = m.matches();
        Assert.assertEquals(true, b);
    }

    // Validate mobile number
    @Test
    public void validateMobileNumberWithCountryCode() {
        String regex = "[+][0-9]{2}\\s[0-9]{10}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("+91 9867722626");
        boolean b = m.matches();
        Assert.assertEquals(true, b);
    }

    // Validate password
    @Test
    public void validatePasswordWithSomeLimitation() {
        String regex = "[a-zA-Z0-9!@#$%^&*]{8,15}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("asdf23@3A");
        boolean b = m.matches();
    }

    // validate at least one uppercase
    @Test
    public void checkAtLeastOneUppercase() {
        String regex = "((?=.*[a-z0-9!@#$%^&*])(?=.*[A-Z])).{8,15}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("Aqwert12@1");
        boolean bool = matcher.matches();
        Assert.assertEquals(true, bool);
    }

    // Validate at least one numeric
    @Test
    public void checkAtLeastOneNumeric() {
        Scanner scanner = new Scanner(System.in);
        String regex = "((?=.*[a-z!@#$%^&*])(?=.*[A-Z])(?=.*[0-9])).{8,15}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("Aqwert12@1");
        boolean bool = matcher.matches();
        Assert.assertEquals(true, bool);

    }

    // validate exactly one special character
    @Test
    public void checkExactlyOneSpecialCharacterAtAnyPlace() {
        String regex = "((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=[^!@#$%^&*]*[!@#$%^&*][^!@#$%^&*])).{8,15}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("saA@wersd1");
        boolean bool = matcher.matches();
        Assert.assertEquals(true, bool);

    }

}
