import java.util.Scanner;

public class Ex08 {
    public static void executar8(){

        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite um número: ");
        Double num = leitor.nextDouble();

        if(num >= 50){

            System.out.println("Este número é igual ou superior a 50!");

        }
        else{

            System.out.println("Este número é inferior a 50!");

        }

    }
}
