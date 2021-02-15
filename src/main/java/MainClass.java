import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder();

            /* Блок запроса входных данных у пользователя */
            System.out.println("Введите текст:");
            String text = reader.readLine();

            System.out.println("Введите размер сдвига:");
            int shift = Integer.parseInt(reader.readLine());

            System.out.println("Выберите действие: зашифровать/расшифровать");

            /* Вызов соответствующего метода у класса-шифратора в зависимости от введенного пользователем действия */
            String resultText = switch (reader.readLine()) {
                case "зашифровать" -> caesarCipherEncoder.encrypt(text, shift);
                case "расшифровать" -> caesarCipherEncoder.decrypt(text, shift);
                default -> "Не удалось совершить требуемое действие";
            };
            System.out.println(resultText);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Не удалось считать текст");
        }
    }
}
