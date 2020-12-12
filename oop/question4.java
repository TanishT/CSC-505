import java.util.*;

public class question4 {
    public static void main(String[] args) {
        List<Double> li = new ArrayList<Double>();
        for (double i = 0.0; i < 50; i++) {
            li.add(i);
        }
        print(li);
    }

    /* method is compilable */
    public static void print(List<? extends Number> list) {
        for (Number n : list)
          System.out.print(n + " ");
        System.out.println();
      }
}