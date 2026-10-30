# Laboratorio 12 - Teoria de la Computacion

====
Giancarlo Sagastume Guevara
24278
====

Los problemas de programacion estan implementados en Java con funciones lambda.
Cada archivo contiene su propio `main` y se ejecuta de forma independiente.

## Requisito

JDK 11 o superior, con el comando `java` disponible en la terminal.

## Viedo Ejecucion

Link: https://youtu.be/r2Vw2LCgLYM

### Problema 2: ordenar diccionarios

Usa `Map<String, Object>` para representar cada diccionario y `sorted` con una
lambda para ordenar una lista nueva. La clave predeterminada es `model`.
Tambien puedes indicar la clave al ejecutar:

```powershell
java Problema2.java make
java Problema2.java color
```

Con `model`, los modelos quedan en el orden `2, 7, 216`.
Los textos se ordenan de forma lexicografica, distinguiendo mayusculas.

### Problema 3: transponer una matriz

Usa listas de listas y lambdas en `mapToObj` y `map`. Tambien admite matrices
rectangulares; rechaza filas de longitudes distintas.

Resultado del ejemplo: `[[1, 4, 7], [2, 5, 8], [3, 6, 9]]`.

### Problema 4: eliminar elementos de una lista

Usa `filter` con una lambda. Elimina todas las apariciones de los elementos
indicados, ignora los que no existen y conserva el orden de los restantes.

Resultado del ejemplo: `[rojo, verde, azul, gris, negro]`.

Para cambiar los ejemplos, edita las listas declaradas en el `main` del archivo
correspondiente. Ninguno de los tres programas modifica sus listas originales.
