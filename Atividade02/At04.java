package Atividade02;

public class At04 {
    public static void main(String[] args) {
        //4. Pesquisa em Matriz: Implemente um método para pesquisar um elemento em uma matriz
        // multidimensional e retorne sua posição ou um indicativo de não encontrado.

        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int elemento = 7;


        ResultadoPesquisa resultado = pesquisarElemento(matriz, elemento);

        if (resultado.encontrado) {
            System.out.println("Elemento encontrado na posição: (" + resultado.linha + ", " + resultado.coluna + ")");
        } else {
            System.out.println("Elemento não encontrado na matriz.");
        }
    }


    public static ResultadoPesquisa pesquisarElemento(int[][] matriz, int elemento) {
        ResultadoPesquisa resultado = new ResultadoPesquisa();


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == elemento) {
                    resultado.encontrado = true;
                    resultado.linha = i;
                    resultado.coluna = j;
                    return resultado;
                }
            }
        }

        resultado.encontrado = false;
        return resultado;
    }


    public static class ResultadoPesquisa {
        boolean encontrado;
        int linha;
        int coluna;
    }
}
