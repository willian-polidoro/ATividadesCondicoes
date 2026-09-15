package br.unipar.repeticao;

import java.util.Scanner;

public class ForExemplo {
    public static void main(String[] args) {

        //for(1°inicio; 2°condiçao; 3°incremento)
        // 1° executa uma vez no começo
        // 2° executa toda vez antes de executar
        // 3° executa toda vez ao terminar

        Scanner sc = new Scanner(System.in);
        System.out.println(" Informe qual tabuada quer fazer");
        int numero = sc.nextInt();
        System.out.println(" Informe até que valor da tabuada fazer");
        int valorLimite =sc.nextInt();

        for (int contador = 0; contador <= +valorLimite; contador++) {
            System.out.println(contador);
            System.out.println(numero + "x" + contador + "=" + (contador * numero));

        }


    }
}
