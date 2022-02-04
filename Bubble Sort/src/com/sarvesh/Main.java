package com.sarvesh;

public class Main {

    public static void main(String[] args) {

        int[] array = {2,6,3,5,90,45,67,32,69,56,23,100};

        for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i = 0; i < lastUnsortedIndex; i++) {
                if(array[i] > array[i+1]) {
                    swap(array, i, i+1);
                }
            }
        }

        for(int i = 0; i < array.length-1; i++) {
            System.out.println(array[i]);
        }


    }

    public static void swap(int[] array, int i, int j) {
        if(i==j){
            return;
        } else {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}