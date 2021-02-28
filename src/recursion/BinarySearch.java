/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import static recursion.Recursion.arr;

/**
 *
 * @author ALKODS
 */
public class BinarySearch {

    public static boolean recBinarySearch(int key, int lower, int higher) {

        int pos = (lower + higher) / 2;

        if (arr[pos] == key) {
            return true;
        } else if (lower > higher) {
            return false;
        } else {

            if (key > arr[pos]) {
                return recBinarySearch(key, pos + 1, higher); // Search Right
            } else {
                return recBinarySearch(key, lower, pos - 1); //Search Left
            }
        }

    }
}
