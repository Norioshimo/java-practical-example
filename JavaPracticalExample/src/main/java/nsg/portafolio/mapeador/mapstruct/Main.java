package nsg.portafolio.mapeador.mapstruct;

/**
 * Documentación de Map Struct https://mapstruct.org/
 *
 * @author Acer
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Inicio de uso Map Struct");
        System.out.println("========================MODEL DEFAULT=============================");

        System.out.println("Inicilizar objeto person con datos.");
        Person person = new Person(1L, "Norio", "Gyotoku", "norio@gmail.com", (byte) 25, 'M');
        System.out.println("Person: " + person.toString());

        System.out.println("Mapear y retornar el DTO");
        PersonDefaultDTO pfDTO = PersonMapper.INSTANCE.personToPersonDefaultDto(person);
        System.out.println("pfDTO: " + pfDTO.toString());

        System.out.println("========================MODEL CUSTOM=============================");

        PersonCustomDTO pcDTO = PersonMapper.INSTANCE.personToPersonCustomDTO(person);
        System.out.println("pcDTO: " + pcDTO.toString());

        System.out.println("Final de uso Map Struct");
    }

}
