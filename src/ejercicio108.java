import java.util.Scanner;

public class ejercicio108 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Leer dimensiones de la matriz
        System.out.print("Introduce el número de filas de la matriz: ");
        int filas = entrada.nextInt();
        System.out.print("Introduce el número de columnas de la matriz: ");
        int columnas = entrada.nextInt();

        double[][] matriz = new double[filas][columnas];

        // Llenar la matriz con datos ingresados por el usuario
        System.out.println("Introduce los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextDouble();
            }
        }

        // Encontrar el punto de silla
        boolean encontrado = false;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                double elemento = matriz[i][j];
                boolean esMenorEnFila = true;
                boolean esMayorEnColumna = true;

                // Verificar si es el menor en su fila
                for (int k = 0; k < columnas; k++) {
                    if (matriz[i][k] < elemento) {
                        esMenorEnFila = false;
                        break;
                    }
                }

                // Verificar si es el mayor en su columna
                for (int k = 0; k < filas; k++) {
                    if (matriz[k][j] > elemento) {
                        esMayorEnColumna = false;
                        break;
                    }
                }

                if (esMenorEnFila && esMayorEnColumna) {
                    System.out.println("Punto de silla encontrado en posición [" + i + "][" + j + "] con valor " + elemento);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró un punto de silla en la matriz.");
        }
    }
}
