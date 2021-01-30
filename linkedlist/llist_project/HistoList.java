package llist_project;

public class HistoList<E> extends LList<E> {
    public HistoList() {
        super();
    }

    public void insert(E newValue) {
        // adds a new HistoLink to the end of this listor
        // updates an existing nodein placeif there
        // is a match//size,head and tail should be maintained
        // as appropriate
        HistoLink<E> curr;

        // if head == null, then size also equals so, so head and tail need to point to
        // same spot
        // cant do curr = (HistoLink<E>) head; b/c of null pointer exception
        if (head == null) {
            head = tail = new HistoLink<E>(newValue, null);
            size++;
            return;
        } else {
            // having curr start at head
            curr = (HistoLink<E>) head;
        }

        // traversing loop and seeing if element is there
        while (curr.getNext() != null) {
            if (curr.getData().equals(newValue)) {
                curr.setCount(curr.getCount() + 1);
                return;
            }
            curr = (HistoLink<E>) curr.getNext();
        }

        // curr == tail at end of while loop, so need to check if newvalue =
        // tail.getdata since that never happens in while
        if (curr.getData().equals(newValue)) {
            curr.setCount(curr.getCount() + 1);
            return;
        }

        // adding a new value to the list
        curr = (HistoLink<E>) tail;
        // System.out.println(curr.toString());
        // add to end
        HistoLink<E> add = new HistoLink<E>(newValue, null);
        curr.setNext(add);
        tail = curr.getNext();
        size++;
    }

    public E remove(E toRemove) {
        // remove sa HistoLink from the list or reduces
        // its count by one//returns the value modified or null if not
        // present in the list//size,head and tail should be maintained as appropriate
        HistoLink<E> curr;
        if (head == null) {
            // empty list, nothing to remove
            try {
                throw new Exception("Exception Thrown - element not found");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // having curr start at head
        curr = (HistoLink<E>) head;
        HistoLink<E> prev = (HistoLink<E>) head;

        //if size == 1, then the while loop will not run, so check will not be able to happen
        //to solve this, we can just check before the loop and if we find something, we can return 
        if (size == 1) {
            if (curr.getCount() >= 2) {
                curr.setCount(curr.getCount()-1);
                E ret = curr.getData();
                return ret;
            }  else if (curr.getCount() == 1) {
                E ret = head.getData();
                head = tail = null;
                size--;
                return ret;
            }
        }

        while (curr.getNext() != null) {
            if (curr.getData().equals(toRemove)) {
                if (curr.getCount() >= 2) {
                    //remove 1 occurence of element
                    curr.setCount(curr.getCount()-1);
                    E ret = curr.getData();
                    return ret;
                } else if (curr.getCount() == 1) {
                    //remove element entirely from list
                    if (curr.getData().equals(head.getData())) {
                        E ret = head.getData();
                        head = head.getNext();
                        size--;
                        return ret;
                    }
                    E ret = curr.getData();
                    prev.setNext(curr.getNext());
                    size--;
                    return ret;
                }
            }
            prev = curr;
            curr = (HistoLink<E>) curr.getNext();
        }

        //since after while loop curr = tail, we dont check if tail = toremove in the loop so we need to do it now
        if (curr.getData().equals(tail.getData())) {
            E ret = tail.getData();
            tail = prev;
            prev.setNext(null);
            size--;
            return ret;
        }

        try {
            throw new Exception("Exception Thrown - element not found");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void print(){
        HistoLink<E> curr = (HistoLink<E>) head;
        if (size == 1) {
            System.out.println(curr.getCount() + " , " + curr.getData() + " --> null");
            return;
        }
        while (curr.getNext() != null) {
            System.out.println(curr.getCount() + " , " + curr.getData() + " --> ");
            curr = (HistoLink<E>) curr.getNext();
            if (curr.getNext() == null)
                System.out.println(curr.getCount() + " , " + curr.getData() + " --> null");        
        }
    }

    public static void main(String[] args) {
        HistoList<String> list = new HistoList<String>();
        list.insert("A");
        list.insert("A");

        list.insert("A");

        list.insert("A");

        list.insert("A");

        list.insert("A");

        list.insert("A");

        list.insert("A");

        list.insert("A");

        list.insert("B");
        list.insert("C");
        list.insert("B");
        list.insert("C");
        list.insert("C");
        list.insert("D");
        list.insert("E");
        list.insert("E");
        list.insert("E");
        list.insert("E");
        list.insert("E");
        list.insert("E");
        list.insert("E");
        list.print();
        System.out.println(list.size);

        list.remove("C");
        System.out.println("\n");
        list.remove("C");
        list.remove("C");
        list.remove("C");
        list.remove("C");
        list.remove("C");
        list.remove("C");
        list.remove("C");
        list.remove("C");list.remove("C");
        list.remove("C");list.remove("C");
        list.remove("C");list.remove("C");
        list.remove("C");list.remove("C");
        list.remove("C");list.remove("C");
        list.remove("C");list.remove("C");
        list.remove("C");
        list.print();

        list.remove("D");
        System.out.println("\n");
        list.print();

        list.remove("A");
        System.out.println("\n");
        list.print();

        list.remove("B");
        System.out.println("\n");
        list.print();

        list.remove("B");
        

        System.out.println(list.size);
    }
}