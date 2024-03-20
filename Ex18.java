import java.util.Scanner;

public class Ex18 {
    public static void executar(){

        
        Scanner leitor = new Scanner(System.in); 

        System.out.println("Digite a Nota 1: ");
        Double nota1 = leitor.nextDouble();

        System.out.println("Digite a Nota 2: ");
        Double nota2 = leitor.nextDouble();

        System.out.println("Digite a Nota 3: ");
        Double nota3 = leitor.nextDouble();     
        
        Double mediaH = 3 / ((1/nota1) + (1/nota2) + (1/nota3));

        System.out.printf("a Média é: %.2f" , mediaH);

        leitor.close();
        
    }
}
