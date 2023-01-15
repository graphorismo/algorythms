package ru.graphorismo.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeRecursiveSorter<T extends Comparable<T>> implements ISorter<T>{

    private final List<T> dataList;

    public MergeRecursiveSorter(List<T> dataList) {
        this.dataList = dataList;
    }

    @Override
    public List<T> sortInAscendingOrderIntoCopy() {
        List<T> copyList = new ArrayList<>(dataList);
        List<T> sortedList = mergeSortAscending(copyList);
        return sortedList;
    }

    private List<T> mergeSortAscending(List<T> list) {
        if (list.size() <= 1) {
            return list;
        } else {
            List<T> left = new ArrayList<>();
            List<T> right = new ArrayList<>();
            for (int i = 0; i < (list.size()/2); ++i) {
                T elementToAdd = list.get(i);
                left.add(elementToAdd);
            }
            for (int i = (list.size()/2); i < list.size(); ++i) {
                T elementToAdd = list.get(i);
                right.add(elementToAdd);
            }
            left = mergeSortAscending(left);
            right = mergeSortAscending(right);
            return mergeAscending(left, right);
        }
    }

    private List<T> mergeAscending(List<T> left, List<T> right) {
        List<T> result = new ArrayList<>();

        while ( !left.isEmpty() && !right.isEmpty() ) {
            T leftFirst = left.get(0);
            T rightFirst = right.get(0);
            if ( leftFirst.compareTo(rightFirst) <= 0) {
                result.add(leftFirst);
                left.remove(0);
            }else{
                result.add(rightFirst);
                right.remove(0);
            }
        }
        while ( !left.isEmpty() ) {
            T leftFirst = left.get(0);
            result.add(leftFirst);
            left.remove(0);
        }
        while ( !right.isEmpty() ) {
            T rightFirst = right.get(0);
            result.add(rightFirst);
            right.remove(0);
        }

        return result;
    }

    @Override
    public List<T> sortInDescendingOrderIntoCopy() {
        List<T> copyList = new ArrayList<>(dataList);
        List<T> sortedList = mergeSortDescending(copyList);
        return sortedList;
    }

    private List<T> mergeSortDescending(List<T> list) {
        if (list.size() <= 1) {
            return list;
        } else {
            List<T> left = new ArrayList<>();
            List<T> right = new ArrayList<>();
            for (int i = 0; i < (list.size()/2); ++i) {
                T elementToAdd = list.get(i);
                left.add(elementToAdd);
            }
            for (int i = (list.size()/2); i < list.size(); ++i) {
                T elementToAdd = list.get(i);
                right.add(elementToAdd);
            }
            left = mergeSortDescending(left);
            right = mergeSortDescending(right);
            return mergeDescending(left, right);
        }
    }

    private List<T> mergeDescending(List<T> left, List<T> right) {
        List<T> result = new ArrayList<>();

        while ( !left.isEmpty() && !right.isEmpty() ) {
            T leftFirst = left.get(0);
            T rightFirst = right.get(0);
            if ( leftFirst.compareTo(rightFirst) >= 0) {
                result.add(leftFirst);
                left.remove(0);
            }else{
                result.add(rightFirst);
                right.remove(0);
            }
        }
        while ( !left.isEmpty() ) {
            T leftFirst = left.get(0);
            result.add(leftFirst);
            left.remove(0);
        }
        while ( !right.isEmpty() ) {
            T rightFirst = right.get(0);
            result.add(rightFirst);
            right.remove(0);
        }

        return result;
    }
}

