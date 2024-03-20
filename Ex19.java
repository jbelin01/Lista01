import java.util.Scanner;

public class Ex19 {
    public static void executar(){

        
        Scanner leitor = new Scanner(System.in); 

        System.out.println("Digite o raio: ");
        Double r = leitor.nextDouble();

        System.out.println("Digite a altura: ");
        Double a = leitor.nextDouble();     
        
        Double volume = 3.14 * Math.pow(r,2) * a;

        System.out.printf("O volume é: %.2f" , volume);

        leitor.close();
        
    }
}
