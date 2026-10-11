
public class GaussJordan {

    // Aplica Gauss-Jordan reutilizando la clase Gauss.
    public static double[][] resolver(double[][] matriz) {

        // Reutiliza la eliminación gaussiana anterior.
        Gauss.eliminacionGaussiana(matriz);

        int n = matriz.length;
        int columnas = matriz[0].length;

        // Recorre las filas desde abajo hacia arriba.
        for (int fila = n - 1; fila >= 0; fila--) {

            double pivote = matriz[fila][fila];

            // Evita dividir entre cero.
            if (Math.abs(pivote) < 1e-12) {
                throw new ArithmeticException(
                        "No se puede normalizar un pivote cero."
                );
            }

            // Convierte el pivote en uno.
            for (int col = 0; col < columnas; col++) {
                matriz[fila][col] /= pivote;
            }

            // Elimina los coeficientes de las filas superiores.
            for (int filaSuperior = 0;
                 filaSuperior < fila;
                 filaSuperior++) {

                double factor = matriz[filaSuperior][fila];

                for (int col = 0; col < columnas; col++) {
                    matriz[filaSuperior][col] -=
                            factor * matriz[fila][col];
                }
            }
        }

        return matriz;
    }
}
