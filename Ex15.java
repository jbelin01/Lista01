import java.util.Scanner;

public class Ex15 {
    public static void executar(){

        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de X1: ");
        Double numX1 = leitor.nextDouble();

        System.out.println("Digite o valor de Y1: ");
        Double numY1 = leitor.nextDouble();

        System.out.println("Digite o valor de X2: ");
        Double numX2 = leitor.nextDouble();

        System.out.println("Digite o valor de Y2: ");
        Double numY2 = leitor.nextDouble();
        

        System.out.printf("p1(%.0f, %.0f) p2(%.0f, %.0f) \n", numX1, numY1, numX2, numY2);

        Double distancia = Math.sqrt(Math.pow((numX2 - numX1), 2) + Math.pow((numY2 - numY1), 2)); 

        System.out.printf("Distância é igual a %.2f", distancia);

        leitor.close();
        
    }
}


