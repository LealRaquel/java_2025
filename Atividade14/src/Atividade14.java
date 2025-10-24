public class Atividade14 {
    public static void main (String []args){
        String [] meses = new String[12];
        int [] dias = new int[12];

        meses = new String[]{"Jan", "Fev", "Mar", "Abr", "Mai", "Jun","Jul", "Ago", "Set", "Out", "Nov", "Dez"};

        dias = new int[]{31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};

        for(int i = 0; i < meses.length; i++){
            System.out.println("O mês de " + meses[i] + " tem " + dias[i]);
        }
    }
}
