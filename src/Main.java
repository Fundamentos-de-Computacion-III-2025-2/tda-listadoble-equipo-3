import javax.swing.*;
import java.awt.*;

public class Main {

        /*
        En este metodo va toda la interfaz del usuario
        Las clases NodoDoble y ListaDoble deben tener solo implementación (nada de interfaz o visualización),
        excepto los métodos de mostrarInicioFin y mostrarFinInicio (son los únicos que pueden imprimir en consola
        o devolver un String para después imprimirlo desde aquí o mostrarlo en un JOptionPane aquí en Main.java).
         */

        /*
        Pueden usar JOptionPane o hacer la interfaz por consola.
        Deben definir un menú con las siguientes opciones:
                "1. Insertar un elemento al inicio\n"+
                "2. Insertar un elemento al final\n"+
                "3. Insertar un elemento en orden\n"+
                "4. Eliminar un elemento al inicio\n"+
                "5. Eliminar un elemento al final\n"+
                "6. Eliminar un elemento\n"+
                "7. Buscar un elemento\n"+
                "8. Mostrar los datos de inicio a fin\n"+
                "9. Mostrar los datos de fin a inicio\n"+
                "10. Salir\n","Menú de opciones",3));
        */
        public static void main(String[] args) {


            int opcion = 0;
            int elemento;
            ListaDoble lista = new ListaDoble();

            do {
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "1. Insertar un elemento al inicio\n"+
                                    "2. Insertar un elemento al final\n"+
                                    "3. Insertar un elemento en orden\n"+
                                    "4. Eliminar un elemento al inicio\n"+
                                    "5. Eliminar un elemento al final\n"+
                                    "6. Eliminar un elemento\n"+
                                    "7. Buscar un elemento\n"+
                                    "8. Mostrar los datos de inicio a fin\n"+
                                    "9. Mostrar los datos de fin a inicio\n"+
                                    "10. Salir\n",
                            "Menú de opciones", 3));
                    switch (opcion) {
                        case 1://Insertar un elemento al inicio
                            break;
                        case 2://Insertar un elemento al final
                            break;
                        case 3: //Insertar en orden
                            try {
                                elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Ingresa el elemento: ",
                                        "Insertar en orden: ", 3));
                                lista.insertarEnOrden(elemento);
                            } catch (NumberFormatException n) {
                                JOptionPane.showMessageDialog(null, "Error" + n.getMessage(), "Error de ingreso", 0);
                            }
                            break;
                        case 4: //Eliminar al inicio
                         if (lista.listaVacia()) {
                                System.out.println("\n> La lista está vacía. No se puede eliminar.");
                            } else {
                                int elementoEliminado = lista.eliminarInicio();
                                System.out.println("\n> El nodo inicial ha sido eliminado.");
                                System.out.println("> Elemento eliminado: " + elementoEliminado);
                            }
                            break;
                        case 5: //Eliminar al final
                            if (lista.listaVacia()) {
                                JOptionPane.showInternalMessageDialog(null, "La lista esta vacia", "Error ", 1);
                            } else {
                                elemento = lista.eliminarFinal();
                                JOptionPane.showInternalMessageDialog(null, "Se eliminó al elemento " + elemento, "Eliminar elemento al inicio ", 1);

                            }
                            break;
                        case 6: //Eliminar
                            break;
                        case 7: //Buscar elemento
                            break;
                        case 8: //MostrarLista
                            if (lista.listaVacia()) {
                                System.out.println("\n> La lista está vacía. No se puede eliminar.");
                            } else {
                                lista.mostrarInicioFin();
                            }
                            break;
                        case 9: //MostrarLista
                             if (lista.listaVacia()) {
                                System.out.println("\n> La lista está vacía..");
                            } else {
                                lista.mostrarFinInicio();
                            }
                            break;

                        case 10:
                            JOptionPane.showMessageDialog(null, "Programa Finalizado");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción Incorrecta");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "error" + e.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } while (opcion != 10);
    }
}