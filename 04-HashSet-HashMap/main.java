import java.util.HashMap;
import java.util.HashSet;

public class main{
    public static void main(String[] args) {

        HashMap<String,Integer> studentMarks = new HashMap<>();

        studentMarks.put("Aidil", 95);
        studentMarks.put("Ali",92);
        studentMarks.put("Sarah",90);
        studentMarks.put("John",76);

        System.out.println(studentMarks);

        System.out.println("Aidil's Marks: " + studentMarks.get("Aidil"));

        studentMarks.put("John",88);

        System.out.println(studentMarks);

        if(studentMarks.containsKey("Ali")){
            System.out.println("Ali exist!");
        }else{
            System.out.println("Ali doesnt exist!");
        }

        studentMarks.remove("Sarah");
        System.out.println(studentMarks);



        /*HashSet<String> countries = new HashSet<>();

        countries.add("Malaysia");
        countries.add("Japan");
        countries.add("Canada");
        countries.add("Malaysia");
        countries.add("Japan");
    
        if(countries.contains("Japan")){
            System.out.println("Japan exists.");
        }

        countries.remove("Canada");
        System.out.println(countries);*/
    }
}