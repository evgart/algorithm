package org.algorithm.benchmark;

public interface SortingService {

    int[] sort(int[] unsortedArray);

    default void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
