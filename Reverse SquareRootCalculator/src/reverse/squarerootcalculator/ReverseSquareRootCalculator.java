/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.squarerootcalculator;

import static java.lang.String.format;
import java.util.Scanner;

/**
 *
 * @author Krisi
 */
public class ReverseSquareRootCalculator {
    private static Scanner scan;

    /**
     * @param n
     */
    public static void readNumbers(int n){
        int[] numbers=new int[n];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=scan.nextInt();
        }
        printSquareRoots(numbers);
    }

    /**
     *
     * @param numbers
     */
    public static void printSquareRoots(int[] numbers){
        for(int i=numbers.length-1;i>=0;i--){
            System.out.println(format("%,6f",Math.sqrt(numbers[i])));
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        scan=new Scanner(System.in);
        readNumbers(scan.nextInt());
        
    }
    
}
