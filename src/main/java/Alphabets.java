
import java.util.Arrays;
import java.util.List;

public class Alphabets {

     private static final List<String> RUSSIAN = Arrays.asList("А", "а", "Б", "б", "В", "в", "Г", "г", "Д", "д", "Е", "е", "Ё", "ё", "Ж", "ж", "З", "з",
                "И", "и", "Й", "й", "К", "к", "Л", "л", "М", "м", "Н", "н", "О", "о", "П", "п", "Р", "р",
                "С", "с", "Т", "т", "У", "у", "Ф", "ф", "Х", "х", "Ц", "ц", "Ч", "ч", "Ш", "ш", "Щ", "щ",
                "Ъ", "ъ", "Ы", "ы", "Ь", "ь", "Э", "э", "Ю", "ю", "Я", "я");


     private static final List<String> ENGLISH = Arrays.asList("A", "a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "f", "G", "g", "H", "h", "I", "i",
                "J", "j", "K", "k", "L", "l", "M", "m", "N", "n", "O", "o", "P", "p", "Q", "q", "R", "r",
                "S", "s", "T", "t", "U", "u", "V", "v", "W", "w", "X", "x", "Y", "y", "Z", "z");

    /* Список всех доступных алфавитов и геттер для доступа к нему */
    private static final List<List<String>> alphabets = Arrays.asList(ENGLISH, RUSSIAN);

        public static List<List<String>> getAlphabets() {
            return alphabets;
         }
}
