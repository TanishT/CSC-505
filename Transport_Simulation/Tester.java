import java.util.ArrayList;

public class Tester
{
	public static void main(String[] args)
	{
		Auto a = new Auto(10,20,30);
		Truck t = new Truck(10,20,30);
		
		Vehicle v = new Auto(1,2,3);
		v.move();

		Bicycle b = new Bicycle(2, 5);
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		for (int i = 0; i < 10; i++) {
			list.add(v);
		}
		
		TransportSim test = new TransportSim(list);
		System.out.println(test.print());

	}
}
