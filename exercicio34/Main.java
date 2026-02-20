package exercicio34;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();

        //Atribuir valores com set
        data.setDia(20);
        data.setMes(02);
        data.setAno(2026);

        //Mostrar os gets
        System.out.println("A data de hoje é: " + data.getDia() + "/" + data.getMes() + "/" + data.getAno());


    }
    
}
