package br.senai.sp.roleta;

import java.util.Random;
import java.util.Scanner;

/**
 *  Roleta Russa
 *  data: 17/08/2023
 *  Autor: Pedro Henrique
 *
 * */

public class Roleta {
    public static void main(String[] args) {

        /** Criar Variaveis */
        int number;
        int random;
        boolean continuar = true;

        /** Instancia Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Instanci Random */
        Random aleatorio = new Random();

        while (continuar) {

            /** Coleta de Dados do Usuario */

            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("------------- bem vindo -------------");
            System.out.println("----------- Teste sua Sorte -------------");
            System.out.println("Digite um numero: ");
            number = teclado.nextInt();
            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

            random = aleatorio.nextInt(10) + 1;

            if (random == number) {
                continuar = false;
            }

        }
        System.out.println("Parabens VC Ganhou !!!");

    }
}
