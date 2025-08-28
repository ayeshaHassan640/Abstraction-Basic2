public class TestHomeAppliance {
    public static void main(String[] args) {
        HomeAppliance[] appliances = new HomeAppliance[2];
        appliances[0] = new Fan();
        appliances[1] = new Light();
        //Loop se call hoga
        for (HomeAppliance a : appliances) {
            a.turnOn();
        }
    }
}
