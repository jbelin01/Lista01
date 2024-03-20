import java.util.Scanner;

public class Ex02 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o 1°número: ");
        Double num1 = leitor.nextDouble();

        System.out.println("Digite o 2°número: ");
        Double num2 = leitor.nextDouble();

        Double soma = num1 + num2;

        System.out.println("O resultado da soma é: " + soma);

        leitor.close();
    }


}
