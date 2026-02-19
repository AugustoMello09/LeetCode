public class Subsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    public static boolean isSubsequence(String subsequencia, String ancora) {

        char[] arr = ancora.toCharArray();
        char[] arrsubsequencia = subsequencia.toCharArray();

        int ponteiroGrande = 0;
        int ponteiroPequeno = 0;
        int ponteiroPequenoTamanho = arrsubsequencia.length;

        if (arrsubsequencia.length == 0) {
            return true;
        }

        while (ponteiroGrande  < arr.length) {

            if (ponteiroPequeno < ponteiroPequenoTamanho && verify(arr[ponteiroGrande ], arrsubsequencia[ponteiroPequeno])) {
                ponteiroPequeno++;
            }

            ponteiroGrande++;

        }

        if (ponteiroPequeno  == ponteiroPequenoTamanho) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean verify(char x, char y) {
        return x == y;
    }
}
