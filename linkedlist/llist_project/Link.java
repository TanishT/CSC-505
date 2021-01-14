package llist_project;

public class Link<E> {
    // attributes
    private E data;
    private Link<E> next;
    
    //constructors
    public Link(E d) {
        data = d;
        next = null;
    }
    
    public Link(E d, Link<E> n) {
        data = d;
        next = n;
    }
    
    public void setData(E d) {
        data = d;
    } 
    
    public E getData() {
        return data;
    }
    
    public void setNext(Link<E> n) {
        next = n;
    }
    
    public Link<E> getNext() {
        return next;
    }

    public String toString() {
        return data + " --> " + next;
    }
}