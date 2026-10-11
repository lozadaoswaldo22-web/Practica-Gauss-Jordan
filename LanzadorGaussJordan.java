
public class LanzadorGaussJordan {

    public static void main(String[] args) {

        // Obtiene la matriz aumentada original.
        double[][] matriz = defMatrizz.defmatriz();

        System.out.println("Matriz aumentada original:");
        imprimirMatriz(matriz);

        // Ejecuta el algoritmo de Gauss-Jordan.
        GaussJordan.resolver(matriz);

        System.out.println("\nMatriz reducida (identidad y soluciones):");
        imprimirMatriz(matriz);

        // Imprime las soluciones de cada incógnita.
        System.out.println("\nSoluciones del sistema:");

        for (int i = 0; i < matriz.length; i++) {
            System.out.printf(
                    "x%d = %.4f%n",
                    i + 1,
                    matriz[i][matriz[i].length - 1]
            );
        }
    }

    // Imprime la matriz en formato de tabla.
    private static void imprimirMatriz(double[][] matriz) {

        for (double[] fila : matriz) {
            for (double valor : fila) {
                System.out.printf("%10.4f", valor);
            }

            System.out.println();
        }
    }
}
