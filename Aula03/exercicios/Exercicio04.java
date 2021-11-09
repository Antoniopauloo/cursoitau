import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioBruto, valorPrestacao, limite;

        System.out.println("Informe o valor do salário bruto:");
        salarioBruto = entrada.nextDouble();
        System.out.println("Informe o valor da prestação:");
        valorPrestacao = entrada.nextDouble();

        limite = salarioBruto * 0.3; // 30% do salário bruto

        if(valorPrestacao <= limite) {
            System.out.println("Pode fazer o emprestimo.");
        } else {
            System.out.println("Não pode fazer o emprestimo.");
        }

        entrada.close();
    }
}