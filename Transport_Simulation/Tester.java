import java.util.ArrayList;

public class Tester
{
	public static void main(String[] args)
	{
		Auto a = new Auto(10,20,30);
		Truck t = new Truck(10,20,30);
		
		Vehicle v = new Auto(1,2,3);
		v.move();

		//testing code for constructor
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		for (int i = 0; i < 10; i++) {
			list.add(v);
		}
		
		TransportSim test = new TransportSim(list);
		//System.out.println(test.print());

		//testing code for addVehicle 
		v = new Auto(1,333,4);
		test.addVehicle(v);
		//System.out.println(test.print());

		//testing code for loadTrucks
		v = new Truck(1,2,3);
		test.addVehicle(v);
		test.loadTrucks("truck is here");

		//testing code for step method
		test.step();
		//System.out.println("\n\n");
		//test.print();
		
		//testing code for run method
		test.run(5);
		System.out.println("\n\n");
		test.print();
	}
}
