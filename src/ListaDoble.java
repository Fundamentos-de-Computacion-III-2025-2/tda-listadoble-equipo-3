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
        
      else {
        nuevoNodo.siguiente = inicio;
        inicio.anterior = nuevoNodo;
        inicio = nuevoNodo;
      }
    }


    public void insertarFinal(int dato){
        NodoDoble elemento = new NodoDoble(dato);

        if (listaVacia()) {
            inicio = elemento;
            fin = elemento;
        } else {
            fin.siguiente = elemento;
            elemento.anterior = fin;
            fin = elemento;
        }

    }


    /* Metodo para insertar un elemento suponiendo que la lista está en orden ascendente
    es decir, se debe comenzar a recorrer la lista e insertar el elemento antes del primer
    número mayor al elemento que se encuentre en la lista, si no se encuentar un dato mayor
    se inserta al final */

    //JAVIERR
    public void insertarEnOrden(int dato){
        NodoDoble nuevo = new NodoDoble(dato);

        //caso 1: lista vacia
        if(inicio==null){
            inicio = fin= nuevo;
            return;
        }
        NodoDoble actual = inicio;

        //buscar el primer nodo mayor a dato o llegar al final
        while(actual != null && actual.dato < dato){
            actual=actual.siguiente;
        }

        //Insertar al inicio(dato menor)
        if(actual==inicio){
            nuevo.siguiente = inicio;
            inicio.anterior = nuevo;
            inicio=nuevo;
        }

        //insertar al final ( dato mayor que todos)
        else if(actual==null){
            fin.siguiente= nuevo;
            nuevo.anterior = fin;
            fin=nuevo;
        }

        //insertar en medio (antes de un dato mayor)
        else{
            nuevo.siguiente= actual;
            nuevo.anterior = actual.anterior;
            actual.anterior.siguiente= nuevo;
            actual.anterior = nuevo;
        }


    }


    //Eliminar al inicio VICTORIA
    public int eliminarInicio(){
        int elemento=inicio.dato;

            if (inicio == fin) {
                inicio=null;
                fin=null;

            }
            else {
                inicio=inicio.siguiente;
                inicio.anterior = null;
            }
        return elemento;

    }


    //Eliminar al final JAVIER
    public int eliminarFinal() {

       int elemento = fin.dato;
        //si solo solo hay un nodo
        if(inicio==fin){
            inicio=fin=null;
        }
        //si hay mas de un nodo
        else{
            fin = fin.anterior;
            fin.siguiente = null;
        }
        return elemento;

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
    public void mostrarFinInicio(){
        if (fin == null) {
            System.out.println("\nLa lista está vacía. No hay nada que mostrar.");
            return;
        }
        NodoDoble actual=fin;
        System.out.println();;
        while (actual!=null){
            System.out.print(actual.dato+" --> ");
            actual=actual.anterior;

        }



    }


}