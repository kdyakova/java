/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import static java.lang.String.format;
import java.util.Scanner;

/**
 *
 * @author Krisi
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Enter name:");
        Scanner scan=new Scanner(System.in);
        String name=scan.next();
        while(!"q".equals(name)){
            System.out.println(format("Hello, %s!", name));
            System.out.print("Enter name:");
            name=scan.next();
        }
    }
}
