import java.util.InputMismatchException;
import java.util.Scanner;
public class UsoMatrices {
    
    public static void main(String[] args){
        boolean repetir = true;
        int choice = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido al operador de matrices.");
        System.out.println("Este programa genera matrices de 5x5 con valores aleatorizados");
        System.out.println("Las matrices generadas serán mostradas junto con el resultado, el rango de los numeros dentro de las matrices es de -9 a 9");
        do{
            System.out.println("1. Sumar matrices");
            System.out.println("2. Multiplicar matrices");
            System.out.println("3. Transponer matriz");
            System.out.println("4. Multiplicar matriz por un escalar");
            System.out.println("5. Salir");
            try{
                choice = input.nextInt();
            } catch (InputMismatchException ex){
                choice = 6;
            }
            switch(choice){
            case 1:
                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Entrada inválida");
                repetir = true;
            }
        }while(repetir);
    }
}
