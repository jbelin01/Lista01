import java.util.Scanner;

public class Ex09 {
    
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número A: ");
        Double numA = leitor.nextDouble();

        System.out.println("Digite o número B: ");
        Double numB = leitor.nextDouble();

        if ( numA.equals(numB) ){

            System.out.println("As variáveis são iguais");
        }
        else{
            if (numA > numB){
                System.out.println("As variáveis são diferentes e A é maior que B");
            }
            else{
                System.out.println("As variáveis são diferentes e B é maior que A");
            }
            
        }

    }
}
