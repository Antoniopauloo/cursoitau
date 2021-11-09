//package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;
        String resposta;

        System.out.println("Digite o valor do salário:");
        salario = entrada.nextDouble();

        if(salario <= 600) {
            resposta = "Isento";
        } else {
            if(salario <= 1200) {
                resposta = "20%";
            } else {
                if(salario <= 2000) {
                    resposta = "25%";
                } else {
                    resposta = "30%";
                }
            }
        }

        System.out.println(resposta);

        entrada.close();
    }
}