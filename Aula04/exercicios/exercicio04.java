package exercicios;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cont, soma;

        numero = 1;
        cont = 1;
        soma = 0;

        while (numero != 0) {
            System.out.printf("Digite o %dº número inteiro: ", cont);
            numero = entrada.nextInt();
            soma = soma + numero;
            cont++;
        }

        System.out.println("Soma = " + soma);

        entrada.close();
    }
}