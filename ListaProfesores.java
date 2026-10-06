public class ListaProfesores extends LinkedList<Profesor>{

    public LinkedList<String> proxCambio(){
        LinkedList<String> resultado = new LinkedList<>();
        Node<Profesor> cursor = first;
        while(cursor != null){
            if(cursor.getInfo().getCategoria().equalsIgnoreCase("Instructor") && cursor.getInfo().getEdad() > 26){
                resultado.add(cursor.getInfo().getNombre());
            }
            cursor = cursor.getNext();
        }
        return resultado;
    }

    private void insertarOrdenado(Profesor p){
        if(isEmpty() || p.getEdad() > first.getInfo().getEdad()){
            add(p, 0);
        } else {
            Node<Profesor> cursor = first;
            int index = 0;
            while(cursor.getNext() != null && cursor.getNext().getInfo().getEdad() >= p.getEdad()){
                cursor = cursor.getNext();
                index++;
            }
            add(p, index + 1);
        }
    }

    public ListaProfesores mostrarLista(){
        ListaProfesores resultado = new ListaProfesores();
        Node<Profesor> cursor = first;
        while(cursor != null){
            resultado.insertarOrdenado(cursor.getInfo());
            cursor = cursor.getNext();
        }
        return resultado;
    }

    public String cantProfesores(){
        int instructores = 0;
        int asistentes = 0;
        int auxiliares = 0;
        int titulares = 0;
        Node<Profesor> cursor = first;
        while(cursor != null){
            String categoria = cursor.getInfo().getCategoria();
            if(categoria.equalsIgnoreCase("Instructor")){
                instructores++;
            } else if(categoria.equalsIgnoreCase("Asistente")){
                asistentes++;
            } else if(categoria.equalsIgnoreCase("Auxiliar")){
                auxiliares++;
            } else if(categoria.equalsIgnoreCase("Titular")){
                titulares++;
            }
            cursor = cursor.getNext();
        }
        return "Instructor: " + instructores + "\n"
                + "Asistente: " + asistentes + "\n"
                + "Auxiliar: " + auxiliares + "\n"
                + "Titular: " + titulares;
    }

}