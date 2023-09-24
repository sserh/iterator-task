package ru.raccoon;

import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    private int min, max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator(min, max);
    }
}