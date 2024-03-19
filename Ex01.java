import java.util.Scanner;

public class Ex01 {
    public void ex01(){

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIgite um número : ");

        Double num = leitor.nextDouble();

        if (num <= 10) {

            System.out.println("Número menor ou igual a 10!");
            
        }
        else{
            System.out.println("Número maior do que 10!");
        }
       
    } 
   
}
