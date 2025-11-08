import java.util.HashSet;
import java.util.Set;

public class ejercicio106 {
    static void main(String[] args) {
        int[] arreglo = {4, 7, 5, 7, 2, 4, 10, 5, 8};

        int cambios = eliminarDuplicados(arreglo);

        System.out.println("Arreglo modificado:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }

        System.out.println("\nNúmero de entradas modificadas: " + cambios);
    }

    public static int eliminarDuplicados(int[] arreglo) {
        Set<Integer> encontrados = new HashSet<>();
        int cambios = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (encontrados.contains(arreglo[i])) {
                arreglo[i] = -5;
                cambios++;
            } else {
                encontrados.add(arreglo[i]);
            }
        }

        return cambios;
    }
}
