package adt.interfaces;

public interface Stack<E>{
    public void initializeStack();
    
    public void push(E element);
    
    public void pop();
    
    public E top();
    
    public int size();
    
    public boolean isEmpty(); 
    
    public boolean isFull(); 
}
