package edu.howardcc.javaii.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {

        String contacts = "Targaryen,Daenerys,MotherOfDragons@westeros.com\n" +
                "Lannister,Tyrion,IDrinkAndIKnowThings@lannisport.net\n" +
                "Snow,Jon,totallynotrelated@thewall.com\n";

        // Find all the domain names in a string
        // Note the extra '\' escapes
        Pattern pattern = Pattern.compile("@(\\S*)(\\.\\w{3})");

        Matcher matcher = pattern.matcher(contacts);
        while (matcher.find()) {
            System.out.printf("Whole: %s\n", matcher.group());
            System.out.printf("Domain: %s\n", matcher.group(1));
            System.out.printf("TLD: %s\n\n", matcher.group(2));
        }

    }

}
