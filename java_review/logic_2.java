public class logic_2 {
    public static int makeChocolate(int small, int big, int goal) {
        long maxCount = 5 * big + small;
        if (maxCount < goal) return -1;
        long bigBar = goal/5;
        //System.out.println(bigBar);
        if (bigBar*5==goal && bigBar <= big) return 0;
        else if(bigBar > big) bigBar = big;
        //System.out.println(bigBar);
        long smallBar = goal-(bigBar*5);
        if (smallBar > small) return -1;
        return (int)smallBar;
    }

    public static void main(String[] args) {
        System.out.println(makeChocolate(9,3,18));
    }
}