import java.util.ArrayList;

public class TransportSim {

  private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

  public TransportSim(ArrayList<Vehicle> in){
    //complete the constructor
    for (Vehicle v : in) {
      this.vehicles.add(v);
    }
  }

  public void addVehicle(Vehicle v)
  {
     //put Vehicle v into the ArrayList, vehicles

  }

  public void loadTrucks(String item)
  {
    //load the param item into all trucks in the simulation
  }

  public void step()
  {
    //instruct all vehicles in the simulation to move once
  }

  public void run(int steps)
  {
    //run the simulation 'steps' times
  }

  public ArrayList<Vehicle> print()
  {
    return vehicles;
  }
}