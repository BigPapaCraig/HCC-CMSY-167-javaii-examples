package edu.howardcc.javaii.examples;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Solution for Project Euler Problem 19: Counting Sundays (https://projecteuler.net/problem=19)
 *
 * You are given the following information, but you may prefer to do some research for yourself.
 * 1 Jan 1900 was a Monday.
 * Thirty days has September,
 *      April, June and November.
 *      All the rest have thirty-one,
 *      Saving February alone,
 *      Which has twenty-eight, rain or shine.
 *      And on leap years, twenty-nine.
 * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 *
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 *
 */
public class Main {

    private static final LocalDate START_DATE = LocalDate.of(1901, 1, 1);
    private static final LocalDate END_DATE = LocalDate.of(2000, 12, 30);

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM YYYY");

    public static void main(String[] args) {

        int sundayTheFirstCount = 0;

        LocalDate date = START_DATE;
        while(date.isBefore(END_DATE)) {
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                if(date.getDayOfYear() == 1)
                    System.out.println(dateTimeFormatter.format(date));
                    sundayTheFirstCount++;
            }
            date = date.plus(1, ChronoUnit.DAYS);
        }

        System.out.printf("\nThe first day of the month was Sunday %d times between %s and %s.\n", sundayTheFirstCount,
                START_DATE.format(dateTimeFormatter), END_DATE.format(dateTimeFormatter));
    }


}
