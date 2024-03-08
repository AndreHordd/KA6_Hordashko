import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         Прочитати з stdin N десяткових чисел, розділених пробілом чи новим рядком до появи EOF (макс довжина рядка 255 символів), кількість чисел може до 10000.
         Рядки розділяються АБО послідовністю байтів 0x0D та 0x0A (CR LF), або одним символом - 0x0D чи 0x0A.
         */
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            number = Math.max(Short.MIN_VALUE, Math.min(Short.MAX_VALUE, number));
            numbers.add(number);
        }

    }
}

