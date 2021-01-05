import java.util.ArrayList;

public class TransportSim {

  private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

  public TransportSim(ArrayList<Vehicle> in){
    //complete the constructor
    this.vehicles = in;
  }

  public void addVehicle(Vehicle v){
    //put Vehicle v into the ArrayList, vehicles
    this.vehicles.add(v);
  }

  public void loadTrucks(String item){
    //load the param item into all trucks in the simulation
    for (Vehicle v : this.vehicles) {
      if (v instanceof Truck) {
        //need to add to param item b/c we found a truck and load is only a truck method
        ((Truck) v).load(item);
      }
    }
  }

  public void step(){
    //instruct all vehicles in the simulation to move once
    for (Vehicle v : this.vehicles) {
      v.move(); //move method is common among all types of vehicles
    }
  }

  public void run(int steps){
    //run the simulation 'steps' times
    for (int i = 0; i < steps; i++) {
      step();
    }
  }

  public void print(){
    //call print method for each vechicle, don't need to reinvent the wheel
    for (Vehicle v : this.vehicles) {
      v.print();
    }
  }
}