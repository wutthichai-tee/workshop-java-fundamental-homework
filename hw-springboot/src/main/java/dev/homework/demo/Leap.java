package dev.homework.demo;

public class Leap {

    private int year;

    public Leap() {
      // Default constructor
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public boolean isLeapYear() {
        if (this.year % 4 == 0) {
            if (this.year % 100 == 0) {
                return this.year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}
