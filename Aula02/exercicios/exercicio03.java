//package exercicios;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioAtual, novoSalario;

        // Entrada de dados
        System.out.println("Digite o salário atual:");
        salarioAtual = entrada.nextDouble();

        // Processamento
        // novoSalario = salarioAtual + salarioAtual * 0.25;
        novoSalario = salarioAtual * 1.25;

        // Saída
        System.out.println("Novo salário: " + novoSalario);

        entrada.close();
    }
}