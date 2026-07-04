

public class Dog extends Animal implements Swimmable{
    private String breed;

    public Dog(String name, int age, String breed){
        super(name,age);
        this.breed = breed;      
    }

    public void bark(){
        System.out.println("Woof! Woof!");
    }

    @Override
    public void speak(){
        System.out.println("I'm still bibi but dog version");
    }

    @Override
    public void swim(){
        System.out.println("Woof! Im Swim");
    }
}
