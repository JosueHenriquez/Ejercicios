package EstructuraDatos;

import java.util.*;

public class EstructuraDatos {
    public static void main(String[] args) {
        EstructuraDatos demo = new EstructuraDatos();

        System.out.println("DEMOSTRACIÓN HASHSET");
        demo.demostrarHashSet();

        System.out.println("\nDEMOSTRACIÓN TREEMAP");
        demo.demostrarTreeMap();

        System.out.println("\nDEMOSTRACIÓN LINKEDLSIT");
        demo.desmotrarLinkedList();
    }

    public void demostrarHashSet(){
        Set<String> conjunto = new HashSet<>();

        //Añadir elementos
        conjunto.add("Carlos Magdiel");
        conjunto.add("Carlos Emilio");
        conjunto.add("Diego Josue");
        conjunto.add("Diego Vladimir");
        conjunto.add("Diego Vladimir"); // Duplicado no se añadirá

        System.out.println("Contenido del HashSet: " + conjunto);

        //Verificar existencia
        System.out.println("¿Contiene a Diego Josue? " + conjunto.contains("Diego Josue"));

        //Tamaño del conjunto
        System.out.println("Tamaño del conjunto antes de eliminar: " + conjunto.size());

        //Eliminar elemento
        conjunto.remove("Diego Vladimir");
        System.out.println("Después de eliminar 'Diego Vladimir': " + conjunto);

        //Tamaño del conjunto
        System.out.println("Tamaño del conjunto: " + conjunto.size());
    }

    public void demostrarTreeMap(){
        TreeMap<Integer, String> mapa = new TreeMap<>();

        //Añadir pares clave-valor
        mapa.put(3,"Tres");
        mapa.put(1,"Uno");
        mapa.put(4,"Cuatro");
        mapa.put(2,"Dos");

        System.out.println("Treemap ordenado: " + mapa);

        //Obtener primer y último elemento
        System.out.println("Primera entrada: " + mapa.firstEntry());
        System.out.println("Última entrada: " + mapa.lastEntry());

        //Buscar por clave
        System.out.println("Valor para clave 2: " + mapa.get(2));

        //Recorrer el mapa
        System.out.println("Recorrido del mapa.");
        for (Map.Entry<Integer,String> entrada : mapa.entrySet()){
            System.out.println("Clave: " + entrada.getKey() + " Valor: " + entrada.getValue());
        }
    }

    public void desmotrarLinkedList(){
        LinkedList<String> lista = new LinkedList<>();

        //Añadir elementos
        lista.add("Primero");
        lista.add("Segundo");
        lista.add("Tercero");
        lista.addFirst("Cero");

        System.out.println("LinkedList: " + lista);

        //Acceder a elementos
        System.out.println("Primer elemento: " + lista.getFirst());
        System.out.println("Ultimo elemento: " + lista.getLast());
        System.out.println("Elemento de indice 2: " + lista.get(2));

        //Eliminar elementos
        lista.removeFirst();
        lista.remove("Segundo");
        System.out.println("Después de eliminar: " + lista);

        //Iterar con for-each
        System.out.println("Iteración con for-each");
        for (String elemento : lista){
            System.out.println(elemento);
        }
    }
}