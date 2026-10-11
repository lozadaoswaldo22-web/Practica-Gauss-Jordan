
public class Gauss {

    // Convierte la matriz aumentada en una matriz triangular superior.
    public static double[][] eliminacionGaussiana(double[][] matriz) {

        int n = matriz.length;
        int columnas = matriz[0].length;

        // Recorre los pivotes, excepto el último.
        for (int pivote = 0; pivote < n - 1; pivote++) {

            // Comprueba que el pivote no sea cero.
            if (Math.abs(matriz[pivote][pivote]) < 1e-12) {
                throw new ArithmeticException(
                        "Pivote cero. Se requiere intercambio de filas."
                );
            }

            // Elimina los elementos debajo del pivote.
            for (int fila = pivote + 1; fila < n; fila++) {

                double factor =
                        matriz[fila][pivote] / matriz[pivote][pivote];

                // Actualiza los elementos de la fila.
                for (int col = pivote; col < columnas; col++) {
                    matriz[fila][col] -= factor * matriz[pivote][col];
                }
            }
        }

        return matriz;
    }
}
