package org.algorithm.benchmark;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortingServiceImplTest {

    private SortingService service = new SortingServiceImpl();
    private SortingApp.MyState state = new SortingApp.MyState();

    @Test
    void sort() {
        int[] result = service.sort(state.unsortedArray);
        assertArrayEquals(state.sortedArray, result);
    }

    @Test
    void sort_simple_with_duplicates() {
        int[] unsortedArray = {3, 5, 1, 9, 4, 3, 5, 2, 7};
        int[] sortedArray   = {1, 2, 3, 3, 4, 5, 5, 7, 9};
        int[] result = service.sort(unsortedArray);
        assertArrayEquals(sortedArray, result);
    }


    @Test
    void sort_simple() {
        int[] unsortedArray = {5, 1, 9, 4, 3, 2, 7};
        int[] sortedArray   = {1, 2, 3, 4, 5, 7, 9};
        int[] result = service.sort(unsortedArray);
        assertArrayEquals(sortedArray, result);
    }

}