import java.util.Scanner;

public class Ex04 {
    public static void executar4(){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o 1°número: ");
        Double num1 = leitor.nextDouble();

        System.out.println("Digite o 2°número: ");
        Double num2 = leitor.nextDouble();

        Double soma = num1 + num2;

        System.out.println("O resultado da soma é: " + soma);

        Double subtracao = num1 - num2;

        System.out.println("O resultado da soma é: " + subtracao);

        Double multiplicacao = num1 * num2;

        System.out.println("O resultado da soma é: " + multiplicacao);

        Double divisao = num1 / num2;

        System.out.println("O resultado da soma é: " + divisao);

                
    }
    
}
