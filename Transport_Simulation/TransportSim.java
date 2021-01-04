import java.util.ArrayList;

public class TransportSim {

  private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

  public TransportSim(ArrayList<Vehicle> in){
    //complete the constructor
    for (Vehicle v : in) {
      this.vehicles.add(v);
    }
  }

  public void addVehicle(Vehicle v){
    //put Vehicle v into the ArrayList, vehicles
    this.vehicles.add(v);
  }

  public void loadTrucks(String item){
    //load the param item into all trucks in the simulation
    for (Vehicle v : vehicles) {
      if (v instanceof Truck) {
        //need to add to param item
        ((Truck) v).load(item);
      }
    }
  }

  public void step(){
    //instruct all vehicles in the simulation to move once
    for (Vehicle v : vehicles) {
      if (v instanceof Truck) {
        ((Truck) v).move();
      } else if (v instanceof Bicycle) {
        ((Bicycle) v).move();
      } else if (v instanceof Auto) {
        ((Auto) v).move();
      }
    }
  }

  public void run(int steps){
    //run the simulation 'steps' times
    for (int i = 0; i < steps; i++) {
      step();
    }
  }

  public void print(){
    for (Vehicle v : vehicles) {
      if (v instanceof Truck) {
        ((Truck) v).print();
      } else if (v instanceof Bicycle) {
        ((Bicycle) v).print();
      } else if (v instanceof Auto) {
        ((Auto) v).print();
      }
    }
  }
}