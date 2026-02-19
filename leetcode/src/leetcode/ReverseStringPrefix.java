public class ReverseStringPrefix {

    public static void main(String[] args) {
        System.out.println(reversePrefix("hey", 1));
    }

    public static String reversePrefix(String s, int k) {
        char[] arr = s.toCharArray();
        int esquerda = 0;
        int direita = k - 1;

        while (esquerda < direita ) {

            char temp = arr[esquerda];
            arr[esquerda] = arr[direita];
            arr[direita] = temp;

            esquerda++;
            direita--;
        }
        return new String(arr);
    }
}
