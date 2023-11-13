public class Sudoku {

    int[][] sudoku = new int[9][9];

    public Sudoku(int[][] input) throws entradaInvalidaException {
        if (input.length > 9 || input[0].length > 9) {
            throw new entradaInvalidaException("");
        }
    }

    public boolean verificarCompleto() {
        boolean filasBien = checkFilas();
        boolean columnasBien = checkColumnas();
        boolean cuadrantesBien = true;

        for (int i = 0; i <= 9; i++) {
            if (!checkCuadrante(i)) {
                cuadrantesBien = false;
                break;
            }
        }
        if (filasBien && columnasBien && cuadrantesBien) {
            return true;
        } else {
            return false;
        }
    }

    protected boolean checkFilas() {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                for (int k = j + 1; k < sudoku[0].length; k++) {
                    if (sudoku[i][j] == sudoku[i][k] || sudoku[i][k] > 9 || sudoku[i][k] < 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    protected boolean checkColumnas() {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                for (int k = j + 1; k < sudoku[0].length; k++) {
                    if (sudoku[j][i] == sudoku[k][i] || sudoku[k][i] > 9 || sudoku[k][i] < 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    protected boolean checkCuadrante(int cuadrante) {
        int centroX = 2 + 3 * ((cuadrante - 1) % 3);
        int centroY = 2 + 3 * ((cuadrante - 1) / 3);

        int[] cuadranteList = { sudoku[centroX - 1][centroY - 1], sudoku[centroX - 1][centroY],
                sudoku[centroX - 1][centroY + 1], sudoku[centroX][centroY - 1], sudoku[centroX][centroY],
                sudoku[centroX][centroY + 1], sudoku[centroX + 1][centroY - 1], sudoku[centroX + 1][centroY],
                sudoku[centroX + 1][centroY + 1] };
        for(int i = 0; i<cuadranteList.length; i++){
            for(int j= i+1;i<cuadranteList.length; j++){
                if(cuadranteList[i]==cuadranteList[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
