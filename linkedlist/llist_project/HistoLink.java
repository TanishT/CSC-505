package llist_project;

public class HistoLink<E> extends Link<E> {
    private int count;
    public HistoLink(E value, HistoLink<E> nextLink){
        super(value, nextLink);
        count = 1;
    }

    public int getCount(){
        return count;
    }

    public void setCount(int newCount){
        count = newCount;
    }
}