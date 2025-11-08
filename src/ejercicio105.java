import java.util.Scanner;

public class ejercicio105 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Leer dimensiones de la matriz
        System.out.print("Introduce el número de filas de la matriz: ");
        int filas = entrada.nextInt();
        System.out.print("Introduce el número de columnas de la matriz: ");
        int columnas = entrada.nextInt();

        int[][] matriz = new int[filas][columnas];

        // Llenar la matriz con datos ingresados por el usuario
        System.out.println("Introduce los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        // Calcular la transpuesta
        int[][] transpuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        // Imprimir la matriz original
        System.out.println("\nMatriz original:");
        imprimirMatriz(matriz);

        // Imprimir la matriz transpuesta
        System.out.println("\nMatriz transpuesta:");
        imprimirMatriz(transpuesta);
    }

    // Método para imprimir una matriz
    private static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
    }
}
}
