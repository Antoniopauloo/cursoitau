package exercicios;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont, n;

        System.out.println("Informe o limite:");
        n = entrada.nextInt();

        cont = 1;
        while (cont <= n) {
            System.out.printf("%d", cont);
            cont = cont * 2;
            if (cont <= n) { // verifica se ainda tem mais um número para exibir
                System.out.printf(", ");
            }
        }

        System.out.println();

        // solução 2

        System.out.print(1);
        cont = 2;
        while (cont <= n) {
            System.out.printf(", %d", cont);
            cont = cont * 2;
        }

        entrada.close();
    }
}