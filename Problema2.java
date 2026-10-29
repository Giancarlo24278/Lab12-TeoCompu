import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problema2 {
    // LinkedHashMap mantiene el orden de las claves al imprimir cada diccionario.
    private static Map<String, Object> telefono(String make, int model, String color) {
        Map<String, Object> datos = new LinkedHashMap<>();
        datos.put("make", make);
        datos.put("model", model);
        datos.put("color", color);
        return datos;
    }

    public static List<Map<String, Object>> ordenar(
            List<Map<String, Object>> lista, String clave) {
        if (!Arrays.asList("make", "model", "color").contains(clave)) {
            throw new IllegalArgumentException("La clave debe ser make, model o color.");
        }

        // La lambda compara numeros como numeros y textos alfabeticamente.
        // sorted crea un flujo ordenado sin modificar la lista original.
        return lista.stream()
                .sorted((a, b) -> {
                    if (clave.equals("model")) {
                        return Integer.compare((Integer) a.get(clave), (Integer) b.get(clave));
                    }
                    return ((String) a.get(clave)).compareTo((String) b.get(clave));
                })
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Map<String, Object>> lista = Arrays.asList(
                telefono("Nokia", 216, "Black"),
                telefono("Mi Max", 2, "Gold"),
                telefono("Samsung", 7, "Blue"));

        // Se puede indicar otra clave: java Problema2.java color
        String clave = args.length > 0 ? args[0] : "model";
        if (!Arrays.asList("make", "model", "color").contains(clave)) {
            System.err.println("La clave debe ser make, model o color.");
            System.exit(1);
        }
        System.out.println("Lista original: " + lista);
        System.out.println("Clave: " + clave);
        System.out.println("Lista ordenada: " + ordenar(lista, clave));
    }
}
