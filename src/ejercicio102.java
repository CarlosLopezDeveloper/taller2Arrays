import java.util.Scanner;

public class ejercicio102 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        // Asegurar de que n es impar y entre 3 y 11
        do {
            System.out.print("Introduce un número impar entre 3 y 11: ");
            n = entrada.nextInt();
        } while (n < 3 || n > 11 || n % 2 == 0);

        int[][] cuadradoMagico = new int[n][n];

        // Inicializamos las variables
        int numero = 1;
        int i = 0;
        int j = n / 2;

        while (numero <= n * n) {
            cuadradoMagico[i][j] = numero;

            // Guardar las posiciones
            int nuevaI = (i - 1 + n) % n;
            int nuevaJ = (j + 1) % n;

            if (cuadradoMagico[nuevaI][nuevaJ] != 0) {
                // Si la posición está ocupada, mover hacia abajo
                i = (i + 1) % n;
            } else {
                // Actualizar a la nueva posición
                i = nuevaI;
                j = nuevaJ;
            }

            numero++;
        }

        // Imprimir el cuadrado mágico
        imprimirCuadrado(cuadradoMagico);
    }

    public static void imprimirCuadrado(int[][] cuadrado) {
        int n = cuadrado.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(cuadrado[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
