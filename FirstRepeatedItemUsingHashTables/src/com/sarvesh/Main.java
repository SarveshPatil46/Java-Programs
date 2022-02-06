package com.sarvesh;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1, 2, 34, 2};
        System.out.println(firstRepeatedItem(array));
    }

    public static int firstRepeatedItem(int[] array) {
        Hashtable<Integer, Integer> newArray = new Hashtable<>();
        for (int i = 0; i < array.length; i++) {
            if (newArray.contains(array[i])) {
                return array[i];
            } else {
                newArray.put(array[i], i);
            }
        }
        return 0;
    }
}