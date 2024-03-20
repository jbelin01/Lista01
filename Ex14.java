import java.util.Scanner;

public class Ex14 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de a1: ");
        Double a1 = leitor.nextDouble();

        System.out.println("Digite o valor de n: ");
        Double n = leitor.nextDouble();
        
        System.out.println("Digite o valor de n: ");
        Double r = leitor.nextDouble();

        Double an = a1 + ( n - 1) * r;

        System.out.println("Resultado: an = " + an);

        leitor.close();

    }
}


