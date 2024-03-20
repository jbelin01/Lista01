import java.util.Scanner; 

public class Ex11 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int aux;

        System.out.println("Digite o número 1");
        int num1 = leitor.nextInt();

        System.out.println("Digite o número 2");
        int num2 = leitor.nextInt();

        System.out.println("Digite o número 3");
        int num3 = leitor.nextInt();

        if(num1 > num2 ){

            aux = num1;
            num1 = num2;
            num2 = aux;

        }
        if(num2 > num3){

            aux = num2;
            num2 = num3;
            num3 = aux;

        }
       
        if(num1 > num2 ){

            aux = num1;
            num1 = num2;
            num2 = aux;

        }

        System.out.printf(" sequência: 1°: %d, 2°: %d, 3° %d", num1, num2, num3);

    }
}
