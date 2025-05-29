package nsg.portafolio.mapeador.ModelMapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;


/**
 * Documentación de ModelMapper https://modelmapper.org/
 * @author Acer
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Inicio de uso Model Mapper");
        System.out.println("========================MODEL DEFAULT=============================");

        ModelMapper modelMapper = new ModelMapper();

        System.out.println("Inicilizar objeto person con datos.");
        Person person = new Person(1L, "Norio", "Gyotoku", "norio@gmail.com", (byte) 25, 'M');
        System.out.println("Person: " + person.toString());

        System.out.println("Mapear y retornar el DTO");
        PersonDefaultDTO pfDTO = modelMapper.map(person, PersonDefaultDTO.class);
        System.out.println("pfDTO: " + pfDTO.toString());

        System.out.println("========================MODEL CUSTOM=============================");
        TypeMap<Person, PersonCustomDTO> propertyMapper = modelMapper.createTypeMap(Person.class, PersonCustomDTO.class);
        System.out.println("Maper uno por uno....");
        propertyMapper.addMapping(Person::getAge, PersonCustomDTO::setAgeDTO);
        propertyMapper.addMapping(Person::getEmail, PersonCustomDTO::setEmailDTO);
        propertyMapper.addMapping(Person::getGender, PersonCustomDTO::setGenderDTO);
        propertyMapper.addMapping(Person::getLastName, PersonCustomDTO::setLastNameDTO);
        propertyMapper.addMapping(Person::getId, PersonCustomDTO::setIdDTO);
        propertyMapper.addMapping(Person::getName, PersonCustomDTO::setNameDTO);

        System.out.println("Mapear y retornar el DTO");
        PersonCustomDTO pcDto = propertyMapper.map(person);
        
        System.out.println("pcDto: " + pcDto.toString());

        System.out.println("Final de uso Model Mapper");
    }

}
