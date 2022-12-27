import java.util.HashSet;
import java.util.Set;

public class SumOfMultiples {

    // Declara una variable de tipo Set llamada multiplos
    private final Set<Integer> multiplos = new HashSet<>();

    // Constructor de la clase que toma dos argumentos: number y set
    public SumOfMultiples(int number, int[] set) {

        // Itera sobre cada elemento del conjunto set
        for (int pivote : set) {

            // Si el elemento actual es diferente de cero
            if (pivote != 0) {
                // Itera desde el elemento actual hasta el número dado
                for (int i = pivote; i < number; i += pivote) {
                    // Agrega el elemento actual a la colección multiplos
                    multiplos.add(i);
                }
            }
        }
    }

    // Método que devuelve la suma de todos los elementos de la colección multiplos
    public int getSum() {
        // Utiliza el método stream de multiplos para obtener un stream de enteros
        // Luego utiliza el método mapToInt para convertir cada elemento del stream en un entero
        // Finalmente, utiliza el método sum para sumar todos los elementos del stream
        return multiplos.stream().mapToInt(Integer::intValue).sum();
    }
}



