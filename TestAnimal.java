public class TestAnimal {
    public static void main(String[] args) {
        Mammal m=new Dog();
        m.sound();
        Dog d=(Dog) m;      //Animal class m move method nhi hy isliye using down casting
        d.move();
    }
}
