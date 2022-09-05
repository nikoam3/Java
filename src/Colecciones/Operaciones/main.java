package Colecciones.Operaciones;

import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println("------ArrayList---------");

        List arrayList = new ArrayList();
        arrayList.add("Juan");
        arrayList.add("Mario");
        arrayList.add("Carlos");
        arrayList.add("Marcelo");
        arrayList.add("Marcelo");

        System.out.println("------Recorrer ArrayList---------");
        int i = 0;
        for(i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("------Recorrer ArrayList con Iterator---------");

        Iterator iterador = arrayList.iterator();
        while(iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        System.out.println("------Recorrer ArrayList con ForEach---------");

        for(Object o: arrayList) {
            System.out.println(o);
        }


        System.out.println("-------LinkedList--------");

        List linkedList = new LinkedList();
        linkedList.add("Juan");
        linkedList.add("Mario");
        linkedList.add("Carlos");
        linkedList.add("Marcelo");
        linkedList.add("Marcelo");

        for(Object o :linkedList) {
            System.out.println((String)o);
        }

        System.out.println("---Eliminar elementos List---");
        //elimina por objeto e indice
        arrayList.remove("Juan");
        arrayList.remove(0);
        linkedList.remove("Mario");
        linkedList.remove(1);

        System.out.println("-------HashSet--------");
        //No almacenan los valores repetidos ni nulos
        Set hashset = new HashSet();
        hashset.add("Juan");
        hashset.add("Mario");
        hashset.add("Carlos");
        hashset.add("Marcelo");
        hashset.add("Marcelo");

        for(Object o :hashset) {
            System.out.println((String)o);
        }

        System.out.println("--------LinkedHashSet-------");

        Set linkedhashset = new LinkedHashSet();
        linkedhashset.add("Juan");
        linkedhashset.add("Mario");
        linkedhashset.add("Carlos");
        linkedhashset.add("Marcelo");
        linkedhashset.add("Marcelo");

        for(Object o :linkedhashset) {
            System.out.println((String)o);
        }

        System.out.println("--------TreeSet-------");

        //los inserta ordenadamente.
        Set treeset = new TreeSet();
        treeset.add("Juan");
        treeset.add("Mario");
        treeset.add("Carlos");
        treeset.add("Marcelo");
        treeset.add("Marcelo");

        for(Object o :treeset) {
            System.out.println((String)o);
        }

        System.out.println("---Eliminar elementos Set---");
        //solo elimina por objetos
        hashset.remove("Juan");
        treeset.remove("Mario");
        linkedhashset.remove("Carlos");


        System.out.println("--------HashMap-------");
        //Permiten valores duplicados, pero no keys duplicadas
        Map hashmap = new HashMap();
        hashmap.put(29888999,"Juan");
        hashmap.put(30888999,"Mario");
        hashmap.put(27888999,"Carlos");
        hashmap.put(40888999,"Marcelo");
        hashmap.put(50888999,"Marcelo");

        System.out.println("--------Obtener el nombre del DNI 27888999 -------");
        System.out.println(hashmap.get(27888999));

        System.out.println("--------Recorrido -------");
        for(Object o :hashmap.values()) {
            System.out.println((String)o);
        }

        System.out.println("--------LinkedHashMap-------");

        Map linkedhashmap = new LinkedHashMap();
        linkedhashmap.put(29888999,"Juan");
        linkedhashmap.put(30888999,"Mario");
        linkedhashmap.put(27888999,"Carlos");
        linkedhashmap.put(40888999,"Marcelo");
        linkedhashmap.put(50888999,"Marcelo");

        System.out.println("--------Obtener el nombre del DNI 27888999 -------");
        System.out.println(linkedhashmap.get(27888999));

        System.out.println("--------Recorrido -------");
        for(Object o :linkedhashmap.values()) {
            System.out.println((String)o);
        }


        System.out.println("--------TreeMap-------");
        //los inserta ordenadamente según la key
        Map treemap = new TreeMap();
        treemap.put(29888999,"Juan");
        treemap.put(30888999,"Mario");
        treemap.put(27888999,"Carlos");
        treemap.put(40888999,"Marcelo");
        treemap.put(50888999,"Marcelo");

        System.out.println("--------Obtener el nombre del DNI 27888999 -------");
        System.out.println(treemap.get(27888999));

        System.out.println("--------Recorrido -------");
        for(Object o :treemap.values()) {
            System.out.println((String)o);
        }

        System.out.println("---Eliminar elementos Map---");
        //solo elimina por key
        hashmap.remove(29888999);
        treemap.remove(27888999);
        linkedhashmap.remove(30888999);

    }
}
