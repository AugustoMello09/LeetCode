package leetcode;

public class ReverseWordsinAStringThree {
	
	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}
	
	public static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        
        int esquerda = 0;
        
        for(int direita = 0; direita <= arr.length; direita++){
            
            boolean verificar = direita == arr.length || arr[direita] == ' ';
            
            if(verificar){
                int l = esquerda, r = direita - 1;
                while(l < r){
                    char temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                    r--;
                }

                esquerda = direita + 1;
            }
        }
        return new String(arr);
    }

}
