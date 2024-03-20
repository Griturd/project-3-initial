package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag<T> implements Container<T> {

    private List<T> stringBag;

    public Bag() {
        this.stringBag = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return this.stringBag.isEmpty();
    }

    @Override
    public int size() {
        return this.stringBag.size();
    }

    @Override
    public void add(T item) {
        this.stringBag.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return this.stringBag.iterator();
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bag =");
        sb.append(stringBag);
        return sb.toString();
    }
}
