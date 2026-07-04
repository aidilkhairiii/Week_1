public class Animal implements Swimmable{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("I am eating");
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }

    public void speak(){
        System.out.println("Hi I am bibi");
    }

    @Override
    public void swim(){
        System.out.println("Yey Im Swimming");
    }

}