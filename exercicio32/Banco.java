package exercicio32;

public class Banco {
    // criar variaveis
    public double saldoConta = 0;


    //metodo para definir saldo
    public void definirSaldo(double novoSaldo) {
        this.saldoConta = novoSaldo;
    }
    
    public double saldoConta(){
        return this.saldoConta;
    }

    //metodo para obter saldo
    public double obterSaldo(){
        return this.saldoConta;
    }

    
    //metodo para depositar saldo
    public void depositar(double novoDeposito){
        //logica
        if (novoDeposito <= 0) {
            System.out.println("O valor do deposito não pode ser negativo!!");
        } else {
            this.saldoConta += novoDeposito;
        }
    }

    //metodo para levantar
    public void levantar(double novolevantamento){

        //logica
        if (saldoConta <= 0) {
            System.out.println("Saldo insuficiente!!");
            
        } else {
            this.saldoConta -= novolevantamento;
        }
    }    
}
