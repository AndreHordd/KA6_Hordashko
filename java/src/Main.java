import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Short> numbers = new ArrayList<>();

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            short boundedNumber = (short)Math.max(Short.MIN_VALUE, Math.min(Short.MAX_VALUE, number));
            numbers.add(boundedNumber);
        }

        boolean sorted = false;
        short temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i) > numbers.get(i + 1)) {
                    temp = numbers.get(i);
                    numbers.set(i, numbers.get(i + 1));
                    numbers.set(i + 1, temp);
                    sorted = false;
                }
            }
        }

        double median;
        if (numbers.size() % 2 == 0) {
            int m1 = numbers.get(numbers.size() / 2 - 1);
            int m2 = numbers.get(numbers.size() / 2);
            median = (m1 + m2) / 2.0;
        } else {
            median = numbers.get(numbers.size() / 2);
        }

        double sum = 0;
        for (short num : numbers) {
            sum += num;
        }
        double average = sum / numbers.size();

        System.out.println((int) median);
        System.out.printf("%.0f\n", average);
    }
}
