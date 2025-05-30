package nsg.portafolio.mapeador.modelmapper;

import java.util.List;

public class PersonDefaultDTO {

    private Long id;

    private String name;

    private String lastName;

    private String email;

    private String estado;

    private List<DireccionDTO> direccionesList;

    public PersonDefaultDTO() {
    }

    public PersonDefaultDTO(Long id, String name, String lastName, String email, String estado) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<DireccionDTO> getDireccionesList() {
        return direccionesList;
    }

    public void setDireccionesList(List<DireccionDTO> direccionesList) {
        this.direccionesList = direccionesList;
    }

    @Override
    public String toString() {
        return "PersonDefaultDTO{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", email=" + email + ", estado=" + estado + ", direccionesList=" + direccionesList + '}';
    }

}
