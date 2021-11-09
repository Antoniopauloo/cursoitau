//package exercicios;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nomes = new String[7];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome da pessoa:");
            nomes[i] =  teclado.nextLine();
        }

        System.out.println("Em ordem:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print(nomes[i] + " ");
        }

        System.out.println("\nAo contrário:");
        for (int i = nomes.length-1; i  >= 0; i--) {
            System.out.print(nomes[i] + " ");
        }

        teclado.close();
    }
}