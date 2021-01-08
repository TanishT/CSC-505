import java.lang.reflect.Array;
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
    
    public static void sort(Link<String>[] arr) {
        //steps:
        //1. organize alphabetically
        //2. set next to value of arr[i+1]
        String[] vals;
        vals = (String[]) Array.newInstance(String.class, arr.length);
        for (int i = 0; i < arr.length; i++) {
            vals[i] = (String) arr[i].data;
        }
        Arrays.sort(vals);
        for (int i = 0; i < arr.length; i++) {
            arr[i].data = (String) vals[i];
            if (i > 0) {
                arr[i-1].next = arr[i].data;
            }
        }
    }

    public static Link<String>[] remove(Link<String>[] arr, int idx) {
        // steps
        // 1: create new link<string>[]
        // 2:
        
        Link<String>[] modified = new Link[arr.length - 1];
        modified =arr;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            //modified[counter].setData(arr[i].data);
            //modified[counter].setNext(arr[i].next);
            if (i == idx) {
                if (i == arr.length - 1) {
                    modified[counter].next = null;
                } else {
                    modified[counter-1].next = modified[counter].next;
                }
            } else {
                modified[counter].data = arr[i].data;
                modified[counter].next = arr[i].next;
                counter++;
            }
        }
        return modified;
    }

    public String toString() {
        return data + " --> " + next;
    }

    public static void main(String[] args) {
        //part a 
        Link<String> a = new Link<String>("Banana");
        Link<String> b = new Link<String>("Apple");
        Link<String> c = new Link<String>("Jackfruit");

        //part b
        Link<String>[] arr = new Link[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        sort(arr);
        System.out.println("Part B");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }

        //part c
        System.out.println("\nPart C");
        arr = remove(arr, 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }
}