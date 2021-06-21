import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);



        int lowest = 0;

        for (int i = 1; i < numbers.size(); i++) {
            lowest = numbers.get(0);

            if (numbers.get(i) < lowest) {
                lowest = numbers.get(i);

            }

        }
        System.out.println("Lowest number is " + lowest);
    }
}
