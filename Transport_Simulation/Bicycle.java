public class Bicycle extends Vehicle
{

    public Bicycle(int p, int s) {
        super(p, s);
    }

    @Override //compiler does an extra check to make sure method is overwritten, gives better error messages
    public int getTopSpeed() {
        return 0;
    }

    public String toString() {
        return super.toString();
    }
	
}