package com.example.dog;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckMobNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 digit Mobile Number:");
        String phoneNumber = sc.nextLine();

        Pattern p = Pattern.compile("(0/91)?[6-9][0-9]{9}");
        Matcher m = p.matcher(phoneNumber);
        if (m.matches()) {
            System.out.println("Valid Number");
        } else {
            System.out.println("Invalid Mobile Number");
        }

    }

}
