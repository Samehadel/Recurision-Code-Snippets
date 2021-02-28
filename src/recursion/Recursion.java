/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;


public class Recursion {

    static int [] arr = {2, 3, 7, 9, 20, 102, 200};
    
    public static void main(String[] args) {
        int nFactorial = 5; //For factorial
        int searchNumber = 22; //For binary search
        int x = 3, y = 18; //For Power problem
        
        System.out.println("Factorial of " + nFactorial + " is: " + Factorial.factorial(nFactorial));
        System.out.println("Binary Search for " + searchNumber + " is: " + BinarySearch.recBinarySearch(searchNumber, 0, arr.length - 1));
    
        System.out.println("Power " + x + " of " + y + " is: " + Power.power(x, y));
    
    }
    
}
