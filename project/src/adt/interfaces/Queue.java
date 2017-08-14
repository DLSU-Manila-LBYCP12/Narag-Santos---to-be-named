package adt.interfaces;

public interface Queue<E>{
    public void createQueue();
    public void enqueue(E element);
    public void dequeue();
    public E getFront();
    public E getRear();
    public E item(int i);
    public boolean isEmpty(); 
    public boolean isFull(); 
    public int size();
}
