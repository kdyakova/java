/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dates;

import java.util.logging.Logger;

/**
 *
 * @author Krisi
 */
public class Dates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    private static class Date{
        public Date(){
            day=0;
            mounth=0;
            year=0;
        }
        public Date(int day, int mounth, int year) {
            this.day = day;
            this.mounth = mounth;
            this.year = year;
        }
        private int day, mounth,year;

        public int getDay() {
            return day;
        }

        public int getMounth() {
            return mounth;
        }

        public int getYear() {
            return year;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public void setMounth(int mounth) {
            this.mounth = mounth;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return day + "." + mounth + "." + year;
        }


        
        
        
    }
}
