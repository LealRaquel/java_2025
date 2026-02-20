package exercicio33;

public class Main {
    public static void main(String[] args) {
        // criar um obtejo da class casa
        Casa apartamento = new Casa();

        apartamento.setQuartos(2);
        apartamento.setCasa_banho(1);
        apartamento.setRua("Azinhaga da Torrinha porta H 1750-013, Lisboa");

        System.out.println("O apartamento tem " + apartamento.getQuartos() +" quartos, " + apartamento.getCasa_banho() + " casa de banho e fica localizado na rua " + apartamento.getRua());

    }
}
