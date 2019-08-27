package org.algorithm.benchmark;


import java.util.Arrays;

public class SortingServiceImpl implements SortingService{
    public int[] sort(int[] unsortedArray) {
       Arrays.sort(unsortedArray);;
       return unsortedArray;
    }
}
