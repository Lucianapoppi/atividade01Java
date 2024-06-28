package Atividade02;

import java.util.Arrays;

public class At07 {
    public static void main(String[] args) {

        //7. Rotacionar um Array: Crie uma função para rotacionar os elementos de um
        // array para a esquerda ou para a direita por um número específico de posições.

        int[] array = { 1, 2, 3, 4, 5, 6 };

        // Rotaciona o array para a esquerda por 2 posições
        int[] arrayRotEsquerda = rotacionarArray(array, -2);
        System.out.println("Array rotacionado para a esquerda por 2 posições:");
        System.out.println(Arrays.toString(arrayRotEsquerda));

        // Rotaciona o array para a direita por 3 posições
        int[] arrayRotDireita = rotacionarArray(array, 3);
        System.out.println("\nArray rotacionado para a direita por 3 posições:");
        System.out.println(Arrays.toString(arrayRotDireita));
    }

    public static int[] rotacionarArray(int[] array, int posicoes) {
        if (array == null || array.length == 0) {
            return array;
        }

        int n = array.length;
        posicoes = posicoes % n; // Para lidar com rotações maiores que o tamanho do array

        if (posicoes < 0) {
            posicoes = n + posicoes; // Se for uma rotação para a esquerda com valor negativo
        }

        // Criando o novo array rotacionado
        int[] arrayRotacionado = new int[n];
        for (int i = 0; i < n; i++) {
            int novaPosicao = (i + n - posicoes) % n;
            arrayRotacionado[novaPosicao] = array[i];
        }

        return arrayRotacionado;
    }


}
