package leetcode;

public class ValidPalindrome {

	public static void main(String[] args) {
		
		String testePalindrome = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(testePalindrome));

	}

	public static boolean isPalindrome(String s) {

		String textoRecebido = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		char[] textoFormatado = textoRecebido.toCharArray();

		int esquerda = 0;
		int direita = textoFormatado.length - 1;
			
		
		while (direita > esquerda) {		
			
			
			if (textoFormatado[esquerda] == textoFormatado[direita]) {
				direita--;
				esquerda++;
			} else {
				return false;
			}
			
			
		}
		
		return true;
	}

}
