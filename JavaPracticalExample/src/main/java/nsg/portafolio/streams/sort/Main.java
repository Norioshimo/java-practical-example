package nsg.portafolio.streams.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Inicio de Streams con objecto creados");

        List<Persona> lista = new ArrayList<>();
        
        // <editor-fold defaultstate="collapsed" desc="Iniciar lista de personas">
        lista.add(Persona.builder().id(1).nombre("Norio").build());
        lista.add(Persona.builder().id(2).nombre("Romina").build());
        lista.add(Persona.builder().id(3).nombre("Sandra").build());
        lista.add(Persona.builder().id(4).nombre("Cesar").build());
        lista.add(Persona.builder().id(5).nombre("Juan").build());
        lista.add(Persona.builder().id(6).nombre("Pedro").build());
        lista.add(Persona.builder().id(7).nombre("Enrique").build());
        lista.add(Persona.builder().id(8).nombre("Ana").build());
        // </editor-fold>
        
        System.out.println("Imprimir lista de personas");
        lista.stream().forEach(System.out::println);
        
        System.out.println("============================================================================1- Ordenar la lista usando omparator");
        lista.sort(Comparator.comparing(Persona::getNombre));
        lista.stream().forEach(System.out::println);
        
        
        System.out.println("============================================================================2- Ordenar la lista usando Collections.sort");
        Collections.sort(lista,(c1,c2)->c2.getId().compareTo(c1.getId()));// Ordenar por id y desendiente
        lista.stream().forEach(System.out::println);
        
        
        System.out.println("============================================================================3- Ordenar la lista usando Sort");
        lista.stream()
                .sorted(Comparator.comparing(Persona::getId))
                .forEach(System.out::println);


        System.out.println("============================================================================4- Ordenar la lista usando NaturalOrder");
        List<String> frutas = new ArrayList<>(List.of("Banana", "Manzana", "Kiwi"));

        // Orden alfabético
        frutas.sort(Comparator.naturalOrder());
        System.out.println("Orden alfabetico: "+frutas);

        // Orden inverso
        frutas.sort(Comparator.reverseOrder());

        System.out.println("Orden Iverso: "+frutas);
        

        System.out.println("Final de Streams con objecto creados");
    }
}
