package nsg.portafolio.mapeador.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Crear una insterface de persona que se va a mapear
 *
 * @author Acer
 */
@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonDefaultDTO personToPersonDefaultDto(Person person);

    @Mapping(source = "id",target = "idDTO")
    @Mapping(source = "name",target = "nameDTO")
    @Mapping(source = "lastName",target = "lastNameDTO")
    @Mapping(source = "email",target = "emailDTO")
    @Mapping(source = "age",target = "ageDTO")
    PersonCustomDTO personToPersonCustomDTO(Person person);

}
