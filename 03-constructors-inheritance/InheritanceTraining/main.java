

public class main {

    public static void main(String[] args) {
        Animal cat = new Cat("JiJi", 5, "Grey");
        Animal dog = new Dog("Morgan", 10, "Black");

        cat.eat();
        cat.sleep();
        dog.eat();
        dog.sleep();
        cat.speak();
        dog.speak();
        cat.swim();
        dog.swim();
    }
    

}
