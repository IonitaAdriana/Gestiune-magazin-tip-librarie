public class Person {
    private String name;
    private String surname;
    private int age;
    private String  id_no;
    private String type;

    public Person(){
        type = "student";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId_no() {
        return id_no;
    }

    public void setId_no(String idNo) {
        this.id_no = idNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

