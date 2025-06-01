package nsg.portafolio.json.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciar el ejemplo de json");


        Persona p = Persona.builder()
                .id(1)
                .nombre("Norio")
                .listaDireciones(List.of(
                        Direccion.builder().id(1).direccion("Direccion 1").build(),
                        Direccion.builder().id(2).direccion("Direccion 2").build()
                ))
                .build();

        System.out.println("Person en Objeto: " + p.toString());

        System.out.println("============================================================================Convertir objeto a JSON");
        Gson gson = new Gson();
        String json = gson.toJson(p);
        System.out.println("JSON: " + json);


        System.out.println("============================================================================Convertir JSON a objeto");
        Persona p2 = gson.fromJson(json, Persona.class);
        System.out.println("Persona: " + p2.getNombre() + ", Edad: " + p2.getEdad());


        System.out.println("============================================================================Convertir Array a un jSON");
        List<Persona> listaPersona = new ArrayList<>();
        listaPersona.add(Persona.builder().id(1).nombre("Norio").listaDireciones(List.of(Direccion.builder().id(1).direccion("Direccion 1").build())).build());
        listaPersona.add(Persona.builder().id(2).nombre("Sandra").build());
        listaPersona.add(Persona.builder().id(3).nombre("Ana").edad(32).build());

        json = gson.toJson(listaPersona);
        System.out.println("Json del ARRAY: " + json);

        System.out.println("============================================================================Convertir JSON a un ARRAY");
        listaPersona = gson.fromJson(json, new TypeToken<List<Persona>>() {
        }.getType());

        System.out.println("Lista Array."  );
        listaPersona.stream().forEach(System.out::println);


        /**
         * NOTA!!
         * Los atributos que no coinciden en GSON se ignoran.
         */

        System.out.println("Finalizar el ejemplo de json");
    }
}
