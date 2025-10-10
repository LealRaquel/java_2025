import java.util.Scanner;

class Atividade51 {
    public static void main(String[]args){
        Scanner input = new Scanner((System.in));

         System.out.println("Digite um número: ");

         int numero = input.nextInt();
         System.out.println("O número é " + numero);

         input.close();

        switch (numero) {
            case 1:
                System.out.println("Então hoje é Domingo!");
                break;
            case 2:
                System.out.println("Então hoje é Segunda-feira!");
                break;
            case 3:
                System.out.println("Então hoje é Terça-feira!");
                break;
            case 4:
                System.out.println("Então hoje é Quarta-feira!");
                break;
            case 5:
                System.out.println("Então hoje é Quinta-feira!");
                break;
            case 6:
                System.out.println("Então hoje é Sexta-feira!");
                break;
            case 7:
                System.out.println("Então hoje é Sábado!");
                break;
            default:
                System.out.println("Não existe nenhum dia de semana corresponde a esse número!");
                break;
        }

    }
}
