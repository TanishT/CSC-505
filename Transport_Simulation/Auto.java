public class Auto extends Vehicle
{
	private int fuel;
	
	public Auto(int p, int s, int f)
	{
		super(p,s);
		this.fuel = f;
	}
	public void move()
	{
		if (this.fuel > 0)
		{
			super.move();
			this.fuel--;
		}
	}
	
	public void refuel()
	{
		this.fuel++;
	}
	
	public int getTopSpeed()
	{
		return 55;
	}
	
	public void print()
	{
		super.print();
		System.out.print("Fuel: " + this.fuel + " ");
	}
}