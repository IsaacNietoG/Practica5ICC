import java.util.Random;
public class Matriz5x5 {
    protected Random randomizador = new Random();
    int[][] matriz = new int[5][5];

    public Matriz5x5(int aux){
        /**
           Genera un objeto Matriz5x5, ya sea vacio o aleatorizado.

           Este metodo constructor tiene dos modos que se pueden escoger segun
           el argumento que se le de al constructor. Uno generará una instancia
           cuyo arreglo interno será lleno de números aleatorios en un rango de -9
           a 9, el otro modo generará solamente la instancia con su arreglo interno
           vacío.
           Se implementaron dos modos para evitar uso innecesario de recursos, pues
           para los métodos estáticos de esta clase que retornan una instancia de
           la misma, sería ineficiente generar una matriz aleatorizada que luego
           se reescribirá.
           Utiliza la clase Random de java para rellenar el arreglo interno de la
           instancia de Matriz5x5

           @param aux    Si el int proporcionado como argumento es distinto a 0,
                         se construirá una instancia cuyo arreglo interno contendrá
                         números aleatorizados en un rango de -9 a 9, caso opuesto,
                         se generará una instancia cuyo arreglo interno esté vacío.

           @return una instancia de Matriz5x5
         */
        if(aux != 0){
            for(int i = 0; i<matriz.length; i++){
                for(int j = 0; j<matriz[i].length; j++){
                    matriz[i][j] = randomizador.nextInt(19)-9;
                }
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

    public String toString(){
        /**
           Retorna una String de varias lineas que representa la matriz.
           Cuenta con una estructura que alinea los datos para que se muestren de manera
           adecuada.

           Ejemplo:
           3 4 5 6 7 8
           3 5 6 7 8 9
           4 4 4 4 4 4
           4 4 4 4 4 4
           4 4 4 4 4 4

           Esto para una mejor representacion al usuario.
         */
        String toString = "";

        for(int i=0; i<matriz.length; i++){
            for(int j = 0; j<matriz.length; j++){
                if(matriz[i][j]>=0){
                    toString += " ";
                }
                if((matriz[i][j] <= 9 && matriz[i][j] >=0) || (matriz[i][j] >= -9 && matriz[i][j] <= 0)){
                    toString += " ";
                }
                if((matriz[i][j]<= 99 && matriz[i][j] >=0) || (matriz[i][j] >= -99 & matriz[i][j] <= 0)){
                    toString += " ";
                }
                toString += " " + matriz[i][j] + " ";
            }
            toString += "\n";
        }

        return toString;
    }

    public static Matriz5x5 sumaMatrices(Matriz5x5 sumando1, Matriz5x5 sumando2){
        /**
           Suma dos matrices de 5x5.

           @param sumando1 & sumando2  Las instancias que se usarán como sumando

           @return una Matriz5x5 que será el resultado de la suma.
         */
        Matriz5x5 resultado = new Matriz5x5(0);
        for(int i = 0; i<sumando1.matriz.length; i++){
            for(int j = 0; j<sumando1.matriz.length; j++){
                resultado.matriz[i][j] = sumando1.matriz[i][j] + sumando2.matriz[i][j];
            }
        }
        return resultado;
    }

    public static Matriz5x5 multipMatrices(Matriz5x5 factor1, Matriz5x5 factor2){
        /**
           Multiplica dos matrices de 5x5.

           @param factor1 & factor2   Las instancias que se usarán como factores
           de la operación.

           @return una Matriz5x5 que será el resultado de multiplicar ambos params
         */
        Matriz5x5 resultado = new Matriz5x5(0);
        for(int i = 0; i<factor1.matriz.length; i++){
            for(int j = 0; j<factor1.matriz.length; j++){
                int subresultado=0;
                for(int k = 0; k<factor1.matriz.length; k++){
                    subresultado += (factor1.matriz[i][k] * factor2.matriz[k][j]);
                }
                resultado.matriz[i][j] = subresultado;
            }
        }
        return resultado;
    }

    public void transponer(){
        /**
           Transpone el arreglo interno de la instancia en donde se ejecute. Esto
           lo logra invirtiendo las coordenadas del arreglo.
         */
        int[][] temp = new int[5][5];
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz.length; j++){
                temp[j][i] = matriz[i][j];
            }
        }
        matriz = temp;
    }

    public static Matriz5x5 multipMatrices(Matriz5x5 factor1, int factor2){
        Matriz5x5 resultado = new Matriz5x5(0);
        for(int i = 0; i<factor1.matriz.length; i++){
            for(int j = 0; j<factor1.matriz.length; j++){
                resultado.matriz[i][j] = factor1.matriz[i][j]*factor2;
            }
        }
        return resultado;
    }

}


