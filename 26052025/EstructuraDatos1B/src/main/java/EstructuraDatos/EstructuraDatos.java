package EstructuraDatos;

import java.util.*;

public class EstructuraDatos {

    public void demostrarHashSet() {
        Set<String> conjunto = new HashSet<>();

        //Añadir elementos
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana"); // Duplicado - no se añadirá

        System.out.println("Contenido del HashSet: " + conjunto);
        //Verificar existencia
        System.out.println("¿Contiene banana? " + conjunto.contains("Banana"));
        //Eliminar elemento
        conjunto.remove("Naranja");
        System.out.println("Después de eliminar 'Naranja': " + conjunto);
        //Tamaño del conjunto
        System.out.println("Tamaño del conjunto: " + conjunto.size());

    }

    public void demostrarTreeMap() {
        TreeMap<Integer, String> mapa = new TreeMap<>();
        //Añadir pares clave-valor
        mapa.put(3,"Tres");
        mapa.put(1,"Uno");
        mapa.put(4,"Cuatro");
        mapa.put(2,"Dos");

        System.out.println("Treemap ordenado: " + mapa);

        //Obtener primer y ultimo elemento
        System.out.println("Primera entrada: " + mapa.firstEntry());
        System.out.println("Ultima entrada: " + mapa.lastEntry());

        //Buscar por clave
        System.out.println("Valor por clave 2: " + mapa.get(2));

        //Recorrer el mapa
        System.out.println("Recorrido del Treemap");
        for (Map.Entry<Integer, String> entrada : mapa.entrySet()){
            System.out.println("Clave " + entrada.getKey()+", Valor: " + entrada.getValue());
        }
    }

    public void demostrarLinkedList() {
        LinkedList<String> lista = new LinkedList<>();

        //Añadir elementos
        lista.add("Primero");
        lista.add("Segundo");
        lista.addLast("Tercero");
        lista.addFirst("Cero");

        System.out.println("LinkedList: " + lista);

        //Acceder a elementos
        System.out.println("Primer elemento: " + lista.getFirst());
        System.out.println("Ultimo elemento: " + lista.getLast());
        System.out.println("Elemento con indice 2: " + lista.get(2));

        //Eliminar elementos
        lista.removeFirst();
        lista.remove("Segundo");
        System.out.println("Después de eliminar: " + lista);

        //Iterar con for-each
        System.out.println("Iteracion con for-each");
        for (String elemento : lista){
            System.out.println(elemento);
        }
    }
}
