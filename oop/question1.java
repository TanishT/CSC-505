import java.util.*;

abstract class Animal {

}

class Reptile extends Animal {

}

class Mammal extends Animal {

}

class Lizard extends Reptile {

}

class Snake extends Reptile {

}

class Squirrel extends Mammal {

}

class Elephant extends Mammal {

}

public class question1 {
    public static void main(String[] args)  {
        ArrayList<Reptile> a = new ArrayList<Lizard>(); //types have to match
        ArrayList<Lizard> b = new ArrayList<Reptile>(); //not all reptiles are lizards
    }
}