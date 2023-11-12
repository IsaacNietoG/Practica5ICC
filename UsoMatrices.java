import java.util.InputMismatchException;
import java.util.Scanner;
public class UsoMatrices {
    
    public static void main(String[] args){
        /**
           La interfaz para usar la implemetacion de matrices solicitada en la Practica.
        
           Implementa una nueva estructura para recibir entradas del usuario que aprovecha
           el manejo de excepciones de Java. Asi mismo, para mayor facilidad de lectura
           implemento metodos atomicos para cada una de las opciones. Asi, en este metodo
           solamente queda la estructura básica que llamará a los demás métodos corresp-
           ondientes.
         */
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
                sumador();
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

    public static void sumador(){
        Matriz5x5 sumando1 = new Matriz5x5(1);
        Matriz5x5 sumando2 = new Matriz5x5(1);

        System.out.println("---Matrices a sumar---");
        System.out.println("");
        System.out.println(sumando1);
        System.out.println();
        System.out.println(sumando2);
        System.out.println("------------");
        System.out.println("Resultado:");
        System.out.println();
        Matriz5x5 resultado = Matriz5x5.sumaMatrices(sumando1, sumando2);
        System.out.println(resultado);
    }
}
