import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        findLowestNumber(numbers);
        findHighestNumber(numbers);

    }

    public static void findLowestNumber(ArrayList<Integer> numbers) {

        int lowest = 0;

        for (int i = 1; i < numbers.size(); i++) {
            lowest = numbers.get(0);

            if (numbers.get(i) < lowest) {
                lowest = numbers.get(i);

            }

        }
        System.out.println("Lowest number is " + lowest);

    }

    public static void findHighestNumber(ArrayList<Integer> numbers) {

        int highest = 0;

        for (int i = 1; i < numbers.size(); i++) {
            highest = numbers.get(0);

            if (numbers.get(i) > highest) {
                highest = numbers.get(i);

            }

        }
        System.out.println("Highest number is " + highest);
    }
}

