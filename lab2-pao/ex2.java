

public class ex2 {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.setName("John");
        p1.setSurname("Doe");
        p1.setAge(24);
        p1.setId_no("1123444");
        p1.setType("student");

        Person p2 = new Person();
        p2.setName("Jane");
        p2.setSurname("Roe");
        p2.setAge(56);
        p2.setId_no("2233444");
        p2.setType("teacher");

        System.out.println(p1.getName()+ " "+p1.getSurname()+" "+p1.getAge()+" "+p1.getId_no()+" " +p1.getType());
        System.out.println(p2.getName()+ " "+p2.getSurname()+" "+p2.getAge()+" "+p2.getId_no()+" "+p2.getType());
    }
}

