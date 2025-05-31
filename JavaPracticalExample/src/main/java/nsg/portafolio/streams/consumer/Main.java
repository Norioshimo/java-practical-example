package nsg.portafolio.streams.consumer;

import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        System.out.println("INICIAR EJEMPLOS DE CONSUMER");

        System.out.println("==================1- Consumer Recibe un valor y no retorna Nada.");
        Consumer<String> consumer = (param) -> {
            System.out.println(param);
        };
//        Consumer<String> consumer = (param) -> System.out.println(param);// Es la forma resumida si hay solo una linea
//        Consumer<String> consumer = System.out::println;// La forma más resumida si hay una linea, un parametro, pero el metodo se usa con ::
        consumer.accept("Soy Consumer");

        System.out.println("==================2- Recibe dos valores y no retorna nada(BiConsumer)");
        BiConsumer<String, String> biConsumer = (param1, param2) -> {
            System.out.println(param1 + " " + param2);
        };
//        BiConsumer<String,String> biConsumer = (param1, param2) -> System.out.println(param1 + " " + param2);// Es la forma resumida si hay solo una linea

        biConsumer.accept("Hola Norio,", "Soy BiConsumer");

        System.out.println("==================3- No recibe ningún valor, pero retorna un resultado(Supplier)");
        Supplier<String> supplier = () -> {
            return "Hola, soy un Supplier";
        };
//        Supplier<String> supplier = () -> "Hola, soy un Supplier";// Es la forma resumida si hay solo una linea
        System.out.println(supplier.get());

        System.out.println("==================4- Recibe un valor y retorna un resultado(Function)");
//        Function<Integer,String>function = (edad)->{
//            return "Mi edad es "+edad+". Function.";
//        };
        Function<Integer, String> function = (edad) -> "Mi edad es " + edad + " Function.";
        System.out.println(function.apply(31));

        System.out.println("==================5- Recibe 2 valores y retorna 1 resultado(BiFunction)");
        BiFunction<Integer, Integer, String> biFunction = (num1, num2) -> {
            return "La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2);
        };
//        BiFunction<Integer, Integer, String> biFunction = (num1, num2) -> "La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2);// Es la forma resumida si hay solo una linea
        System.out.println(biFunction.apply(10, 30));

        System.out.println("==================6- Recibe un valor y devuelve un boolean true o false(Predicate)");
//        Predicate<String> predicate = (str)->{
//            return str.length()>7;
//        };
        Predicate<String> predicate = (str) -> str.length() > 7;// Es la forma resumida si hay solo una linea
        System.out.println("El texto tiene más de 7 caracter: " + predicate.test("Norio"));

        System.out.println("==================7- Recibe 2 valores y retorna un boolean true o false(BiPredicate)");
        BiPredicate<Integer, Integer> biPredicate = (num1, num2) -> {
            return num1 > num2;
        };
//        BiPredicate<Integer, Integer> biPredicate = (num1, num2) -> num1 > num2;// Es la forma resumida si hay solo una linea

        System.out.println("5>10: " + biPredicate.test(5, 10));

        System.out.println("==================8- Recibe dos valores del mismo tipo y retorna un valor de mismo tipo(BinaryOperator)");
        BinaryOperator<Integer> binaryOperator = (num1, num2) -> {
            return num1 + num2;
        };
//        BinaryOperator<Integer> binaryOperator = (num1, num2) -> num1 + num2;// Es la forma resumida si hay solo una linea

        System.out.println(binaryOperator.apply(2, 10));

        System.out.println("==================9- Recibe un valor, lo procesa y devuelve un resultado del mismo tipo(UnaryOperator)");
        UnaryOperator<Integer> unaryOperator = (num) -> {
            return num * num;
        };
//        UnaryOperator<Integer> unaryOperator= (num)->num*num;// Es la forma resumida si hay solo una linea
        System.out.println(unaryOperator.apply(10));

        System.out.println("==================10- No recibe valores y no retorna nada, solo ejecuta una tarea(Runnable)");
        Runnable runnable = () -> {
            System.out.println("Ejectando tarea runnable");
        };
//        Runnable runnable = ()->System.out.println("Ejecutando tarea runnable");// Es la forma resumida si hay solo una linea
        runnable.run();

        System.out.println("==================11- No recibe valores, pero retorna un resultado y puede lanzar una exception(Callable)");
        Callable<String> callable = () -> {
            return "Resultado de la tara";
        };
        try {
            System.out.println(callable.call());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("FINALIZAR EJEMPLOS DE CONSUMER");
    }
}
