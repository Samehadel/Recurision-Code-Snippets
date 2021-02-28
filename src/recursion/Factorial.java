/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author ALKODS
 */
public class Factorial {

    public static int factorial(int n) {
        int temp = 0;

        if (n == 1) 
            return 1;

        temp = n * factorial(n - 1);

        return temp;
    }
}
