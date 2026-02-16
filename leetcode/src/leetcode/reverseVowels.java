import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class reverseVowels {

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));

        /*
        * I e e A
        * */

    }

    public static String reverseVowels(String s) {
        char[] letras = s.toCharArray();

        int esquerda = 0;
        int direita = letras.length - 1;

        while (esquerda < direita) {

            while (esquerda < direita && !isVowels(letras[esquerda])) {
                esquerda++;
            }

            while (esquerda < direita && !isVowels(letras[direita])) {
                direita--;
            }

            char temp = letras[esquerda];
            letras[esquerda] = letras[direita];
            letras[direita] = temp;

            esquerda++;
            direita--;
        }

        return new String(letras);
    }

    public static boolean isVowels(char c) {
        return "aeiou".indexOf(Character.toLowerCase(c)) != -1;
    }

}
