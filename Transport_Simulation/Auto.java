public class Auto extends Vehicle
{
	private int fuel;
	
	public Auto(int p, int s, int f)
	{
		super(p,s);
		fuel = f;
	}
	public void move()
	{
		if (fuel > 0)
		{
			super.move();
			fuel--;
		}
	}
	
	public void refuel()
	{
		fuel++;
	}
	
	public int getTopSpeed()
	{
		return 55;
	}
	
	public String toString()
	{
		String out = super.toString() + " Fuel: " + fuel;
		return out;
	}
}