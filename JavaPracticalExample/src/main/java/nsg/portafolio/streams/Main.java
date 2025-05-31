package nsg.portafolio.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println("Inicio de ejemplos streams");
        List<String> names = Arrays.asList("Norio", "Pedro", "Monica", "Eduarno", "Sandra", "Norio", "Romina");

        System.out.println("===================1- Iterar la lista");
        names.stream().forEach((item) -> {
            System.out.println(item);
        });
//        names.stream().forEach(System.out::println);// Es la forma resumida si hay solo una linea

        System.out.println("===================2- Operador filter");
        names.stream()
                .filter((item) -> item.startsWith("No"))
                .forEach(System.out::println);

        System.out.println("===================3- Operador map. Sirve para modificar el valor");
        names.stream()
                .map((name) -> {
                    return name.toUpperCase();
                })
                .forEach((item) -> {
                    System.out.println(item);
                });
//        names.stream().map(String::toUpperCase).forEach(System.out::println);// Es la forma resumida

        System.out.println("===================4- Operador Sorted. Ordena la lista");
        names.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("===================5- Operador forEach");
        names.stream().forEach((name) -> {
            // realizar operaciones
        });

        System.out.println("===================6- Operador Reduce");
        String result = names.stream().reduce(null, (a, b) -> {
            return a + " | " + b;
        });
        System.out.println("Result: " + result);

        System.out.println("===================7- Operador Collect. Recoge los elementos en uan colección");
        List<String> listaName = names.stream().map((item) -> item.toUpperCase()).collect(Collectors.toList());
//        List<String> listaName = names.stream().map((item) -> item.toUpperCase()).toList();// Apartir de java 17 se usa directo toList en vez de Collectors.toList()

        listaName.forEach(System.out::println);

        System.out.println("===================8- Operador distinct.");
        names.stream().distinct().forEach(System.out::println);

        System.out.println("===================9- Operador limit. Limitar los elimentos");
        System.out.println("Limitar en 3 elementos");
        names.stream().limit(3).forEach(System.out::println);

        System.out.println("===================10- Operador skip. Omite un elmento específico");
        System.out.println("Saltamos 2 elementos");
        names.stream().skip(2).forEach(System.out::println);

        System.out.println("===================11- Operador anyMath. Verifica si algún elemento cumple una condición");
        boolean resultBoolean = names.stream().anyMatch((name) -> {
            return name.startsWith("N");
        });
        System.out.println("Imprimir el resultado: " + resultBoolean);

        System.out.println("===================12- Operador allMatch. Verifica si todos los elementos cumple la condición");
        resultBoolean = names.stream().allMatch((name) -> {
            return name.startsWith("N");
        });
        System.out.println("Imprimir el resultado: " + resultBoolean);

        System.out.println("===================13- Operador noneMach. Verifica si ninguno cumple con la condición");
        resultBoolean = names.stream().noneMatch((name) -> name.length() > 10);
        System.out.println("Imprimir el resultado: " + resultBoolean);

        System.out.println("===================- ");
        System.out.println("===================- ");

        System.out.println("Final de ejemplos streams");
    }
}
