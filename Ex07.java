import java.util.Scanner;

public class Ex07 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número : ");

        Double num = leitor.nextDouble();

        if (num > 100 && num < 200) {

            System.out.println("Este número está no intervalo de 100 à 200!");
            
        }
        else{
            System.out.println("Este número não está no intervalo de 100 à 200!");
        }
       
        leitor.close();
    }
}
