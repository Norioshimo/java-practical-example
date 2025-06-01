package nsg.portafolio.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import nsg.portafolio.json.gson.Direccion;
import nsg.portafolio.json.gson.Persona;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("Iniciar el ejemplo de JASCKSON");


        Persona p = Persona.builder()
                .id(1)
                .nombre("Norio")
                .listaDireciones(List.of(
                        nsg.portafolio.json.gson.Direccion.builder().id(1).direccion("Direccion 1").build(),
                        Direccion.builder().id(2).direccion("Direccion 2").build()
                ))
                .build();

        ObjectMapper mapper = new ObjectMapper();

        System.out.println("============================================================================Convertir objeto a JSON");

        String json = mapper.writeValueAsString(p);
        System.out.println("JSON: " + json);

        System.out.println("============================================================================Convertir JSON a objeto");
        Persona p2 = mapper.readValue(json, Persona.class);
        System.out.println("Persona: " + p2.getNombre() + ", Edad: " + p2.getEdad());


        System.out.println("============================================================================Convertir Array a un jSON");
        List<Persona> listaPersona = new ArrayList<>();
        listaPersona.add(Persona.builder().id(1).nombre("Norio").listaDireciones(List.of(Direccion.builder().id(1).direccion("Direccion 1").build())).build());
        listaPersona.add(Persona.builder().id(2).nombre("Sandra").build());
        listaPersona.add(Persona.builder().id(3).nombre("Ana").edad(32).build());

        json = mapper.writeValueAsString(listaPersona);
        System.out.println("Json del ARRAY: " + json);


        System.out.println("============================================================================Convertir JSON a un ARRAY");
        listaPersona = mapper.readValue(json, new TypeReference<List<Persona>>() {
        });
        System.out.println("Lista Array.");
        listaPersona.stream().forEach(System.out::println);


        System.out.println("Finalizar el ejemplo de JASCKSON");
    }
}
