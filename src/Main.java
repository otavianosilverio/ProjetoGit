import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Inicializar as variaveis
               double media = 0.00;
        double soma = 0.00;
        int valorUsuario = 0;
        int maiorValor = 0;
        Scanner teclado = new Scanner(System.in);
        for( int contador = 1;contador<=15;contador++){
            System.out.println("Informe o Numero ");
            valorUsuario = teclado.nextInt();
            soma = soma + valorUsuario;
            // Verificar o maior valor
            if (valorUsuario>maiorValor){
                maiorValor = valorUsuario;
            }
        }
        // Impressao das Saidas
        System.out.println("Media-> " + soma/15 );
        System.out.println("Maior-> " + maiorValor );


    }
}