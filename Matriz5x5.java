import java.util.Random;
public class Matriz5x5 {
    protected Random randomizador = new Random();
    protected int[][] matriz = new int[5][5];

    public Matriz5x5(){
        /**
           Genera un objeto Matriz5x5 con numeros entre -9 y 9

           Utiliza la clase Random de java para rellenar el arreglo interno de la
           instancia de Matriz5x5

           @return una instancia de Matriz5x5
         */
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                matriz[i][j] = randomizador.nextInt(19)-9;
            }
        }
    }

    public void setMatriz(int[][] input){
        /**
           Metodo para setear el arreglo interno del objeto Matriz5x5

           @param input un arreglo bidimensional que será el nuevo arreglo interno
           de la instancia.
         */
        matriz = input;
    }

    


}
