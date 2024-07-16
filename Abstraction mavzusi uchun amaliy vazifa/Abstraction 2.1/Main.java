public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Dog");
        Animal duck = new Duck("Duck");
        Animal cat = new Cat("Cat");

        dog.sound();
        duck.sound();
        cat.sound();
    }
}
