package adt.interfaces;

import adt.exceptions.ListIndexOutOfBoundsException;

public interface List<E> {

    public void createList();

    public void add(int index, E item) throws ListIndexOutOfBoundsException;

    public void remove(int index) throws ListIndexOutOfBoundsException;

    public boolean isEmpty();

    public E get(int index) throws ListIndexOutOfBoundsException;

    public int size();

    public boolean contains(Object o);

    public void clear();

    public boolean equals(Object o);

    public void sort();

}
