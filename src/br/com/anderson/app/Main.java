package br.com.anderson.app;

import java.util.Scanner;

/**
 *
 * @author Anderson Silva
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        int div = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        div = entrada.nextInt();

        for(int x = 100; x <= 200; x++) {

            if((x % div) != 0) {
                continue;
            }

            System.out.println(x);
        }

        System.out.println("Fim usando CONTINUE");
        System.out.println();

        System.out.print("Digite um numero: ");
        div = entrada.nextInt();

        for(int x = 100; x <= 200; x++) {
            
            if ((x % div) == 0) {
                break;
            }

            System.out.println(x);
        }

        System.out.println("Fim usando BREAK");
    }
}
