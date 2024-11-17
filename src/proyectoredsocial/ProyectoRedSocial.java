
package proyectoredsocial;

import java.util.Scanner;



public class ProyectoRedSocial {

   
    public static void main(String[] args) {
      
         Scanner scanner = new Scanner(System.in);
         ArbolTernario arbol = new ArbolTernario();
         NodoTernario redSocial = new NodoTernario("Red Social");
         
        System.out.println("Creando Árbol Ternario...");
        System.out.println("Nodo raíz creado con criterios de búsqueda:");
         
         // Pedir al usuario que ingrese los nombres para cada hijo - Intereses en comun
        System.out.println("Ingrese el criterio de búsqueda para el hijo izquierdo (Intereses en Común):");
        String criterioIzquierdo = scanner.nextLine();
                                                            //Amigos en Comun
        System.out.println("Ingrese el criterio de búsqueda para el hijo central (Amigos en Común):");
        String criterioCentral = scanner.nextLine();
                                                            //Ubicacion Geografica
        System.out.println("Ingrese el criterio de búsqueda para el hijo derecho (Ubicación Geográfica):");
        String criterioDerecho = scanner.nextLine();

        // Asignar los hijos con los criterios ingresados
        redSocial.asignarHijos(criterioIzquierdo, criterioCentral, criterioDerecho);
          

// Crear nodos finales 
        NodoFinal deportes = new NodoFinal("Deporte");
        NodoFinal turismo = new NodoFinal("Turismo");
        NodoFinal musica = new NodoFinal("Música");
        
        NodoFinal trabajo = new NodoFinal("Del trabajo");
        NodoFinal instituto = new NodoFinal("Del instituto");
        NodoFinal club = new NodoFinal("Del club");
        
          
        NodoFinal mismoPais = new NodoFinal("Del mismo Pais");
        NodoFinal mismoIdioma = new NodoFinal("Que hablen el mismo idioma");
        NodoFinal mismaProvincia = new NodoFinal("De la provincia");


         // Agregar amigos a cada nodo final
        deportes.agregarAmigo("Rodrigo");
        deportes.agregarAmigo("Carla");
        deportes.agregarAmigo("Jesica");

        turismo.agregarAmigo("Diego");
        turismo.agregarAmigo("Monica");
        turismo.agregarAmigo("Gabriel");

        musica.agregarAmigo("Florencia");
        musica.agregarAmigo("Raul");
        musica.agregarAmigo("Lucas");

        trabajo.agregarAmigo("Robert");
        trabajo.agregarAmigo("Jesus");
        trabajo.agregarAmigo("Maira");
        trabajo.agregarAmigo("Josefina");
        instituto.agregarAmigo("Renata");
        instituto.agregarAmigo("Pablo");
        instituto.agregarAmigo("Viviana");
        club.agregarAmigo("Sebastian");
        club.agregarAmigo("Mariano");
               
        mismoPais.agregarAmigo("Sasha");
        mismoPais.agregarAmigo("Maria");
        mismoIdioma.agregarAmigo("Jazmin");
        mismoIdioma.agregarAmigo("Ramiro");
        mismoIdioma.agregarAmigo("Ciro");
        mismaProvincia.agregarAmigo("Manu");
        mismaProvincia.agregarAmigo("Kiara");
        mismaProvincia.agregarAmigo("Renzo");
     
        
        //Inicio de la consola y creacion del Arbol y sus nodos
        
        System.out.println("Nodo raíz creado con criterios de búsqueda:");
        System.out.println(" - Hijo Izquierdo: " + redSocial.hijoIzquierdo.nombre);
        System.out.println(" - Hijo Central: " + redSocial.hijoCentral.nombre);
        System.out.println(" - Hijo Derecho: " + redSocial.hijoDerecho.nombre);

        System.out.println("Ingrese su usuario:");
        String usuario = scanner.nextLine();
        System.out.println("Usuario " + usuario + " creado.");

        // Bucle de interacción con el usuario
        boolean salir = false;
        while (!salir) {
            System.out.println("\n¿Está buscando amigos? (si/no):");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("si")) {
                // Mostrar opciones de criterio de búsqueda
                System.out.println("\nSeleccione un criterio de búsqueda:");
                System.out.println("1. " + redSocial.hijoIzquierdo.nombre);  // Intereses en común
                System.out.println("2. " + redSocial.hijoCentral.nombre);    // Amigos en común
                System.out.println("3. " + redSocial.hijoDerecho.nombre);    // Ubicación geográfica
                System.out.println("4. Salir");

                int opcion = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcion) {
                    case 1:
                        System.out.println("Buscando amigos por " + redSocial.hijoIzquierdo.nombre + "...");
                        System.out.println("Seleccione una subcategoría:");
                        System.out.println("1. " + deportes.nombre);
                        System.out.println("2. " + turismo.nombre);
                        System.out.println("3. " + musica.nombre);

                        int subOpcion = scanner.nextInt();
                        scanner.nextLine(); 

                        switch (subOpcion) {
                            case 1:
                                deportes.mostrarAmigos();
                                  System.out.println("¿Desea agregar un amigo? (si/n)");
                                  String respuestaFinal = scanner.nextLine();
                                  if (respuestaFinal.equalsIgnoreCase("si")) {
                                  System.out.println("Ingrese el nombre de la persona que deseas agregar:");
                                  String nombreAmigo = scanner.nextLine();
                                  System.out.println("La persona " + nombreAmigo + " fue agregado a tu lista de amigos.");
                                  System.out.println("Lista de amigos: " + nombreAmigo + " y Lucas estan en tu lista de amigos");
                                  
                                 } 
                                  
                                break;
                            case 2:
                                turismo.mostrarAmigos();
                                  System.out.println("¿Desea agregar un amigo? (si/n)");
                                  String respuestaFinal1 = scanner.nextLine();
                                  if (respuestaFinal1.equalsIgnoreCase("si")) {
                                  System.out.println("Ingrese el nombre de la persona que deseas agregar:");
                                  String nombreAmigo = scanner.nextLine();
                                  System.out.println("La persona " + nombreAmigo + " fue agregado a tu lista de amigos.");
                                 }     
                                  
                                break;
                            case 3:
                                musica.mostrarAmigos();
                                System.out.println("¿Desea agregar un amigo? (si/n)");
                                  String respuestaFinal2 = scanner.nextLine();
                                  if (respuestaFinal2.equalsIgnoreCase("si")) {
                                  System.out.println("Ingrese el nombre de la persona que deseas agregar:");
                                  String nombreAmigo = scanner.nextLine();
                                  System.out.println("La persona " + nombreAmigo + " fue agregado a tu lista de amigos.");
                                 }                                                                                                     
                                break;
                            default:
                                System.out.println("Opción no válida. Intente nuevamente.");
                        }
                        break;
                      
                    case 2:
                        System.out.println("Buscando amigos por " + redSocial.hijoCentral.nombre + "...");                   
                        System.out.println("Seleccione una subcategoría:");
                        System.out.println("1. " + trabajo.nombre);
                        System.out.println("2. " + instituto.nombre);
                        System.out.println("3. " + club.nombre);  
                        
                        int subOpcion2 = scanner.nextInt();
                        scanner.nextLine();
                        switch(subOpcion2){
                    case 1:
                        trabajo.mostrarAmigos();
                        System.out.println("¿Desea agregar un amigo? (si/n)");
                                  String respuestaFinal1 = scanner.nextLine();
                                  if (respuestaFinal1.equalsIgnoreCase("si")) {
                                  System.out.println("Ingrese el nombre de la persona que deseas agregar:");
                                  String nombreAmigo = scanner.nextLine();
                                  System.out.println("La persona " + nombreAmigo + " fue agregado a tu lista de amigos.");
                                 }                                   
                        break;
                    case 2: 
                        instituto.mostrarAmigos();
                        System.out.println("¿Desea agregar un amigo? (si/n)");
                                  String respuestaFinal2 = scanner.nextLine();
                                  if (respuestaFinal2.equalsIgnoreCase("si")) {
                                  System.out.println("Ingrese el nombre de la persona que deseas agregar:");
                                  String nombreAmigo = scanner.nextLine();
                                  System.out.println("La persona " + nombreAmigo + " fue agregado a tu lista de amigos.");
                                 }                                    
                        break;
                    case 3:
                        club.mostrarAmigos();
                        System.out.println("¿Desea agregar un amigo? (si/n)");
                                  String respuestaFinal3 = scanner.nextLine();
                                  if (respuestaFinal3.equalsIgnoreCase("si")) {
                                  System.out.println("Ingrese el nombre de la persona que deseas agregar:");
                                  String nombreAmigo = scanner.nextLine();
                                  System.out.println("La persona " + nombreAmigo + " fue agregado a tu lista de amigos.");
                                   System.out.println("Lista de amigos: " + nombreAmigo + " y Robert  estan en tu lista de amigos");
                                 }                                                                                                                          
                                 break;
                            default:
                                System.out.println("Opción no válida. Intente nuevamente.");
                        }
                        break;
                        
                    case 3:
                        System.out.println("Buscando amigos por " + redSocial.hijoDerecho.nombre + "...");                                    
                        System.out.println("Seleccione una subcategoría:");
                        System.out.println("1. " + mismoPais.nombre);
                        System.out.println("2. " + mismoIdioma.nombre);
                        System.out.println("3. " + mismaProvincia.nombre);  
                        
                        int subOpcion3 = scanner.nextInt();
                        scanner.nextLine();
                        switch(subOpcion3){
                    case 1:
                        mismoPais.mostrarAmigos();
                        System.out.println("¿Desea agregar un amigo? (si/n)");
                         String respuestaFinal1 = scanner.nextLine();
                                  if (respuestaFinal1.equalsIgnoreCase("si")) {
                                  System.out.println("Ingrese el nombre de la persona que deseas agregar:");
                                  String nombreAmigo = scanner.nextLine();
                                  System.out.println("La persona " + nombreAmigo + " fue agregado a tu lista de amigos.");
                                 }                             
                        break;
                    case 2: 
                        mismoIdioma.mostrarAmigos();
                        System.out.println("¿Desea agregar un amigo? (si/n)");
                         String respuestaFinal2 = scanner.nextLine();
                                  if (respuestaFinal2.equalsIgnoreCase("si")) {
                                  System.out.println("Ingrese el nombre de la persona que deseas agregar:");
                                  String nombreAmigo = scanner.nextLine();
                                  System.out.println("La persona " + nombreAmigo + " fue agregado a tu lista de amigos.");
                                 }                             
                        break;
                    case 3:
                        mismaProvincia.mostrarAmigos();
                        System.out.println("¿Desea agregar un amigo? (si/n)");
                         String respuestaFinal3 = scanner.nextLine();
                                  if (respuestaFinal3.equalsIgnoreCase("si")) {
                                  System.out.println("Ingrese el nombre de la persona que deseas agregar:");
                                  String nombreAmigo = scanner.nextLine();
                                  System.out.println("La persona " + nombreAmigo + " fue agregado a tu lista de amigos.");
                                 }                                                                                               
                        break;
                            default:
                                System.out.println("Opción no válida. Intente nuevamente.");
                        }
                        break;

                    case 4:
                        System.out.println("Saliendo del sistema...");
                        salir = true;
                        break;

                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                        break;
                }
            } else if (respuesta.equalsIgnoreCase("no")) {
                System.out.println("Saliendo del sistema...");
                salir = true;
            } else {
                System.out.println("Respuesta no válida. Por favor, ingrese 'si' o 'no'.");
            }
        }
            
       
        scanner.close();
    }
}