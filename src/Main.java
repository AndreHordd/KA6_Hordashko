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

        for (String binary : binaryNumbers) {
            System.out.println(binary);
        }
    }
}
