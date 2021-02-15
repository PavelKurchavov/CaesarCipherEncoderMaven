
import java.util.List;


public class CaesarCipherEncoder {

    public String encrypt(String sourceText, int shift) {
        StringBuilder resultText = new StringBuilder();

       try {
           for(String symbol: sourceText.split("")) {
               boolean symbolFoundInTheAlphabet = false;

               for (List<String> alphabet : Alphabets.getAlphabets()) {
                   if (alphabet.contains(symbol)) {
                       resultText.append(encryptSymbol(symbol, shift, alphabet));
                       symbolFoundInTheAlphabet = true;
                   }
               }

               if(!symbolFoundInTheAlphabet) resultText.append(symbol);
           }
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Сдвиг за пределами допустимых значений");
           return "";
       }
       catch (NullPointerException e) {
           return "Введено значение null";
       }
        return resultText.toString();
    }


    public String decrypt(String sourceText, int shift) {
        return encrypt(sourceText, -shift);
    }


    private String encryptSymbol(String symbol, int shift, List<String> alphabet) {
        shift *= 2;

        int sourceIndex = alphabet.indexOf(symbol);
        int resultIndex = sourceIndex + shift;

        if (resultIndex >= alphabet.size()) resultIndex -= alphabet.size();
        if (resultIndex < 0) resultIndex += alphabet.size();
        return alphabet.get(resultIndex);
    }

}

