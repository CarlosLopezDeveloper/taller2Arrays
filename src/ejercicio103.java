import java.util.Scanner;

public class ejercicio103 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Leer dimensiones de la matriz
        System.out.print("Introduce el número de filas: ");
        int filas = entrada.nextInt();
        System.out.print("Introduce el número de columnas: ");
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

        // Visualizar la matriz
        System.out.println("\nMatriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Encontrar el mayor y menor elemento y sus posiciones
        int mayor = matriz[0][0];
        int menor = matriz[0][0];
        int posMayorFila = 0, posMayorColumna = 0;
        int posMenorFila = 0, posMenorColumna = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    posMayorFila = i;
                    posMayorColumna = j;
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    posMenorFila = i;
                    posMenorColumna = j;
                }
            }
        }

        // Mostrar los resultados
        System.out.println("\nMayor elemento: " + mayor + " en posición [" + posMayorFila + "][" + posMayorColumna + "]");
        System.out.println("Menor elemento: " + menor + " en posición [" + posMenorFila + "][" + posMenorColumna + "]");

    }
}
