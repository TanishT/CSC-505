public abstract class Vehicle
{
	private int position;
	private int speed;
	
	public Vehicle(int p, int s)
	{
		this.position = p;
		this.speed = s;
	}
	
	public void move()
	{
		this.position += this.speed;
	}
	
	public abstract int getTopSpeed();
	
	public void print()
	{
		System.out.println("Position: " + this.position + " Speed: " + this.speed);
	}
}