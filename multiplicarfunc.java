import java.util.*;
public class multiplicarfunc extends Main{
    //objetos
    DataVault dv = new DataVault();
    Scanner in = new Scanner(System.in);
    int i = 0;

    public void definy_matrix() {
        if (i < 2) {
        //variaveis
        int l,c,i,j; 
        
        //recebe as spec's das matrizes 
        System.out.println("Insira o numero de linhas da matriz");
        l = in.nextInt();
        System.out.println("Insira o numero de colunas da matriz");
        c = in.nextInt();

        //matris 
        int Matriz[][] = new int[l][c];

        //Insére o valor da matriz
        System.out.println("Insira os elementos da matriz");
            for (i = 0; i < l; i++)
                for (j = 0; j < c; j++)
                    Matriz[i][j] = in.nextInt();

        storeMatrix(Matriz, c, l);
        }else{
            System.out.println("\nLimite de Matrizes atingido, Apague para poder gerar novas");
        }
        
    }
    public void aux_operation(){
        operation(dv.getLinhaA(),dv.getLinhaB(),dv.getColunaA(),dv.getColunaB(),dv.getMatrixA(),dv.getMatrixB());
    }
    public void operation(int ra, int rb, int ca, int cb, int mtxA[][], int mtxB[][]){
        //variaveis
        int i,j,k;
        // Printar Matrizes
        aux_printMatrix_checkDataVault();
        //checagem para analisar a possibilidade de multiplicação
        if (rb != ca) {
            System.out.println("\nA Multiplicação não é possivel");
            return;
        }

        //Matriz para armazenar o resultado
        int resultado[][] = new int[ra][cb];

        //Multiplicação
        for (i = 0; i < ra; i++) {
            for (j = 0; j < cb; j++) {
                for (k = 0; k < rb; k++)
                    resultado[i][j] += mtxA[i][k] * mtxB[k][j];
            }
        }

        System.out.println("\nMatriz Resultado: ");
        printMatrix(cb, ra, resultado);
    }

    public void aux_printMatrix_checkDataVault(){
        System.out.println("Matriz A");
        printMatrix(dv.getColunaA(), dv.getLinhaA(), dv.getMatrixA());
        System.out.println("Matriz B");
        printMatrix(dv.getColunaB(), dv.getLinhaB(), dv.getMatrixB());
    }

    static void printMatrix(int coluna, int linha, int matriz[][]){
        System.out.println("Sua Matriz ficou da seguinte forma");
            int i,j;
            for (i = 0; i < coluna; i++) {
                for (j = 0; j < linha; j++)
                    System.out.print(matriz[i][j] + "  ");
                System.out.println();
            }
    }

    public void storeMatrix(int matrix[][], int coluna, int linha){
         if (i == 0) {
            dv.setMatrixA(matrix);
            dv.setColunaA(coluna);
            dv.setLinhaA(linha);
            System.out.println("Matriz A Guardada");
         }

         if (i == 1) {
            dv.setMatrixB(matrix);
            dv.setColunaB(coluna);
            dv.setLinhaB(linha);
            System.out.println("Matriz B Guardada");
         }
         if (i >= 2) {
            return;
         }

         i++;
         System.out.println(i);

        }
    public void eraseMatrix(){
        System.out.println("\n Qual Matriz deseja Apagar ?");
        System.out.println("1) Matriz A ?");
        System.out.println("2) Matriz B?");
        int choice = in.nextInt();
        if (choice == 1) {
            dv.setColunaA(0);
            dv.setLinhaA(0);
            dv.setMatrixA(null);
            i = 0;
            System.out.println("\nMatriz A apagada");
        }
        if (choice == 2) {
            dv.setColunaB(0);
            dv.setLinhaB(0);
            dv.setMatrixB(null);
            i = 1;
            System.out.println("\nMatriz B apagada");
        }
    }
    }

