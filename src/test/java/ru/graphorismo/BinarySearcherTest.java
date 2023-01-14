package ru.graphorismo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BinarySearcherTest {

    @Test
    void whenEmptyDataThenReturnMinusOne(){
        List<Integer> dataList = new ArrayList<>();
        BinarySearcher<Integer> binarySearcher = new BinarySearcher<>(dataList);
        int result = binarySearcher.search(0);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void whenSearchSingleElementDataThenReturnOne(){
        List<Integer> dataList = new ArrayList<>();
        dataList.add(1);
        BinarySearcher<Integer> binarySearcher = new BinarySearcher<>(dataList);
        int result = binarySearcher.search(1);
        Assertions.assertEquals(0, result);
    }

    @Test
    void whenSearchMissingElementDataThenReturnMinusOne(){
        List<Integer> dataList = new ArrayList<>();
        dataList.add(1);
        BinarySearcher<Integer> binarySearcher = new BinarySearcher<>(dataList);
        int result = binarySearcher.search(2);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void whenSearchInEvenDataListThenFindByLogNSteps(){
        List<Integer> dataList = new ArrayList<>();
        dataList.add(1);
        dataList.add(2);
        dataList.add(3);
        dataList.add(4);
        dataList.add(5);
        dataList.add(6);
        BinarySearcher<Integer> binarySearcher = new BinarySearcher<>(dataList);
        int result = binarySearcher.search(2);
        Assertions.assertEquals(1, result);
    }

    @Test
    void whenSearchInOddDataListThenFindByLogNSteps(){
        List<Integer> dataList = new ArrayList<>();
        dataList.add(1);
        dataList.add(2);
        dataList.add(3);
        dataList.add(4);
        dataList.add(5);
        BinarySearcher<Integer> binarySearcher = new BinarySearcher<>(dataList);
        int result = binarySearcher.search(4);
        Assertions.assertEquals(3, result);
    }
}
