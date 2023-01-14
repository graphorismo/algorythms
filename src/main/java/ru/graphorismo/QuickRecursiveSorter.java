package ru.graphorismo;

import java.util.ArrayList;
import java.util.List;

public class QuickRecursiveSorter <T extends Comparable<T>> {

    private final List<T> dataList;

    public QuickRecursiveSorter(List<T> dataList) {
        this.dataList = dataList;
    }

    public List<T> sortInAscendingOrderIntoCopy(){
        List<T> copy = new ArrayList<>(dataList);
        List<T> result = quicksortAscending(copy);
        return result;
    }

    private List<T> quicksortAscending(List<T> input){
        if (input.size() < 2){
            return input;
        }
        else{
            T pivot = input.get(0);

            List<T> less = new ArrayList<>();
            for (int i = 1; i < input.size(); ++i){
                T element = input.get(i);
                if (element.compareTo(pivot) < 0 || element.compareTo(pivot) == 0){
                    less.add(element);
                }
            }

            List<T> greater = new ArrayList<>();
            for (int i = 1; i < input.size(); ++i){
                T element = input.get(i);
                if (element.compareTo(pivot) > 0){
                    greater.add(element);
                }
            }

            List<T> sumList = new ArrayList<>();
            sumList.addAll( quicksortAscending(less) );
            sumList.add(pivot);
            sumList.addAll( quicksortAscending(greater) );

            return sumList;
        }
    }

    public List<T> sortInDescendingOrderIntoCopy(){
        List<T> copy = new ArrayList<>(dataList);
        List<T> result = quicksortDescending(copy);
        return result;
    }

    private List<T> quicksortDescending(List<T> input){
        if (input.size() < 2){
            return input;
        }
        else{
            T pivot = input.get(0);

            List<T> less = new ArrayList<>();
            for (int i = 1; i < input.size(); ++i){
                T element = input.get(i);
                if (element.compareTo(pivot) < 0 || element.compareTo(pivot) == 0){
                    less.add(element);
                }
            }

            List<T> greater = new ArrayList<>();
            for (int i = 1; i < input.size(); ++i){
                T element = input.get(i);
                if (element.compareTo(pivot) > 0){
                    greater.add(element);
                }
            }

            List<T> sumList = new ArrayList<>();
            sumList.addAll( quicksortDescending(greater) );
            sumList.add(pivot);
            sumList.addAll( quicksortDescending(less) );

            return sumList;
        }
    }

}
