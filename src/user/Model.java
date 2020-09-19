package user;

public class Model {
    //Atributos
    int id;
    String username;
    String name;
    String password;

    //Constructor
    public Model(int id, String username, String name, String password) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.password = password;
    }
    //Getter & Setter

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return String.format("Id: %s \nNombre: %s \nUsername: %s", id, name, username);
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
