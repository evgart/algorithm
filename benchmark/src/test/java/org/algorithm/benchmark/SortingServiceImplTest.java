package org.algorithm.benchmark;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortingServiceImplTest {

    private SortingService service = new SortingServiceImpl();
    private SortingApp.MyState state = new SortingApp.MyState();

    @org.junit.jupiter.api.Test
    void sort() {
        int[] result = service.sort(state.unsortedArray);
        assertArrayEquals(state.sortedArray, result);
    }
}