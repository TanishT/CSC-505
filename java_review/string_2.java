public class string_2 {
    public boolean catDog(String str) {
        String look = "cat";
        String look2 = "dog";
        int count1 = str.split(look, -1).length-1;
        int count2 = str.split(look2, -1).length-1;
        return count1==count2;
    }
}