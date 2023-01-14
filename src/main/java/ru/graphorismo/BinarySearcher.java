package ru.graphorismo;

import java.util.List;

public class BinarySearcher <T extends Comparable<T>> {

    private final List<T> dataList;

    public BinarySearcher(List<T> dataList) {
        this.dataList = dataList;
    }

    public int search(T element){
        int left = 0;
        int right = dataList.size() - 1;
        int result = -1;
        while (left <= right) {
            int middle = Math.round((left+1+right+1)/2f)-1;
            T middleValue = dataList.get(middle);
            if (element.compareTo(middleValue) < 0){
                right = middle - 1;
            } else if (element.compareTo(middleValue) > 0){
                left = middle + 1;
            } else{
                result = middle;
                break;
            }

        }
        return result;
    }


}
