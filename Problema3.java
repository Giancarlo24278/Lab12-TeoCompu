import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problema3 {
    public static List<List<Integer>> transponer(List<List<Integer>> matriz) {
        if (matriz.isEmpty()) {
            return Collections.emptyList();
        }
        int columnas = matriz.get(0).size();
        if (matriz.stream().anyMatch(fila -> fila.size() != columnas)) {
            throw new IllegalArgumentException("Todas las filas deben tener la misma longitud.");
        }

        // Cada columna original se convierte en una fila de la transpuesta.
        // Las lambdas recorren las columnas y extraen un elemento de cada fila.
        return IntStream.range(0, columnas)
                .mapToObj(columna -> matriz.stream()
                        .map(fila -> fila.get(columna))
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<List<Integer>> matriz = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9));

        System.out.println("Matriz original: " + matriz);
        System.out.println("Matriz transpuesta: " + transponer(matriz));
    }
}
