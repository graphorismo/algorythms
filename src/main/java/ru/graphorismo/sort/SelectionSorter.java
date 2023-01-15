package ru.graphorismo.sort;

import java.util.ArrayList;
import java.util.List;

public class SelectionSorter <T extends Comparable<T>>{

    private final List<T> dataList;

    public SelectionSorter(List<T> dataList) {
        this.dataList = dataList;
    }

    public List<T> sortInAscendingOrderIntoCopy(){
        List<T> copyList = new ArrayList<>(dataList);
        List<T> sortedList = new ArrayList<>();

        while(copyList.size() > 0){
            T minimalElement = copyList.get(0);
            for(T element : copyList){
                if (element.compareTo(minimalElement) < 0)
                    minimalElement = element;
            }
            copyList.remove(minimalElement);
            sortedList.add(minimalElement);
        }
        return sortedList;
    }

    public List<T> sortInDescendingOrderIntoCopy(){
        List<T> copyList = new ArrayList<>(dataList);
        List<T> sortedList = new ArrayList<>();

        while(copyList.size() > 0){
            T maximalElement = copyList.get(0);
            for(T element : dataList){
                if (element.compareTo(maximalElement) > 0)
                    maximalElement = element;
            }
            copyList.remove(maximalElement);
            sortedList.add(maximalElement);
        }
        return sortedList;
    }
}
