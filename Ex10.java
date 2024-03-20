import java.util.Scanner;

public class Ex10 {
    public static void executar10(){

        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite um número (de 1 a 5):");
        Double num = leitor.nextDouble();

        if(num >= 1 && num <= 5){
            if ( num == 1){
                System.out.println("Um");
            }
            else if ( num == 2){
                System.out.println("Dois");
            }
            else if ( num == 3){
                System.out.println("Três");
            }
            else if ( num == 4){
                System.out.println("Quatro");
            }
            else{
                System.out.println("Cinco");
            }
            
            }
            else{
                System.out.println("Número inválido!");
            }
            
        }
    }

