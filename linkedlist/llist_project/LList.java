package llist_project;

public class LList<E> {
    //attributes
    //head must always refer (point) to the first link in the list.
    protected Link<E> head;
    protected Link<E> tail; //refers to the last Link in this LList
    protected int size;  //stores the number of items currently in this LList (zero for empty list)

    //constructor
    public LList () {
        head = null;
        tail = null;
        size = 0;
    }

    //add a new Link that contains newData to the end of this list
    public void append(E newData) {
        if (size == 0) {
            head = tail = new Link<E>(newData);
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
    public E remove(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds");
        } 
        if (index == 0) {
            E ret = head.getData();
            head = head.getNext();
            size--;
            return ret;
        }
        Link<E> curr = head;
        for (int i = 0; i < index-1; i++) {
            curr = curr.getNext();
        } 
        E ret = curr.getNext().getData();
        curr.setNext(curr.getNext().getNext());
        
        size--;
        return ret;
    }

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

    public void swap(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds");
        } else if (size < 2) {
            throw new IndexOutOfBoundsException("not enough  elements in list for swap to take place");
        }
        if (index == 0) {
            //value at idx 1 becomes value at idx 0
            Link<E> temp = head;
            head.setData(head.getNext().getData());
            head.setNext(temp);
        } else if (index == size - 1) {
            throw new IndexOutOfBoundsException("cannot swap null with an element");
        }else {
            Link<E> curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.getNext();
            }
            Link<E> temp = new Link<E>(curr.getData(), curr);
            System.out.println(temp.getData());
            Link<E> inFront = curr.getNext();
            System.out.println(inFront.getData());
            curr.setData(inFront.getData());
            inFront.setData(temp.getData());
        }
    }

    public boolean removeAll(E value) {
        Link<E> curr = head;
        int idx = 0;
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (curr.getData().equals(value)) {
                remove(idx);
                found = true;
            }
            curr = curr.getNext();
            idx++;
        }
        return found;
    }

    /*public String toString() {
        StringBuilder linkedList = new StringBuilder();
        Link<E> curr = head;
        int currSize = 0;
        while (currSize <= size) {
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
            System.out.println(curr);
            currSize++;
        }
        return linkedList.toString();
    }*/

    public void print(){
        Link<E> curr = head;
        int s = 0;
        while (s <= size) {
            if (curr == null) {
                break;
            }
            System.out.println(curr.getData() + "-->");
            curr = curr.getNext();
            
            s++;
        }
    }

    public static void main(String[] args) {
        /*LList<String> list = new LList<String>();
        list.prepend("Apple");
        list.prepend("Banana");
        list.prepend("Jackfruit");
        list.append("Orange");
        list.append("Cherry");
        System.out.println(list.toString());
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.set(0, "3"));
        System.out.println(list.toString());
        list.insert(0, "testing");
        System.out.println(list.toString());
        LList<String> list2 = new LList<String>();
        list2.append("Apple");
        System.out.println(list2.size());

        list2.remove(0);
        System.out.println(list2.toString());*/
        LList<String> list = new LList<String>();
        list.append("A");
        list.append("B");
        list.append("C");
        list.append("D");
        list.append("C");
        list.append("E");
        //list.prepend("C");
        list.print();

        list.removeAll("C");
        System.out.println("\n");
        list.print();

    }
}