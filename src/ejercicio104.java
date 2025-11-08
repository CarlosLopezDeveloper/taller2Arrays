import java.util.Scanner;

public class ejercicio104 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce la cantidad de números: ");
        int n = entrada.nextInt();

        double[] numeros = new double[n];

        System.out.println("Introduce los números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextDouble();
        }

        double media = calcularMedia(numeros);
        double varianza = calcularVarianza(numeros, media);
        double desviacionEstandar = Math.sqrt(varianza);

        System.out.println("\nMedia: " + media);
        System.out.println("Varianza: " + varianza);
        System.out.println("Desviación Estándar: " + desviacionEstandar);
    }

    public static double calcularMedia(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    public static double calcularVarianza(double[] numeros, double media) {
        double sumaCuadrados = 0;
        for (double num : numeros) {
            sumaCuadrados += Math.pow(num - media, 2);
        }
        return sumaCuadrados / numeros.length;
    }
}
