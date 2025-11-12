public class ListaDoble {
    protected NodoDoble inicio, fin; //Apuntadores para saber donde esta el inicio y el fin de la lista doble

    //Constructor para crear la lista doble vacía
    public ListaDoble() {
        inicio = null;
        fin = null;
    }


    //Metodo para saber si la lista doble está vacía
    public boolean listaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    //Metodo para agregar un NodoDoble al Inicio de la Lista Doble.
    public void insertarInicio(int dato) {
        NodoDoble nuevoNodo = new NodoDoble(dato);

        //lista vacía
        if (listaVacia()) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        }

        //lista no vacía
        else {
            nuevoNodo.siguiente = inicio;
            inicio.anterior = nuevoNodo;
            inicio = nuevoNodo;
        }
    }

    //Metodo para insertar al Final de la lista doble,ERICK
    public void insertarFinal(int dato) {

    }


    /* Metodo para insertar un elemento suponiendo que la lista está en orden ascendente
    es decir, se debe comenzar a recorrer la lista e insertar el elemento antes del primer
    número mayor al elemento que se encuentre en la lista, si no se encuentar un dato mayor
    se inserta al final */

    //JAVIER
    public void insertarEnOrden(int dato) {

    }


    //Eliminar al inicio VICTORIA
    public int eliminarInicio() {

        return -1;
    }

    //Eliminar al final JAVIER
    public int eliminarFinal() {

        return -1;
    }

    //Eliminar un elemento ERICK
    public int eliminarElemento(int elemento) {

        if (listaVacia()) {
            throw new RuntimeException("La lista está vacía. No se puede eliminar.");
        }

        NodoDoble actual = inicio;
        int elementoEliminado;
        while (actual != null && actual.dato != elemento) {
            actual = actual.siguiente;
        }
        if (actual == null) {
            return -1;
        }

        elementoEliminado = actual.dato;
        if (inicio == fin) {
            inicio = null;
            fin = null;
        }
        else if (actual == inicio) {
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        else if (actual == fin) {
            fin = fin.anterior;
            fin.siguiente = null;
        }
        else {
            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;
        }

        return elementoEliminado;
    }

    //Metodo para buscar un elemento
    public boolean buscarElemento(int elemento) {
        if(listaVacia()){
            return false;
        }

        NodoDoble actual = inicio;

        while(actual != null){
            if(actual.dato == elemento){
                return true;
            }
            actual = actual.siguiente;
        }

        return false;
    }

    //Imprimir los datos de la lista doble de inicio a fin
    public void mostrarInicioFin() {
        NodoDoble actual = inicio;
        System.out.println();
        while (actual != null) {
            System.out.print(actual.dato + " --> ");
            actual = actual.siguiente;
        }
    }

    //Imprimir los datos de la lista doble de fin a inicio VICTORIA
    public void mostrarFinInicio() {

    }


}