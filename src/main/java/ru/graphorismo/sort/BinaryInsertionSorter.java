package ru.graphorismo.sort;

import ru.graphorismo.BinarySearcher;

import java.util.ArrayList;
import java.util.List;

public class BinaryInsertionSorter <T extends Comparable<T>> implements ISorter<T>{

    private final List<T> dataList;

    private int rightIdOfSortedPart = 0;

    public BinaryInsertionSorter(List<T> dataList) {
        this.dataList = dataList;
    }

    @Override
    public List<T> sortInAscendingOrderIntoCopy() {
        rightIdOfSortedPart = 0;
        List<T> copyList = new ArrayList<>(dataList);
        for (int leftIdOfUnsortedPart = 1;
             leftIdOfUnsortedPart < copyList.size();
             leftIdOfUnsortedPart++ )
        {
            T elementToMove = copyList.get(leftIdOfUnsortedPart);
            rightIdOfSortedPart = leftIdOfUnsortedPart -1;
            int positionToInsert = binarySearchPositionToInsertElementIntoAscendingSortedPart(elementToMove);
            copyList.remove(leftIdOfUnsortedPart);
            copyList.add(positionToInsert, elementToMove);
        }
        return copyList;
    }

    public int binarySearchPositionToInsertElementIntoAscendingSortedPart(T element){
        int left = 0;
        int right = rightIdOfSortedPart;
        while (left < right) {
            int middle = Math.round((left+1+right+1)/2f)-1;
            T middleValue = dataList.get(middle);
            if (element.compareTo(middleValue) <= 0){
                right = middle - 1;
            } else if (element.compareTo(middleValue) > 0){
                left = middle + 1;
            }
        }
        return right;
    }

    @Override
    public List<T> sortInDescendingOrderIntoCopy() {
        rightIdOfSortedPart = 0;
        List<T> copyList = new ArrayList<>(dataList);
        for (int leftIdOfUnsortedPart = 1;
             leftIdOfUnsortedPart < copyList.size();
             leftIdOfUnsortedPart++ )
        {
            T elementToMove = copyList.get(leftIdOfUnsortedPart);
            rightIdOfSortedPart = leftIdOfUnsortedPart -1;
            int positionToInsert = binarySearchPositionToInsertElementIntoDescendingSortedPart(elementToMove);
            copyList.remove(leftIdOfUnsortedPart);
            copyList.add(positionToInsert, elementToMove);
        }
        return copyList;
    }

    public int binarySearchPositionToInsertElementIntoDescendingSortedPart(T element){
        int left = 0;
        int right = rightIdOfSortedPart;
        while (left < right) {
            int middle = Math.round((left+1+right+1)/2f)-1;
            T middleValue = dataList.get(middle);
            if (element.compareTo(middleValue) >= 0){
                right = middle - 1;
            } else if (element.compareTo(middleValue) < 0){
                left = middle + 1;
            }
        }
        return right;
    }
}
