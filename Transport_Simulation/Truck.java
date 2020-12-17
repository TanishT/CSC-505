import java.util.ArrayList;

public class Truck extends Auto
{
	private ArrayList<String> haul;

	public Truck(int p, int s, int f)
	{
		super(p,s,f);
		haul = new ArrayList<String>();
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
		haul.add(item);
	}
}