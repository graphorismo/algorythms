package ru.graphorismo.sort;

import java.util.List;

public interface ISorter <T extends Comparable<T>> {
    List<T> sortInAscendingOrderIntoCopy();
    List<T> sortInDescendingOrderIntoCopy();
}
