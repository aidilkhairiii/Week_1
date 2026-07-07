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

        System.out.println("Exercise 1");
        PrintAllNumber(numbers);
        System.out.println(" ");

        System.out.println("Exercise 2");
        System.out.println("Total sum: " + totalNum(numbers) + "\n");

        System.out.println("Exercise 3");
        System.out.println("Average num: " + averageNum(numbers) +"\n");

        System.out.println("Exercise 4");
        System.out.println("Largest Number: " + largestNum(numbers) + "\n");

        System.out.println("Exercise 5");
        System.out.println("Smallest Number: " + smallestNum(numbers) + "\n");

        System.out.println("Exercise 6");
        System.out.println("Even Number: " + evenNum(numbers) + "\n");

        System.out.println("Exercise 7");
        System.out.println("Odd Number: " + oddNum(numbers) + "\n");








        /*ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        boolean found = false;

        for(int i=0; i<fruits.size(); i++){
            if(fruits.get(i).toLowerCase().equals("orange")){
                found = true;
                System.out.println("Orange is found");
                break;
            }
        }

        if(!found){
            System.out.println("Orange is not found!");
        }*/

        /*for(int i=0; i<fruits.size(); i++){
            System.out.println((i+1) + "." + fruits.get(i));
        }*/

        /*System.out.println(fruit + "\n");

        System.out.println("Second Fruit:\n" + fruit.get(1) + "\n"); 

        fruit.set(2,"Watermelon");
        fruit.remove(1);
        System.out.println("After changes: \n" + fruit + "\n");
        System.out.println("Total fruits: \n" + fruit.size());*/
    }

    public static void PrintAllNumber(ArrayList<Integer> num){
        System.out.println("All Numbers: ");
        for(int i=0; i<num.size(); i++){
            System.out.println(num.get(i));
        }
    }

    public static int totalNum(ArrayList<Integer> num){
        int result=0;
        for(int i=0; i<num.size(); i++){
            result+=num.get(i);
        }
        return result;
    }

    public static double averageNum(ArrayList<Integer> num){
        double result;
        result = (double) totalNum(num)/(num.size());
        return result;
    }

    public static int smallestNum(ArrayList<Integer> num){
        int result=999999;
        for(int i=0; i<num.size(); i++){
            if(result>=num.get(i)){
                result = num.get(i);
            }
        }
        return result;
    }

    public static int largestNum(ArrayList<Integer> num){
        int result=-1;
        for(int i=0; i<num.size(); i++){
            if(result<=num.get(i)){
                result = num.get(i);
            }
        }
        return result;
    }

    public static int evenNum(ArrayList<Integer> num){
        int result=0;
        for(int i=0; i<num.size(); i++){
            if(num.get(i)%2 == 0){
                result++;
            }
        }
        return result;
    }

    public static int oddNum(ArrayList<Integer> num){
        int result=0;
        for(int i=0; i<num.size(); i++){
            if(num.get(i)%2 != 0){
                result++;
            }
        }
        return result;
    }
}