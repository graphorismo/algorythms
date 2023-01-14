package ru.graphorismo;

public class IntWrapper implements Comparable<IntWrapper>{

    private final Integer wrappedValue;

    public IntWrapper(Integer wrappedValue) {
        this.wrappedValue = wrappedValue;
    }

    public Integer getWrappedValue() {
        return wrappedValue;
    }

    @Override
    public int compareTo(IntWrapper other) {
        return this.getWrappedValue() - other.getWrappedValue();
    }
}
