import java.util.Base64;

public class power {
    
    public static int powerN(int base, int n) {
        if (n != 0) {
            return (base*powerN(base, n-1));
        } else {
            return 1;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(powerN(3,2));
    }      
}
