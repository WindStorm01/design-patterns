package com.rh.factoryMode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Test {



    public static int[] sort(int[] list){
        for (int i = 0; i < list.length - 1; i++){
            for (int j=0; j <list.length -1 -i; j++){
                boolean flag = false;
                if (list[j] > list[j+1]){
                    int tmp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = tmp;
                    flag = true;
                }
                if (!flag){
                    break;
                }

            }
        }

        return list;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] list = {65, 55, 45, 35, 25, 15, 10};
        int[] sort = sort(list);
        IntStream intStream = Arrays.stream(list).map(i -> i + 1).filter(value -> value ==1);
        printArray(sort);



    }
}
