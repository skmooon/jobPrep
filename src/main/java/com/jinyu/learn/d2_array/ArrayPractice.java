package com.jinyu.learn.d2_array;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }

        int[] array1 = {3, 1, 4, 1, 5};
        System.out.println(array1.length);
        int res = 0;
        for (int j = 0; j < array1.length; j++) {
            res += array1[j];
        }
        System.out.println(res);

        int max = array1[0];
        for (int k = 0; k < array1.length; k++) {
            if (array1[k] > max) {
                max = array1[k];
            }
        }
        System.out.println(max);

        int l = 0;
        int r = array1.length-1;
        while(l<r){
            int tmp = 0;
            tmp = array1[l];
            array1[l] = array1[r];
            array1[r] = tmp;
            ++l;
            --r;
        }
        for (int a = 0; a < array1.length; a++) {
            System.out.println(array1[a]);
        }

        System.out.println(array1[5]);
    }
}
