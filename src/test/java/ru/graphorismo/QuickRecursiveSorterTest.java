package ru.graphorismo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.graphorismo.sort.QuickRecursiveSorter;

import java.util.ArrayList;
import java.util.List;

public class QuickRecursiveSorterTest {

    @Test
    void whenSortEmptyThenReturnEmpty(){
        List<Integer> inputList = new ArrayList<>();
        List<Integer> expectedList = new ArrayList<>();
        QuickRecursiveSorter<Integer> sorter = new QuickRecursiveSorter<>(inputList);
        List<Integer> resultList = sorter.sortInAscendingOrderIntoCopy();
        Assertions.assertIterableEquals(expectedList, resultList);
    }

    @Test
    void whenSortSingleThenReturnSingle(){
        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        QuickRecursiveSorter<Integer> sorter = new QuickRecursiveSorter<>(inputList);
        List<Integer> resultList = sorter.sortInAscendingOrderIntoCopy();
        Assertions.assertIterableEquals(expectedList, resultList);
    }

    @Test
    void whenSortStraightThenReturnStraight(){
        List<Integer> inputList = new ArrayList<>();
        inputList.add(3);
        inputList.add(3);
        inputList.add(3);
        inputList.add(3);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(3);
        expectedList.add(3);
        expectedList.add(3);
        expectedList.add(3);

        QuickRecursiveSorter<Integer> sorter = new QuickRecursiveSorter<>(inputList);
        List<Integer> resultList = sorter.sortInAscendingOrderIntoCopy();
        Assertions.assertIterableEquals(expectedList, resultList);
    }

    @Test
    void whenSortAscendingThenReturnAscending(){
        List<Integer> inputList = new ArrayList<>();
        inputList.add(6);
        inputList.add(5);
        inputList.add(4);
        inputList.add(3);
        inputList.add(2);
        inputList.add(1);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(3);
        expectedList.add(4);
        expectedList.add(5);
        expectedList.add(6);

        QuickRecursiveSorter<Integer> sorter = new QuickRecursiveSorter<>(inputList);
        List<Integer> resultList = sorter.sortInAscendingOrderIntoCopy();
        Assertions.assertIterableEquals(expectedList, resultList);
    }

    @Test
    void whenSortDescendingThenReturnDescending(){
        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(4);
        inputList.add(5);
        inputList.add(6);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(6);
        expectedList.add(5);
        expectedList.add(4);
        expectedList.add(3);
        expectedList.add(2);
        expectedList.add(1);

        QuickRecursiveSorter<Integer> sorter = new QuickRecursiveSorter<>(inputList);
        List<Integer> resultList = sorter.sortInDescendingOrderIntoCopy();
        Assertions.assertIterableEquals(expectedList, resultList);
    }
}
