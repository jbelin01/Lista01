import java.util.Scanner;

public class Ex20 {
    public static void executar(){

        
        Scanner leitor = new Scanner(System.in); 

        System.out.println("Digite a quatidade de horas da viagem: ");
        Double hora = leitor.nextDouble();

        System.out.println("Digite a velocidade média da viagem: ");
        Double veloMed = leitor.nextDouble();
               
        Double litro = (veloMed * hora) / 12;

        System.out.printf("Litros gastos na viagem: %.2f" , litro);

        leitor.close();
        
    }
}
