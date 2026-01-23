package exercicios;

public class Exercicio28 {
    public static void main(String[] args) {
        int idade = 30;

        double tempo = 30.5;

        float fahrenheit = 305.9f;

        //convertendo o int para string
        String idade2 = Integer.toString(idade);
        System.out.println("Valor int idade em String: " + idade);

        //convertendo o double para string
        String tempo2 = Double.toString(tempo);
        System.out.println("Valor double tempo em String: " + tempo);

        //convertendo o float para string
        String fahrenheit2 = Float.toString(fahrenheit);
        System.out.println("Valor float farenheit em String: " +fahrenheit);

    }
}
