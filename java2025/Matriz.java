import java.util.Scanner;

public class Matriz {

    static void CriaMatriz() {

        int matriz[][] = new int[3][3];

        matriz[0][0] = 1; matriz[1][0] = 4; matriz[2][0] = 7;
        matriz[0][1] = 2; matriz[1][1] = 5; matriz[2][1] = 8;
        matriz[0][2] = 3; matriz[1][2] = 6; matriz[2][2] = 9;

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Metudo para criar matriz  pelo utilizador
    static void CriaMatrizUtilizador(int linhas, int colunas) {

        // Criar um novo objeto
        Scanner input = new Scanner(System.in);

        int matriz[][] = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor da linha " + i + " e coluna " + j + ": ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Fechar input
        input.close();

        // Loop para mostrar os dados
        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int Linnhas, Colunas;

        System.out.print("Digite o numero de linhas: ");
        Linnhas = input.nextInt();
        System.out.print("Digite o numero de colunas: ");
        Colunas = input.nextInt();

        CriaMatrizUtilizador(Linnhas, Colunas);

        input.close();
    }
} 
