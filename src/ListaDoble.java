public class ListaDoble {
    protected NodoDoble inicio, fin; //Apuntadores para saber donde esta el inicio y el fin de la lista doble

    //Constructor para crear la lista doble vacía
    public ListaDoble(){
        inicio = null;
        fin =null;
    }

    //Metodo para saber si la lista doble está vacía
    public boolean listaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }

    //Metodo para agregar un NodoDoble al Inicio de la Lista Doble JOAQUIN
    public void insertarInicio(int dato){


    }

    //Metodo para insertar al Final de la lista doble,ERICK
    public void insertarFinal(int dato){

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

        return -1;
    }

    //Eliminar al final JAVIER
    public int eliminarFinal(){

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
    public int eliminarElemento(int elemento){

        return -1;
    }

    //Metodo para buscar un elemento JOAQUIN
    public boolean buscarElemento(int elemento){

        return false;

    }

    //Imprimir los datos de la lista doble de inicio a fin
    public void mostrarInicioFin(){
        NodoDoble actual=inicio;
        System.out.println();
        while(actual!=null){
            System.out.print(actual.dato+" --> ");
            actual = actual.siguiente;
        }
    }

    //Imprimir los datos de la lista doble de fin a inicio VICTORIA
    public void mostrarFinInicio(){

    }


}