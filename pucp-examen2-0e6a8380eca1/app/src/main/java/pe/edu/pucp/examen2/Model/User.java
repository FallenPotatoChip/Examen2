package pe.edu.pucp.examen2.Model;

public class User {
    private String name;
    private String alias;
    private String location;
    private int id;

    public User(String uname, String ualias, String ulocation){
        name = uname;
        alias = ualias;
        location = ulocation;
    }

    public User(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
