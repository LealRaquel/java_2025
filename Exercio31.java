import java.util.Scanner;

public class Exercio31{

    static int divisao(int n1,int n2){
        
        int resultado= n1/n2;

        return resultado;
    }

    public static void main(String[]args){
        try{
            Scanner input = new Scanner((System.in));
            
            System.out.println("Digite um numero: ");
            int n1 = input.nextInt();
            
            System.out.println("Digite outro numero: ");
            int n2 = input.nextInt();
            

          
            System.out.println(divisao(n1, n2));
              input.close();

        }catch (java.lang.ArithmeticException e){

            System.out.println("Não é possível dividir por 0");
        }

    }
    
}