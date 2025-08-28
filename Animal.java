/*Q4. Multilevel Inheritance with Abstract Class
Abstract class Animal with abstract method sound().
Abstract class Mammal extends Animal and adds another abstract method move().
Concrete class Dog extends Mammal and implements both sound() and move().
In main, create a Dog object and call both methods.*/

abstract public class Animal {
    abstract public void sound();
    }
abstract class Mammal extends Animal{
    @Override
    abstract public void sound();
    abstract public void move();
}
class Dog extends Mammal{
    public void move() {
        System.out.println("Dog moves");
    }
    public void sound(){
        System.out.println("Dog barks");
    }
}