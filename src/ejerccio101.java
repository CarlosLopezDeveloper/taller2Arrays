import java.util.Scanner;

public class ejerccio101 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el número de filas para el triángulo de Pascal: ");
        int filas = entrada.nextInt();

        int[][] triangulo = new int[filas][];

        for (int i = 0; i < filas; i++) {
            triangulo[i] = new int[i + 1];
            triangulo[i][0] = 1;
            triangulo[i][i] = 1;

            for (int j = 1; j < i; j++) {
                triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
            }
        }

        imprimirTriangulo(triangulo);
    }

    public static void imprimirTriangulo(int[][] triangulo) {
        for (int i = 0; i < triangulo.length; i++) {
            for (int j = 0; j < triangulo[i].length; j++) {
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
