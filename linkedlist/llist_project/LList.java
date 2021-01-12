package llist_project;

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
        if (size == 0) {
            tail = new Link<E>(newData);
            head = new Link<E>(newData);
        } else {
            Link<E> temp = new Link<E>(newData);
            tail.setNext(temp);
            tail = temp;
        }
        size++;
    }

    //adds a new link to the beginning of the list
    public void prepend(E d) {
        if (size == 0) {
            head = tail = new Link<E>(d);
        } else {  
            Link<E> temp = head;
            head = new Link<E>(d, temp);
        }
        size++;
    }

    //Add value to the list at position index.
    //When index is out of bounds, do nothing.
    public void insert(int index, E value) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds");
        } 
        if (index == 0) {
            prepend(value);
        } else {
            Link<E> add = new Link<E>(value);
            Link<E> curr = head;
            for (int i = 0; i < index-1; i++) {
                curr = curr.getNext();
            }
            Link<E> temp = curr.getNext();
            curr.setNext(add);
            add.setNext(temp);
            size++;
        }
    }

    //return the number of items in the list
    public int size() {
        return size;
    }

    //Remove and return the value at position index from the list.
    //When index is out of bounds, return null.
    //public E remove(int index) {
    //    if (index > size || index < 0) {
    //        throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds");
    //    } 
    //}

    //Return the value at position index.
    public E get(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds");
        } 
        if (index < size - 1) {
            Link<E> curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.getNext();
            }
            return curr.getData();
        }
        return tail.getData(); //case if index is for tail value
    }

    //Modify the data at index to replace it with value
    //return the old value
    //when index is out of bounds, return null
    public E set(int index, E value) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds");
        } 
        if (index < size - 1) {
            Link<E> curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.getNext();
            }
            E old = curr.getData();
            curr.setData(value);
            return old;
        }
        E old = tail.getData();
        tail.setData(value);
        return old;
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
            System.out.println(curr.getNext());
        }
        return linkedList.toString();
    }

    public static void main(String[] args) {
        LList<String> list = new LList<String>();
        list.prepend("Apple");
        list.prepend("Banana");
        list.prepend("Jackfruit");
        list.append("Orange");
        System.out.println(list.toString());
        System.out.println(list.size());
        System.out.println(list.get(3));
        System.out.println(list.set(3, "3"));
        System.out.println(list.toString());
        list.insert(0, "testing");
        System.out.println(list.toString());
    }
}