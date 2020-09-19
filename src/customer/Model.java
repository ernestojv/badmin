package customer;

public class Model {
    int id;
    String nit;
    String name;
    String age;
    String gender;

    public Model(int id, String nit, String name, String age, String gender) {
        this.id = id;
        this.nit = nit;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return "NIT: " + nit + "\nNombre:  " + name + "\nEdad: " + age + "\nGenero:" + gender;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
