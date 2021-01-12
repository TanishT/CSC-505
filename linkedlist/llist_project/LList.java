package llist_project;

import java.lang.StringBuilder;

public class LList<E> {
    //attributes
    //head must always refer (point) to the first link in the list.
    private Link<E> head;

    //constructor
    public LList () {
        head = null;
    }

    //add a new Link that contains newData to the end of this list
    public void append(E newData) {
        Link<E> temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(new Link<E>(newData));
    }

    //adds a new link to the beginning of the list
    public void prepend(E d) {
        Link<E> temp = head;
        head = new Link<E>(d, temp);
    }

    public String toString() {
        StringBuilder linkedList = new StringBuilder();
        Link<E> curr = head;
        boolean done = false;
        while (done == false) {
            if (curr.getNext() == null) {
                done = true;
                linkedList.append("-->null");
                break;
            }
            String data = "";
            if (curr == head) {
                data = curr.getData() + "-->" + curr.getNext().getData();
            } else {
               data = "-->" + curr.getNext().getData();
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