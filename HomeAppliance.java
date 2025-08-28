/*Q5. Abstract Class Polymorphism
Abstract class Appliance with abstract method turnOn().
Subclass Fan → implements turnOn().
Subclass Light → implements turnOn().
In main, create an array of Appliance references (Appliance[] appliances) and
store both Fan and Light objects.
Loop through array and call turnOn() on each.*/

abstract public class HomeAppliance {
    abstract public void turnOn();
}
class Fan extends HomeAppliance{
    @Override
    public void turnOn(){
        System.out.println("Fan is On");
    }
}
class Light extends HomeAppliance{
    @Override
    public void turnOn() {
        System.out.println("Light is On");
    }
}
