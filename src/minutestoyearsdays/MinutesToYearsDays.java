
package minutestoyearsdays;

import java.util.Scanner;

public class MinutesToYearsDays {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in); // for input

//    variables
    float resYear, resDays, leftMinutes;
    int year, days;

//      Exact values
    int minPerYear = 24 * 60 * 365; // total minutes in a year
    int minPerDay = 24 * 60; // total minutes in a day

//    input
    System.out.print("Enter minutes to convert: ");
    int inputMin = s.nextInt(); // input minutes

//     calculating years from minutes entered by user
    resYear = (float) inputMin / minPerYear; 

    year = (int) resYear; // getting exact value | integer type 

//     minutes left after calculating years
    leftMinutes = inputMin - (year * minPerYear);

//      calculate days from left minutes
    resDays = leftMinutes / minPerDay;

    days = (int) resDays; // getting exact value | integer type 

//    printing result
    System.out.println("There are " + year + " years and " + days + " days in " + inputMin + " minutes.");

}

}
