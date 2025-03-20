package leetcode;

public class GuessNumberHigherOrLower {

	private static final int PICK = 6;

	public static void main(String[] args) {
		System.out.println(guessNumber(10));
	}

	public static int guessNumber(int n) {
		int esq = 1;
		int dir = n;
		
		while (esq <= dir) {
			
			int meio = esq + (dir - esq) / 2;
			int resultado = guess(meio);
			
			if(resultado == 0) {
				return meio;
			} else if (resultado == -1) {
				dir = meio - 1;
			} else {
				esq = meio + 1;
			}
			
		}
		
		return -1;
	}
	
	public static int guess(int num) {
		if(num > PICK) return - 1;
		if(num < PICK) return 1;
		return 0;
	}

}
