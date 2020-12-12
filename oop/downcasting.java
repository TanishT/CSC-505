/*
downcasting is perhaps more common than upcasting, and more the sort of thing you'd actually notice, rather than something that happens implicitly.

Downcasting means that you cast an object stored in a parent type variable to the child type.

Often, for one reason or another, you'll store a child class in a parent class variable and then want to access specific child class functionality. That's when you downcast
*/ 

class Machine2 {
    public void start() {
        System.out.println("Start!");
    }
    
    public void stop() {
        System.out.println("Machine stopping.");
    }
}

class Camera2 extends Machine2 {
    public void snapshot() {
        System.out.println("Snap!");
    }
    
    @Override
    public void stop() {
        System.out.println("Camera stopping");
    }
}


public class downcasting {
    public static void main(String[] args) {
        
        Machine2 machine = new Camera2();
        
        Camera2 camera = (Camera2)machine;
        
        camera.snapshot();
        
    }
}
