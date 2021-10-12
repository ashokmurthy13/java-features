package com.learn.java.features.sort;

import java.util.Arrays;

public class PrimitivesSort {

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 9, 3, 1, 8, 4};
        Arrays.sort(arr); // uses DualPivotQuickSort
        System.out.println(Arrays.toString(arr));

        float[] flt = {10.1f, 5.3f, 2.4f, 9.1f, 3.9f, 1.0f, 8.5f, 4.6f, 10.0f};
        Arrays.sort(flt); // uses DualPivotQuickSort
        System.out.println(Arrays.toString(flt));
    }
}
