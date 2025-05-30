package nsg.portafolio.mapeador.lombok;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciar Lombok");

        TiposProductos tp1 = new TiposProductos(1, "Carpinteria");
        Productos p1 = new Productos(1, "Martillo", new BigDecimal("100000"), 10.0, tp1);
        Productos p2 = Productos.builder()
                .id(2)
                .precio(new BigDecimal("2000"))
                .tipoProducto(tp1)
                .build();

        System.out.println("Tipo Producto: " + tp1.toString());
        System.out.println("Producto 1: " + p1.toString());
        System.out.println("Producto 2: " + p2.toString());

        System.out.println("Finalizar Lombok");
    }

    /**
     * NOTA SOBRE TAG DE LOMBOK. Cada tag tiene su propios atributos. Leer la
     * documentación de lombok
     *
     * @Getter. Genera los getter
     * @Setter. Genera los setters
     * @ToString. Genera el toString
     * @EqualsAndHashCode. Genera el Equal y HashCode
     * @Data. Genera los Getter, Setter, ToString y EqualsAndHashCode
     * @AllArgsConstructor. Genera constructor con todos los atributos
     * @NoArgsConstructor. Genera constructor sin atributo.
     * @FieldDefaults. Define tipo de acceso, final de los atributos
     * @Builder. Al definir se puede acceder directo a los atributos. Ejemplo
     * Producto.builder().id(1).build()
     * @Value. Los atributos finales y solo genera el getter. Ideal para clases con atributos finales.
     * @RequiredArgsConstructor. Suele combinar con @Value. Atributo con el @NonNull implica constructor con ese atributo.
     */
}
