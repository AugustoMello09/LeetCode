package leetcode;

public class ReverseStringTwo {
	
	public static void main(String[] args) {
		
		System.out.println(reverseStr("abcdefg", 2));
		
	}
	
	
	public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i += 2 * k){
            int esquerda = i;
            int direita = Math.min(i + k - 1, arr.length - 1);
            while (esquerda < direita) {
                char temp = arr[esquerda];
                arr[esquerda] = arr[direita];
                arr[direita] = temp;
                esquerda++;
                direita--;
            }
        }
        return new String(arr);
    }

}
