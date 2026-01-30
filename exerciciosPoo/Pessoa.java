package exerciciosPoo;

public class Pessoa {
    //variaveis de instancia
    private String nome;
    private int idade;
    
    //metodos da instancia
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }

    public int getIdade(){
        return this.idade;
    }
}
