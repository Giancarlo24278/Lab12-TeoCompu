import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problema4 {
    public static <T> List<T> eliminar(List<T> lista, List<T> elementosABorrar) {
        // La lambda conserva solamente los elementos que no estan en la lista de borrado.
        // Se conserva el orden y no se modifica la lista original.
        return lista.stream()
                .filter(elemento -> !elementosABorrar.contains(elemento))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> lista = Arrays.asList(
                "rojo", "verde", "azul", "amarillo", "gris", "blanco", "negro");
        List<String> elementosABorrar = Arrays.asList("amarillo", "cafe", "blanco");

        System.out.println("Lista original: " + lista);
        System.out.println("Elementos a borrar: " + elementosABorrar);
        System.out.println("Elementos restantes: " + eliminar(lista, elementosABorrar));
    }
}
