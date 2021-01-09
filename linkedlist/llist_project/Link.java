import java.util.Arrays;

public class Link<E> {
    // attributes
    private E data;
    private E next;
    
    //constructors
    public Link(E d) {
        data = d;
        next = null;
    }
    
    public Link(E d, E n) {
        data = d;
        next = n;
    }
    
    public void setData(E d) {
        data = d;
    } 
    
    public E getData() {
        return data;
    }
    
    public void setNext(E n) {
        next = n;
    }
    
    public E getNext() {
        return next;
    }

    public String toString() {
        return data + " --> " + next;
    }
}