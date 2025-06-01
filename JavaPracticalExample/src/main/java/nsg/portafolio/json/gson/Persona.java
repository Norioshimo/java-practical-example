package nsg.portafolio.json.gson;

import lombok.*;

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
