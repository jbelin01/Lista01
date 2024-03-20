import java.util.Scanner;

public class Ex13 {
    public static void executar(){     
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        Double numA = leitor.nextDouble();

        System.out.println("Digite o valor de B: ");
        Double numB = leitor.nextDouble();

        System.out.println("Digite o operador sendo ele +, -, * ou /: ");
        Character operador = leitor.next().charAt(0);

        Double resultado = 0.0;

        if ( operador.equals('+')){

            resultado = numA + numB;

        }
        else if ( operador.equals('-')){

            resultado = numA - numB;

        }
        else if ( operador.equals('*')){

            resultado = numA * numB;

        }
        else if ( operador.equals('/')){
            if (numB != 0) {
                
                resultado = numA / numB;

            }
            else{

                System.out.println("Não opera por 0!");

            }
            

        }
        else {

            System.out.println("Operador inválido!");
        }

        System.out.println("Resultado é: " +  resultado);

        leitor.close();
        
    }
}
