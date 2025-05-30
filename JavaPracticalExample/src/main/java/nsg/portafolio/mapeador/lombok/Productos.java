package nsg.portafolio.mapeador.lombok;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Se crea todos getter, setter, tostring, equals etc
@AllArgsConstructor // Crear constructor con todos los parametros en orden los atributos
@NoArgsConstructor // Crear constructor sin parametros.
public class Productos {

    private Integer id;
    private String nombre;
    private BigDecimal precio;
    private Double cantidad;

    private TiposProductos tipoProducto;

}
