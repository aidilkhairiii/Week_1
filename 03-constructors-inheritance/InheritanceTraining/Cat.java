

public class Cat extends Animal implements Swimmable {
    private String color;

    public Cat(String name, int age, String color){
        super(name,age);
        this.color= color;
    }

    public void meow(){
        System.out.println("Meow! Meow!");
    }

    @Override
    public void speak(){
        super.speak();
        System.out.println("I'm still bibi");
    }

    @Override
    public void swim(){
        System.out.println("Meow! Im Swim");
    }
}
