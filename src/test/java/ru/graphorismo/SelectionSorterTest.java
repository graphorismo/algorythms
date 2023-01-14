package ru.graphorismo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SelectionSorterTest {

    @Test
    void whenSortEmptyThenReturnEmpty(){
        List<Integer> inputList = new ArrayList<>();

        List<Integer> compareList = new ArrayList<>();

        SelectionSorter<Integer> sorter = new SelectionSorter<>(inputList);
        List<Integer> sortedList = sorter.sortInAscendingOrderIntoCopy();

        Assertions.assertIterableEquals(compareList, sortedList);
    }

    @Test
    void whenSortStraightThenReturnStraight(){
        List<Integer> inputList = new ArrayList<>();
        inputList.add(2);
        inputList.add(2);
        inputList.add(2);
        inputList.add(2);


        List<Integer> compareList = new ArrayList<>();
        compareList.add(2);
        compareList.add(2);
        compareList.add(2);
        compareList.add(2);


        SelectionSorter<Integer> sorter = new SelectionSorter<>(inputList);
        List<Integer> sortedList = sorter.sortInAscendingOrderIntoCopy();

        Assertions.assertIterableEquals(compareList, sortedList);
    }

    @Test
    void whenSortStraightStableThenReturnStraightStable(){

        IntWrapper first = new IntWrapper(2);
        IntWrapper second = new IntWrapper(2);
        IntWrapper third = new IntWrapper(2);

        List<IntWrapper> inputList = new ArrayList<>();
        inputList.add(first);
        inputList.add(second);
        inputList.add(third);


        List<IntWrapper> compareList = new ArrayList<>();
        compareList.add(first);
        compareList.add(second);
        compareList.add(third);


        SelectionSorter<IntWrapper> sorter = new SelectionSorter<>(inputList);
        List<IntWrapper> sortedList = sorter.sortInAscendingOrderIntoCopy();

        Assertions.assertIterableEquals(compareList, sortedList);
    }

    @Test
    void whenSortDescendedThenReturnAscended(){
        List<Integer> inputList = new ArrayList<>();
        inputList.add(9);
        inputList.add(8);
        inputList.add(7);
        inputList.add(6);
        inputList.add(5);
        inputList.add(4);
        inputList.add(3);
        inputList.add(2);
        inputList.add(1);

        List<Integer> compareList = new ArrayList<>();
        compareList.add(1);
        compareList.add(2);
        compareList.add(3);
        compareList.add(4);
        compareList.add(5);
        compareList.add(6);
        compareList.add(7);
        compareList.add(8);
        compareList.add(9);

        SelectionSorter<Integer> sorter = new SelectionSorter<>(inputList);
        List<Integer> sortedList = sorter.sortInAscendingOrderIntoCopy();

        Assertions.assertIterableEquals(compareList, sortedList);
    }
}
