package exerciciosPoo;

public class Bolo {
    //variaveis de instancias
    public String sabor;
    public int tamanho;
    public boolean cobertura;
    
    //metotos da instacia
    public void exibirDetalhes() {
        System.out.println("Sabor: " + sabor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cobertura: " + cobertura);
    }

    //metodo para adicionar cobertura
    public void adicionarCobertura() {
        this.cobertura = true;
        
    }

    // Metodo  get/set
    public void setSabor(String novoSabor) {
        this.sabor = novoSabor;
        
    }

}
