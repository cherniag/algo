package com.gc.algo.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = {8, 4, 0, 2, 9, 5};
        new QuickSort().sort(a, 0, a.length - 1);

        System.err.println(Arrays.toString(a));
    }

    public void sort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = array[(start + end) / 2];
        int index = part(array, start, end, pivot);
        sort(array, start, index - 1);
        sort(array, index, end);
    }

    private int part(int[] array, int start, int end, int pivot) {
        while (start <= end) {
            while (array[start] < pivot) {
                start++;
            }

            while (array[end] > pivot) {
                end--;
            }

            if (start <= end) {
                swap(array, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    private void swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

}
