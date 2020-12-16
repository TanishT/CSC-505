public abstract class Vehicle
{
	private int position;
	private int speed;
	
	public Vehicle(int p, int s)
	{
		position = p;
		speed = s;
	}
	
	public void move()
	{
		position += speed;
	}
	
	public abstract int getTopSpeed();
	
	public String toString()
	{
		return "Position: " + position + " Speed: " + speed;
	}
}