import java.util.InputMismatchException;
import java.util.Scanner;

public class UsoSudoku {
    
    public static void main(String[] args){
        int opcion;
        boolean repetir = true;
        boolean display = false;
        Sudoku sudoku = new Sudoku(null);
        int[][] sudokuCustom = {
                { 3, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 }
        };
        int[][] correcto = {
                { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 }
        };
        int[][] incorrecto = {
                { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 7 } // Último elemento en la última fila cambiado a 7
        };
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido al comprobador de Sudokus");
        System.out.println("Este programa comprueba que el sudoku ingresado se ha resuelto de manera correcta.");
        while (repetir) {
            System.out.println("-----------------------------------------------");
            System.out.println("Opciones:");
            System.out.println("1. Comprobar el sudoku ingresado en el código.");
            System.out.println("2. Usar ejemplo de un Sudoku correcto");
            System.out.println("3. Usar un ejemplo de un Sudoku incorrecto");
            System.out.println("4. Salir");
            try {
                opcion = input.nextInt();
            } catch (InputMismatchException em) {
                opcion = 5;
                input.nextLine();
            }
            switch (opcion) {
                case 1:
                    sudoku = new Sudoku(sudokuCustom);
                    display = true;
                    break;
                case 2:
                    sudoku = new Sudoku(correcto);
                    display = true;
                    break;
                case 3:
                    sudoku = new Sudoku(incorrecto);
                    display = true;
                    break;
                case 4:
                    repetir = false;
                    display = false;
                    break;
                default:
                    System.out.println("Entrada incorrecta, intentalo nuevamente");
                    display = false;
                    repetir = true;
            }
            if (display) {
                System.out.println("Sudoku a revisar:");
                System.out.println(sudoku.toString());
                System.out.println("---------------");
                System.out.println("Sudoku completado correctamente?: "+
                                   (sudoku.verificarCompleto() ? "Si" : "No"));
            }
        }
    }
}
