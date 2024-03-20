import java.util.Scanner;

public class Ex03 {
    
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIgite o número A: ");
        Double numA = leitor.nextDouble();

        System.out.println("DIgite o número B: ");
        Double numB = leitor.nextDouble();

        if(numA > numB ){
            System.out.println("A é maior que B ");
        }
        else if(numB > numA){
            System.out.println("B é maior que A ");
        }
        else{
            System.out.println("Sequência de números  é inválida!");
        }

        leitor.close();
    }
}
