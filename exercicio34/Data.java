package exercicio34;

public class Data {
    //Atributos
    private int dia;
    private int mes;
    private int ano;
    
    //Construtor
    public void data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1;
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
            this.mes = mes;
        }else {
            System.out.println("Mes invalido. O mes deve ser entre 1 e 12.");
        }
    }

    public int getMes(){
        return this.mes;
    }

    public void setAno(int ano){
        if(ano > 0){
            this.ano = ano;
        } else {
            System.out.println("Ano invalido. nao existe  ano 0");
        }
        
    }

    public int getAno(){
        return  this.ano;
    }
}
