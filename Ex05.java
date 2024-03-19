import java.util.Scanner;

public class Ex05 {
    public static void executar5(){

        Scanner leitor = new Scanner(System.in);

        Double aux; 

        System.out.println("Digite o número A: ");
        Double numA = leitor.nextDouble();

        System.out.println("Digite o número B: ");
        Double numB = leitor.nextDouble();

        System.out.printf("Antes : Número A = %.2f e Número B = %.2f" , numA , numB);
        
            aux = numA;
            numA = numB;
            numB = aux;
        
            System.out.printf("Depois : Número A = %.2f e Número B = %.2f" , numA , numB);
        
        
    }
    
}
