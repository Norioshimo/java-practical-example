package nsg.portafolio.json.jackson;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Persona {
    private Integer id;
    private String nombre;
    private Integer edad;

    private List<Direccion> listaDireciones;
}
