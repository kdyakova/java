/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obhojdane;

import java.util.Scanner;

/**
 *
 * @author Krisi
 */
public class Obhojdane {

    /**
     *
     * @param n
     */
    public static void spiralovidnoObhojdane(int n){
        int[][] arr=new int[n][n];
        int value=1,maxValue=n*n;
        int row=0,col=-1,index=n,turn=0;
        
        while(index>0){
            for(int i=0;i<index;i++){
                switch (turn%4){
                    case 0:col++;break;
                    case 1:row++;break;
                    case 2:col--;break;
                    case 3:row--;break;
                }
                arr[row][col]=value;
                value++;
            }
            if(turn%2==0) index--;
            turn++;
        }
        show(arr);
    }
    
    public static void strannoObhojdane(int n){
        int[][] arr=new int[n][n];
        int value=1,maxValue=n*n;
        int row=0,col=0,index=n-1,turn=0;
        arr[0][0]=1;
        value++;
        while(index>0){
            for(int i=0;i<index;i++){
                switch (turn%4){
                    case 0:col++;break;
                    case 1:row++;break;
                    case 2:row--;break;
                    case 3:col--;break;
                }
                arr[row][col]=value;
                value++;
            }
            
            if(turn%2==1){
                index--;
                if(col==0) row++;
                else col--;
                arr[row][col]=value;
                value++;
            }
            turn++;
        }
        showWithTab(arr);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        spiralovidnoObhojdane(n);
        System.out.println("");
        strannoObhojdane(n);
    }

    private static void show(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length-1;j++){
                System.out.print(arr[i][j]+" ");
            }
            if(i<arr.length-1) System.out.println(arr[i][arr[0].length-1]);
            else System.out.print(arr[i][arr[0].length-1]);
        }
    }
    private static void showWithTab(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length-1;j++){
                System.out.print("\t"+arr[i][j]);
            }
            if(i<arr.length-1) System.out.println("\t"+arr[i][arr[0].length-1]);
            else System.out.print("\t"+arr[i][arr[0].length-1]);
        }
    }
    
    
}
