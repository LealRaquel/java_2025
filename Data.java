package exercicio34;

public class Data {
    //Atributos
    private int dia;
    private int mes;
    private int ano;
    private boolean bissexto;

    //Construtor
    public void data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1;
        this.bissexto = false;
    }

    // Metodos SET/GET

    public void setDia(int dia){
        if(dia > 0 && dia <= 31){
            this.dia = dia;
            
        } else {
            System.out.println("Dia invalido. O dia deve ser entre 1 e 31.");
        }
    }

    public int getDia(){
         return this.dia;
    }
    
    public void setMes(int mes){
        if(mes > 0 && mes <= 12){
            if(mes == 2){
                if(this.ano > 0 && (this.ano % 4 == 0 && (this.ano % 100 != 0 || this.ano % 400 == 0))){
                    this.bissexto = true;
                    System.out.println("O ano é bissexto, entao mês de fevereiro tem 29 dias.");
                } else {
                    this.bissexto = false;
                    System.out.println("O ano nao é bissexto, entao mês de fevereiro tem 28 dias.");
                }
            }
            this.mes = mes;
        }else {
            System.out.println("Mes invalido. O mes deve ser entre 1 e 12.");
        }
    }

    public int getMes(){
        return this.mes;
    }

    public void setAno(int ano){
        if(ano > 0 && (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0))){
            this.ano = ano;
            System.out.println("Ano bissexto");
        }
        else if(ano > 0){
            this.ano = ano;
            System.out.println("Ano nao é bissexto");
        }
        else{
            System.out.println("Ano invalido.");
        } 
    }
    public int getAno(){
        return  this.ano;
    }

}
