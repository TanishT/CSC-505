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
	
	public void print()
	{
		super.print();
		System.out.print("Fuel: " + fuel + " ");
	}
}