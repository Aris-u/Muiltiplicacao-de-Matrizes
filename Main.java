import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //variables 
    Scanner in = new Scanner(System.in);
    multiplicarfunc mf = new multiplicarfunc();
    int option = 0;
    do {
        System.out.println("Menu Principal");
        System.out.println("1) Definir Matriz");
        System.out.println("2) Printar Matrizes existentes");
        System.out.println("3) Multiplicar Matrizes");
        System.out.println("4) Apagar Uma das Matrizes");
        System.out.println("9) Finalizar Aplicação");
        option = in.nextInt();
    
    switch (option) {
        case 1:
            mf.definy_matrix();
            break;
        case 2:
            mf.aux_printMatrix_checkDataVault();
            break;
        case 3:
            mf.aux_operation();
            break;
        case 4:
            mf.eraseMatrix();
            break;
        case 9:
            System.out.println("Sistema Finalizado ");
        default:
            break;
    }
    }while(option != 9);
    in.close();
    }
}