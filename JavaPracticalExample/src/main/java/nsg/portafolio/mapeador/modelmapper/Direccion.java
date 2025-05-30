package nsg.portafolio.mapeador.modelmapper;

public class Direccion {

    private Integer id;
    private String nombre;
    private String ciudad;

    public Direccion() {
    }

    public Direccion(Integer id, String nombre, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Direccion{" + "id=" + id + ", nombre=" + nombre + ", ciudad=" + ciudad + '}';
    }

}
