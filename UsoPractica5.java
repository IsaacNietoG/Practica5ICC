/**
 * TO-DO LIST
 * - Terminar la clase Matriz5x5
 * - Terminar la clase Sudoku
 * - Terminar la clase UsoMatrices
 * - Terminar la clase UsoSudoku
 * 
 * Matriz5x5:
 * - Crear un constructor que cree una matriz aleatoria con valores del -9 al 9
 * - Crear un metodo setMatriz(int[][] input) que cambie el arreglo interno.
 * - Crear el metodo estatico que retorna una matriz: sumaMatrices(Matriz5x5
 * sumando, Matriz5x5 sumando2)
 * - Crear el metodo estatico que retorna una matriz: multipMatrices(Matriz5x5
 * multip, Matriz5x5 multip2)
 * - Crear el metodo transponer() que transpone la matriz en donde se ejecute.
 * - Crear el metodo estatico multipMatrices(Matriz5x5 multip, int escalar) que
 * retorna una matriz
 * 
 * UsoMatrices:
 * - Crear el menu con las opciones:
 * 1. Sumar matrices
 * 2. Multiplicar matrices
 * 3. Transpuesta de una matriz
 * 4. Multiplicar matriz por un escalar.
 * - Crear el metodo sumaDeMatrices() que generará dos matrices aleatorizadas,
 * las sumará con sumaMatrices y
 * las mostrará al usuario.
 * - Crear el metodo multipDeMatrices() que generará dos matrices aleatorizadas,
 * las multiplicará con multipMatrices
 * y las mostrará al usuario.
 * - Crear el metodo transponedor() que generará una matriz, la transpondrá y
 * las mostrará al usuario
 * - Crear el metodo matrizXEscalar() que generará una matriz y un escalar (int
 * de 3 a 6) y los multiplicará. Luego
 * mostrará al usuario.
 * 
 * Sudoku:
 * - Crear un constructor que recibirá un arreglo int[9][9] y lo guardará como
 * su arreglo interno
 * - Crear un metodo llamado verificarCompleto() que verifique si el sudoku está
 * resuelto completamente
 * Pasos:
 * 1. Verificar que todos los numeros en la matriz sean distintos a 0 (por si
 * acaso)
 * 2. Verificar que cada fila tenga uno y solo un numero del 1-9
 * 3. Verificar que cada columna tenga uno y solo un numero del 1-9
 * 4. Verificar que cada cuadrante tenga uno y solo un numero del 1-9 (metodo
 * atomico verificarCuadrante)
 * - Crear el metodo llamado verificarCuadrante(int cuadrante) que verifique si
 * el cuadrante indicado
 * tiene uno y solo un numero del 1-9
 * - En el metodo verificarCuadrante:
 * 1. Con el numero entero se obtiene la coordenada del centro del cuadrante tal
 * que f(n) = x,y
 * tal que:
 * x = 2 + 3 * ((n - 1) % 3)
 * y = 2 + 3 * ((n - 1) // 3)
 * 2. Se crea un arreglo temporal unidimensional que tiene todos los elementos que circundan al
 * centro.
 * int[] subarreglo = {
 * {matriz[x - 1][y - 1], matriz[x -
 * 1][y], matriz[x - 1][y + 1],
 * matriz[x][y - 1], matriz[x][y],
 * matriz[x][y + 1],
 * matriz[x + 1][y - 1], matriz[x +
 * 1][y], matriz[x + 1][y + 1]
 * };
 *
 3. Verificar dentro del arreglo que no haya numeros repetidos. Approach: Tomar el primer numero, iterar sobre
 la lista y asegurar que solo salga una vez. Luego, tomar el segundo numero, iterar sobre la lista y asegurar que
 salga una vez, asi sucesivamente. Creo que podemos reciclar algo parecido al algoritmo del constructor de Manos.
 * 
 * UsoSudoku:
 * - Crear menu con dos opciones: Insertar sudoku mal resuelto e insertar sudoku bien resuelto
 - En ambas opciones: imprimir el sudoku y luego definir si está bien resuelto o mal resuelto
 */
public class UsoPractica5 {
    
    public static void main(String[] args){
        
    }
}
