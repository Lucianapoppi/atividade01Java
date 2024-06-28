package Atividade02;

public class At10 {
    public static void main(String[] args) {

        //10. Palíndromos: Verifique se um array de strings contém palavras que são
        // palíndromos (palavras que se leem da mesma forma de trás para frente).

        String[] array = { "radar", "ele", "casa", "arara", "banana" };

        verificarEImprimirPalindromos(array);
    }

    public static void verificarEImprimirPalindromos(String[] array) {
        boolean encontrouPalindromo = false;

        System.out.println("Palavras palíndromas encontradas:");

        for (String palavra : array) {
            if (ehPalindromo(palavra)) {
                System.out.println(palavra);
                encontrouPalindromo = true;
            }
        }

        if (!encontrouPalindromo) {
            System.out.println("Nenhuma palavra palíndroma encontrada.");
        }
    }

    public static boolean ehPalindromo(String palavra) {
        int esquerda = 0;
        int direita = palavra.length() - 1;

        while (esquerda < direita) {
            if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }

        return true;

    }
}
