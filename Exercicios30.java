package exercicios;

public class Exercicios30 {
    public static void main(String[] args) {
        double [] notas ={10.0, 11.2, 16.0, 17.5, 9.5};

        double soma = 0, media = 0, contador =0;

        for (int i = 0; i <notas.length; i++) {
            soma += notas[i];

            contador++;
        }

        media = soma / contador;

        System.out.println("Total alunos: " +contador);
        System.out.println("Media notas: " +media);
        System.out.println("Media notas convertidas para int: " +(int) media );

    }
    
}
