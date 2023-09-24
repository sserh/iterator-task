package ru.raccoon;

import java.util.Iterator;
import java.util.Random;

public class RandomIterator implements Iterator<Integer> {

    private int min, max;

    public RandomIterator(int min, int max) {
        try {
            this.min = min;
            this.max = max + 1;
        } catch (Exception ignored) {
        }
    }
    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return new Random().nextInt(max - min) + min;
    }
}
