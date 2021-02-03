package edu.cnm.deepdive;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ParsingDateAndTime {

  public static void main(String[] args) {
    //format is converting date and/or time to String.
    //parse is converting String to date/or and time.

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
    LocalDate date = LocalDate.parse("02 15 2010", formatter);
    LocalTime time = LocalTime.parse("09:06");
    System.out.println(date);
    System.out.println(time);

    String text = date.format(formatter);
    System.out.println();
    System.out.println(text);
    LocalDate parsedDate = LocalDate.parse(text, formatter);
    System.out.println();
    System.out.println(parsedDate);

    LocalDate myDate = LocalDate.of(2010, Month.MAY, 5);
    String dateString = formatter.format(myDate);
    System.out.println();
    System.out.println(dateString);

    LocalDate anotherDate = LocalDate.parse(dateString, formatter);
    anotherDate.plusMonths(5).plusDays(5);
    System.out.println();
    System.out.println(formatter.format(anotherDate));//will print out the same as line 30 since
    //Dates are immutable.
  }

}
