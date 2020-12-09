public class string_1 {
    public static String conCat(String a, String b) {
        String concatenated = a.concat(b);
        if (a.length() > 0 && b.length() > 0 && Character.toString(concatenated.charAt(a.length()-1)).equals(Character.toString(concatenated.charAt(a.length())))) {
            return concatenated.substring(0,a.length()-1) +concatenated.substring(a.length());
        }
        return concatenated;
    }
    public static void main(String[] args) {
        System.out.println(conCat("", "cat"));
    }
}
