package com.sarvesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 1);
        System.out.println(firstRepeatedItem(array));
    }

    public static int firstRepeatedItem(List<Integer> array) {
        List<Integer> newArray = new ArrayList<>();
        for (Integer integer : array) {
            if (newArray.contains(integer)) {
                return integer;
            } else {
                newArray.add(integer);
            }
        }
        return 0;
    }
}
