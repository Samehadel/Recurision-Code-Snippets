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
public class Power {
    public static int power(int x, int y){
        if(y == 1) return x;
        
        if(y % 2 != 0) return power(x * x, y / 2) * x;
        
        return power(x * x, y / 2);
    }
}
