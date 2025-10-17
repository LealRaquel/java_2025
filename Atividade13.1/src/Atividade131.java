import java.util.Scanner;

class Atividade131 {
    public static void main(String[] args){
        Scanner input = new Scanner((System.in));

        System.out.println("Digite um número: ");

        double numero = input.nextDouble();

        System.out.println("Digite outro número: ");
        double numero2 = input.nextDouble();

        input.nextLine();

        System.out.println("Escolha um operador +,-,*,/: ");
        String operador = input.nextLine();

        input.close();

        double resultado;

        switch (operador) {
            case "+":
                resultado = numero + numero2;
                System.out.println("Resultado é: " + resultado);
                break;
            case "-":
                resultado = numero - numero2;
                System.out.println("Resultado é: " + resultado);
                break;
            case "*":
                resultado = numero * numero2;
                System.out.println("Resultado é: " + resultado);
                break;
            case "/":
                if (numero2 == 0) {
                    System.out.println("Divisão por zero impossível!");

                }else {
                    resultado = numero/numero2;
                    System.out.println("Resultado é: " + resultado);
                    input.close();
                }
                break;
            default:
                System.out.println("Operador inválido!!");
                input.close();
                break;

        }
    }
}

           