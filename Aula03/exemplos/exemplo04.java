package exemplos;

public class exemplo04 {
    public static void main(String[] args) {
        String nome;

        nome = "Ana";

        // comparação de textos (String)
        System.out.println( nome.equals( "ana" ) );

        // não leva em consideração as maiúsculas/minúsculas
        System.out.println( nome.equalsIgnoreCase( "ana" ) );

    }
}