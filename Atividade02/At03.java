package Atividade02;

public class At03 {
    public static void main(String[] args) {
       //3. Média e Desvio Padrão: Escreva um programa que
        // calcule a média e o desvio padrão de um array de números inteiros ou de ponto flutuante.

        double[] numeros = {9, 8, 7, 5, 6, 4 };


        double media = 0;
        double soma = 0;
        for(int i = 0; i < numeros.length; i++ ){
            soma += numeros[i];
        }
        media = soma/ numeros.length;

        System.out.println("Média: " + media);


        //desvio padrao

        double desvioPadrao = 0;
        double distanciaMenosMedia = 0;
        for (int i = 0; i < numeros.length ; i++){
            distanciaMenosMedia = distanciaMenosMedia + ((numeros[i] - media) * (numeros[i] - media));
        }
        desvioPadrao = distanciaMenosMedia / numeros.length;
        System.out.println("Desvio Padrão: " + desvioPadrao);
    }

}
