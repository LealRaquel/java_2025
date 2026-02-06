package exerciciosPoo;

public class Main {
    public static void main(String[] args) {
        //criar objeto da class bolo
        Bolo boloMaria = new Bolo();
        Bolo boloManel = new Bolo();

        //dar valotres a instancia
        boloMaria.sabor = "Simples";
        boloMaria.tamanho = 21;
        boloMaria.cobertura = true;

        boloManel.sabor = "Chocolate";
        boloManel.tamanho = 20;
        boloManel.cobertura = false;

        boloMaria.exibirDetalhes();


        //Criar um objecto novo
        Pessoa pessoa1 = new Pessoa();

        // dar sentido a instancia
        pessoa1.setNome("Sara");
        System.out.println("Nome da pessoa1: " +pessoa1.getNome());

        pessoa1.setIdade(15);
        System.out.println("Iadede pessoa1: "+ pessoa1.getIdade());


        Pessoa pessoa2 = new Pessoa();

        pessoa2.setNome("Fidel");
        System.out.println("Nome da pessoa2: " +pessoa2.getNome());

        pessoa2.setIdade(17);
        System.out.println("Idade da pessoa2: " +pessoa2.getIdade());

        //Alterar o nome da pessoa1
        pessoa1.setNome("Fidel Leal");
        System.out.println("Novo nome da pessoa1: " +pessoa1.getNome());
    }
}
