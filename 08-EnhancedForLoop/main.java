import java.util.ArrayList;

public class main{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(5);
        numbers.add(30);
        numbers.add(8);
        numbers.add(17);
        numbers.add(2);

        int result = 0;

        for(Integer number : numbers){
            result += number;
        }

        System.out.println("Total sum: " + result);

    }
}