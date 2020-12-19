import java.util.ArrayList;

public class Truck extends Auto
{
	private ArrayList<String> haul;

	public Truck(int p, int s, int f)
	{
		super(p,s,f);
		this.haul = new ArrayList<String>();
	}
	
	@Override
	public void move()
	{
		super.move();
		super.move();
		super.move();
	}
	
	public void load(String item)
	{
		this.haul.add(item);
	}

	public void print() {
		super.print();
		for (String item : this.haul) {
			System.out.print("item: " + item + " , ");
		}
	}
}