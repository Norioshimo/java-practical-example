package nsg.portafolio.mapeador.modelmapper;

public class DireccionDTO {

    private Integer id;
    private String nombre;

    public DireccionDTO() {
    }

    public DireccionDTO(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Direccion{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    

}
