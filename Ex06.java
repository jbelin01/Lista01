import java.util.Scanner;

public class Ex06 {
     public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite a temperatura em Celsius: ");
        Double celsius = leitor.nextDouble();

        Double fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("Convertido para Fehrenheit: %f °F ", fahrenheit);

        leitor.close();
     }
       
}