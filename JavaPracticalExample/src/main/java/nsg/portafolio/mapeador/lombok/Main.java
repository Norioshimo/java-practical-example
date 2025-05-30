package nsg.portafolio.mapeador.lombok;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciar Lombok");

        TiposProductos tp1 = new TiposProductos(1, "Carpinteria");
        Productos p = new Productos(1, "Martillo", new BigDecimal("100000"), 10.0, tp1);

        System.out.println("Tipo Producto: " + tp1.toString());
        System.out.println("Producto: " + p.toString());

        System.out.println("Finalizar Lombok");
    }
}
