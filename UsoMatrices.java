import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
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
                input.nextLine();
                choice = 6;
            }
            switch(choice){
            case 1:
                sumador();
                break;
            case 2:
                multiplicador();
                break;
            case 3:
                transponedor();
                break;
            case 4:
                multiplicadorEscalar();
                break;
            case 5:
                repetir = false;
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

    public static void multiplicador(){
        Matriz5x5 producto1 = new Matriz5x5(1);
        Matriz5x5 producto2 = new Matriz5x5(1);

        System.out.println("---Matrices a multiplicar---");
        System.out.println("");
        System.out.println(producto1);
        System.out.println();
        System.out.println(producto2);
        System.out.println("------------");
        System.out.println("Resultado:");
        System.out.println();
        Matriz5x5 resultado = Matriz5x5.multipMatrices(producto1, producto2);
        System.out.println(resultado);
    }

    public static void transponedor(){
        Matriz5x5 transponible = new Matriz5x5(1);

        System.out.println("---Matriz a transponer---");
        System.out.println("");
        System.out.println(transponible);
        System.out.println();
        System.out.println("-----------");
        System.out.println("Resultado");
        System.out.println();
        transponible.transponer();
        System.out.println(transponible);
    }

    public static void multiplicadorEscalar(){
        Matriz5x5 matriz5x5 = new Matriz5x5(1);
        Random random = new Random();
        int escalar = random.nextInt(4)+3;

        System.out.println("---Matriz a multiplicar---");
        System.out.println("");
        System.out.println(matriz5x5);
        System.out.println();
        System.out.println("Escalar a multiplicar: "+escalar);
        System.out.println("-----------");
        System.out.println("Resultado");
        System.out.println();
        Matriz5x5 resultado = Matriz5x5.multipMatrices(matriz5x5, escalar);
        System.out.println(resultado);
    }

}
