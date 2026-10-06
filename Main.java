public class Main {
    public static void main(String[] args) {
        ListaProfesores lista = new ListaProfesores();

        lista.add(new Profesor("Carlos", 30, "Instructor"));
        lista.add(new Profesor("Laura", 26, "Instructor"));
        lista.add(new Profesor("Pedro", 27, "Instructor"));
        lista.add(new Profesor("Marta", 35, "Asistente"));
        lista.add(new Profesor("Jose", 45, "Auxiliar"));
        lista.add(new Profesor("Rosa", 58, "Titular"));
        lista.add(new Profesor("Ana", 35, "Asistente"));

        System.out.println("Todos los profesores:");
        mostrar(lista);

        System.out.println("\nProximos a cambio de categoria:");
        mostrarNombres(lista.proxCambio());

        System.out.println("\nProfesores por edad (mayor a menor):");
        mostrar(lista.mostrarLista());

        System.out.println("\nCantidad por categoria:");
        System.out.println(lista.cantProfesores());

        System.out.println("\n--- Casos limite ---");

        ListaProfesores sinCambio = new ListaProfesores();
        sinCambio.add(new Profesor("Luis", 22, "Instructor"));
        sinCambio.add(new Profesor("Eva", 50, "Titular"));

        System.out.println("\nProximos a cambio sin ninguno:");
        mostrarNombres(sinCambio.proxCambio());

        System.out.println("\nCantidad con categorias vacias:");
        System.out.println(sinCambio.cantProfesores());

        ListaProfesores unico = new ListaProfesores();
        unico.add(new Profesor("Sara", 40, "Auxiliar"));

        System.out.println("\nUn solo profesor:");
        mostrar(unico.mostrarLista());
    }

    private static void mostrar(ListaProfesores lista) {
        Node<Profesor> cursor = lista.first;
        if (cursor == null) {
            System.out.println("(vacio)");
        }
        while (cursor != null) {
            Profesor p = cursor.getInfo();
            System.out.println(p.getNombre() + " | " + p.getEdad() + " anos | " + p.getCategoria());
            cursor = cursor.getNext();
        }
    }

    private static void mostrarNombres(LinkedList<String> nombres) {
        Node<String> cursor = nombres.first;
        if (cursor == null) {
            System.out.println("(vacio)");
        }
        while (cursor != null) {
            System.out.println(cursor.getInfo());
            cursor = cursor.getNext();
        }
    }
}