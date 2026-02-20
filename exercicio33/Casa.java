package exercicio33;

public class Casa {
    //Atributos
    private int quartos;
    private int casa_banho;
    private String rua;

    //Construtor
    public void casa(){
        this.quartos = 5;
        this.casa_banho = 2;
        this.rua = "Rua do matadou 14, Figueira da Foz";

    }
    
   // Metodos SET/GET
    public void setQuartos(int quartos){
        this.quartos = quartos;
    }

    public int getQuartos(){
        return this.quartos;
    }

    public void setCasa_banho(int casa_banho){
        this.casa_banho = casa_banho;
    }

    public int getCasa_banho(){
        return this.casa_banho;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public String getRua(){
        return this.rua;
    }
}
