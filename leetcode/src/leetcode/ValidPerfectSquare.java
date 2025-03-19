package leetcode;

public class ValidPerfectSquare {

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(16));
	}

	public static boolean isPerfectSquare(int num) {
	    double valor = Math.sqrt(num);
	    return valor == Math.floor(valor);
	}

}
