import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> binaryNumbers = new ArrayList<>();

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            number = Math.max(Short.MIN_VALUE, Math.min(Short.MAX_VALUE, number));
            String binary = Integer.toBinaryString(0xFFFF & number);
            while (binary.length() < 16) {
                binary = "0" + binary;
            }
            binaryNumbers.add(binary);
        }

        // Bubble Sort
        for (int i = 0; i < binaryNumbers.size() - 1; i++) {
            for (int j = 0; j < binaryNumbers.size() - i - 1; j++) {
                if (binaryNumbers.get(j).compareTo(binaryNumbers.get(j + 1)) > 0) {
                    Collections.swap(binaryNumbers, j, j + 1);
                }
            }
        }

        // Calculate the median
        double median;
        if (binaryNumbers.size() % 2 == 0) {
            int m1 = Integer.parseInt(binaryNumbers.get(binaryNumbers.size() / 2 - 1), 2);
            int m2 = Integer.parseInt(binaryNumbers.get(binaryNumbers.size() / 2), 2);
            median = (m1 + m2) / 2.0;
        } else {
            median = Integer.parseInt(binaryNumbers.get(binaryNumbers.size() / 2), 2);
        }

        // Calculate the average
        double sum = 0;
        for (String binary : binaryNumbers) {
            sum += Integer.parseInt(binary, 2);
        }
        double average = sum / binaryNumbers.size();

        // Print the results
        System.out.println((int) median); // Print median as integer
        System.out.printf("%.0f\n", average); // Print average as integer (without decimal part)
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> binaryNumbers = new ArrayList<>();

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            number = Math.max(Short.MIN_VALUE, Math.min(Short.MAX_VALUE, number));
            String binary = Integer.toBinaryString(0xFFFF & number);
            while (binary.length() < 16) {
                binary = "0" + binary;
            }
            binaryNumbers.add(binary);
        }

        for (int i = 0; i < binaryNumbers.size() - 1; i++) {
            for (int j = 0; j < binaryNumbers.size() - i - 1; j++) {
                if (binaryNumbers.get(j).compareTo(binaryNumbers.get(j + 1)) > 0) {
                    Collections.swap(binaryNumbers, j, j + 1);
                }
            }
        }

        double median;
        if (binaryNumbers.size() % 2 == 0) {
            int m1 = Integer.parseInt(binaryNumbers.get(binaryNumbers.size() / 2 - 1), 2);
            int m2 = Integer.parseInt(binaryNumbers.get(binaryNumbers.size() / 2), 2);
            median = (m1 + m2) / 2.0;
        } else {
            median = Integer.parseInt(binaryNumbers.get(binaryNumbers.size() / 2), 2);
        }

        System.out.println((int) median);
    }
}
