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

public class question2 {
    public static void main(String[] args) {
        Animal a1 = new Animal(); //not going to work b/c cant declare a an object of an abstract class
        Animal a2 = new Squirrel();
        Squirrel s1 = new Mammal(); //need to add cast to mammal since u r upcating
        Mammal m1 = new Squirrel();
        Snake s1 = new Lizard(); //snake and lizard are not related
        Mammal m2 = new Elephant();
        Squirrel s2 = (Squirrel)m2;
    }

}
