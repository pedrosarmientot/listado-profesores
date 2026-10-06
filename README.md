# Control de profesores

Lista Simplemente Enlazada para manejar los datos de varios profesores.

## Que hace

- `proxCambio()`: nombres de los instructores con mas de 26 anos, proximos a pasar a asistente.
- `mostrarLista()`: profesores ordenados por edad de mayor a menor.
- `cantProfesores()`: cantidad de profesores por categoria docente.

## Clases

- `Node<E>`: nodo de la lista.
- `IList<E>` y `LinkedList<E>`: lista enlazada generica.
- `Profesor`: nombre, edad y categoria de cada profesor.
- `ListaProfesores`: extiende `LinkedList<Profesor>` y tiene los tres metodos del ejercicio.
- `Main`: casos de prueba, incluidos los limites (instructor de 26 anos, sin proximos a cambio, categorias vacias, un solo profesor).

## Como ejecutarlo

```bash
javac *.java
java Main
```