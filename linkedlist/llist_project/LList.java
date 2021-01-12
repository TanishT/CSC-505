package llist_project;

import java.lang.StringBuilder;

public class LList<E> {
    //attributes
    //head must always refer (point) to the first link in the list.
    private Link<E> head;
    private Link<E> tail; //refers to the last Link in this LList
    private int size;  //stores the number of items currently in this LList (zero for empty list)

    //constructor
    public LList () {
        head = null;
        tail = null;
        size = 0;
    }

    //add a new Link that contains newData to the end of this list
    public void append(E newData) {
        if (head == null) {
            head = new Link<E>(newData);
        } else {
            Link<E> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Link<E>(newData));
        }
        size++;
    }

    //adds a new link to the beginning of the list
    public void prepend(E d) {
        Link<E> temp = head;
        head = new Link<E>(d, temp);
        size++;
    }

    public String toString() {
        StringBuilder linkedList = new StringBuilder();
        Link<E> curr = head;
        while (true) {
            if (curr.getNext() == null) {
                linkedList.append(" --> null");
                break;
            }
            String data = "";
            if (curr == head) {
                data = curr.getData() + " --> " + curr.getNext().getData();
            } else {
               data = " --> " + curr.getNext().getData();
            }
            linkedList.append(data);
            curr = curr.getNext();
        }
        return linkedList.toString();
    }

    public static void main(String[] args) {
        LList<String> list = new LList<String>();
        list.prepend("Apple");
        list.prepend("Banana");
        list.append("Jackfruit");
        System.out.println(list.toString());
    }
}