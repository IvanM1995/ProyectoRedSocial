
package proyectoredsocial;

import java.util.ArrayList;
import java.util.List;


public class NodoFinal {
    protected String nombre; //(deporte,turismo,musica,etc.)
    protected List<String> listaUsuarios; //(usuarios para sugerir)

    public NodoFinal(String nombre) {
        this.nombre = nombre;
        this.listaUsuarios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getListaAmigos() {
        return listaUsuarios;
    }


 
      // Método para agregar amigos a la lista de amigos 
    public void agregarAmigo(String nombre) {
        listaUsuarios.add(nombre);
    }

    // Método para mostrar las sugerencias de amigos segun el criterio seleccionado
    public void mostrarAmigos() {
        if (listaUsuarios.isEmpty()) {
            System.out.println("No hay sugerencias de amigos para esta categoría.");
        } else {
            System.out.println("Los amigos sugeridos de la lista :  " + nombre + " son " + listaUsuarios);
        }
    }
    @Override
public String toString() {
    return "NodoFinal{" + "nombre='" + nombre + "', listaUsuarios=" + listaUsuarios + '}';
}

}
  
