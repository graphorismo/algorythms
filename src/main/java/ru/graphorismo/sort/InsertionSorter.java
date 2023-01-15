package ru.graphorismo.sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class InsertionSorter <T extends Comparable<T>> implements ISorter<T>{

    private final List<T> dataList;

    public InsertionSorter(List<T> dataList) {
        this.dataList = dataList;
    }

    @Override
    public List<T> sortInAscendingOrderIntoCopy() {
        List<T> copyList = new ArrayList<>(dataList);
        for (int i = 1; i < copyList.size(); i++ ){
            T elementToInsert = copyList.get(i);
            for(int j = i - 1; j >=0; --j){
                T elementToCompare = copyList.get(j);
                if (elementToCompare.compareTo(elementToInsert) <= 0 || j==0){
                    copyList.remove(i);
                    copyList.add(j, elementToInsert);
                    break;
                }
            }

        }
        return copyList;
    }

    @Override
    public List<T> sortInDescendingOrderIntoCopy() {
        List<T> copyList = new ArrayList<>(dataList);
        for (int i = 1; i < copyList.size(); i++ ){
            T elementToInsert = copyList.get(i);
            for(int j = i - 1; j >=0; --j){
                if (copyList.get(j).compareTo(elementToInsert) >= 0 || j==0){
                    copyList.remove(i);
                    copyList.add(j, elementToInsert);
                    break;
                }
            }

        }
        return copyList;
    }
}
