package exercicio32;

public class Main {
    public static void main(String[] args) {
        //criar objeto
        Banco conta1 = new Banco();

        //imprimir o valor inicial
        conta1.definirSaldo(200.0);
        System.out.println("Saldo inicial: " + conta1.saldoConta());

        //para depositar o valor na conta
        conta1.depositar(50.0);
        System.out.println("Saldo apos o deposito: " + conta1.saldoConta);

        //levantar dinheiro
        conta1.levantar(5.5);
        System.out.println("Saldo da conta apos o deposito: " + conta1.saldoConta);
    }
    
}
