/*
Wherever you have a child class, polymorphism means you can store it in a variable of the parent class type. 
This is known as upcasting, since you are implicitly "casting" the child class to the parent class type.

Although overridden methods in the child class CAN then be invoked using the parent class variable, 
you CANNOT use the parent class variable to call methods that only exist in the child class.
*/

class Machine {
    public void start() {
        System.out.println("Start!");
    }
    
    public void stop() {
        System.out.println("Machine stopping.");
    }

    public void snapshot() {
        System.out.println("does not exist");
    }
}

class Camera extends Machine {
    @Override 
    public void snapshot() {
        System.out.println("Snap!");
    }
    
    @Override
    public void stop() {
        System.out.println("Camera stopping");
    }
}

public class upcasting {
    public static void main(String[] args) {
        
        Camera camera = new Camera();
        
        Machine machine = camera;
        machine.start();
        
        // Note: the camera version of stop() is invoked.
        machine.stop();
        machine.snapshot();
        
    }
}