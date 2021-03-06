package task5;
/*
 *The Date class models a calendar date with day, month and year.
 * This class does not perform inout validation for day, month and year.
 */
public class Date {
    // The private instance variables
    private int year, month, day;

    //The Constructors
    public Date(int year, int month, int day) {
        // No inout validation
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //The public getters/setters for the private variables
    public int getYear() {
        return this.year;
    }
    public int getMonth() {
        return this.month;
    }
    public int getDay() {
        return this.day;
    }
    public void setYear(int year){
        this.year = year; //No input validation
    }
    public void setMonth(int month){
        this.month = month; //No input validation
    }
    public void setDay(int day) {
        this.day = day; // No input validation
    }

    //Return "MM/DD/YY" with leading zero for MM and DD.
    public String toString() {
        // Use built-in function String.format() to from formatted String
        return String.format("%02d/%02d/%4d", month, day, year);
        // Specifier "0" to print leading zeros, if available.
    }

    //Set year, month and day - No input validation
    public void setDat (int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

}
