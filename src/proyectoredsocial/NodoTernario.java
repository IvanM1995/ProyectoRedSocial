
package proyectoredsocial;


public class NodoTernario {
    protected String nombre; // El nombre del nodo(Red Social)
    protected NodoTernario hijoIzquierdo; // Hijo izquierdo (ej. intereses en común)
    protected NodoTernario hijoCentral;   // Hijo central (ej. amigos en común)
    protected NodoTernario hijoDerecho;   // Hijo derecho (ej. ubicación geográfica)

    // Constructor que permite inicializar el nombre y los hijos del nodo
    public NodoTernario(String nombre, NodoTernario hijoIzquierdo, NodoTernario hijoCentral, NodoTernario hijoDerecho) {
        this.nombre = nombre;
        this.hijoIzquierdo = hijoIzquierdo;
        this.hijoCentral = hijoCentral;
        this.hijoDerecho = hijoDerecho;
    }

    public NodoTernario(String nombre) {
        this(nombre, null, null, null);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoTernario getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoTernario hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoTernario getHijoCentral() {
        return hijoCentral;
    }

    public void setHijoCentral(NodoTernario hijoCentral) {
        this.hijoCentral = hijoCentral;
    }

    public NodoTernario getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoTernario hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }
     public void asignarHijos(String nombreIzquierdo, String nombreCentral, String nombreDerecho) {
        this.hijoIzquierdo = new NodoTernario(nombreIzquierdo);
        this.hijoCentral = new NodoTernario(nombreCentral);
        this.hijoDerecho = new NodoTernario(nombreDerecho);
    }

    @Override
    public String toString() {
        return "NodoTernario{" + "nombre=" + nombre + ", hijoIzquierdo=" + hijoIzquierdo + ", hijoCentral=" + hijoCentral + ", hijoDerecho=" + hijoDerecho + '}';
    }
    
}
