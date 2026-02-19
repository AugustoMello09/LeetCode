public class ReverseLettersThenSpecialCharactersinaString {

    public static void main(String[] args) {
        System.out.println(reverseByType("!@#$%^&*()"));
    }

    public static String reverseByType(String s) {

        char[] arr = s.toCharArray();

        int esquerda = 0;
        int direita = arr.length - 1;

        while (esquerda < direita) {

            while (esquerda < direita && !isCaractere(arr[esquerda])) {
                esquerda++;
            }

            while (esquerda < direita && !isCaractere(arr[direita])) {
                direita--;
            }

            if (esquerda < direita) {
                char temp = arr[esquerda];
                arr[esquerda] = arr[direita];
                arr[direita] = temp;

                esquerda++;
                direita--;
            }
        }

        esquerda = 0;
        direita = arr.length - 1;

        while (esquerda < direita) {

            while (esquerda < direita && isCaractere(arr[esquerda])) {
                esquerda++;
            }

            while (esquerda < direita && isCaractere(arr[direita])) {
                direita--;
            }

            if (esquerda < direita) {
                char temp = arr[esquerda];
                arr[esquerda] = arr[direita];
                arr[direita] = temp;

                esquerda++;
                direita--;
            }
        }

        return new String(arr);
    }
    
    public static boolean isCaractere(char s) {
        return Character.isLetter(s) || Character.isDigit(s);
    }
}
