package nsg.portafolio.mapeador.modelmapper;

import java.util.List;

public class Person {

    private Long id;

    private String name;

    private String lastName;

    private String email;

    private byte age;

    private Character gender;

    private List<Direccion> direccionesList;

    public Person() {
    }

    public Person(Long id, String name, String lastName, String email, byte age, Character gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.gender = gender;
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

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public List<Direccion> getDireccionesList() {
        return direccionesList;
    }

    public void setDireccionesList(List<Direccion> direccionesList) {
        this.direccionesList = direccionesList;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", email=" + email + ", age=" + age + ", gender=" + gender + ", direccionesList=" + direccionesList + '}';
    }

}
