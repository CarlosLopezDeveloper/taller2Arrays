import java.util.Arrays;
import java.util.Random;

public class ejercicio109 {
    static void main(String[] args) {
        int[] arreglo = new int[20];
        Random random = new Random();

        // Generar el arreglo aleatorio
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(100); // Números aleatorios entre 0 y 99
        }

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(arreglo));

        // Reorganizar el arreglo para que la suma de los primeros 10 elementos sea mayor
        colocarMayorSumaPrimeraMitad(arreglo);

        System.out.println("Arreglo modificado:");
        System.out.println(Arrays.toString(arreglo));
    }

    public static void colocarMayorSumaPrimeraMitad(int[] arreglo) {
        // Ordenar el arreglo de mayor a menor
        Arrays.sort(arreglo);

        // Invertir el arreglo para que esté de mayor a menor
        for (int i = 0; i < arreglo.length / 2; i++) {
            int temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
        }
    }
}
