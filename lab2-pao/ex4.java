public class ex4 {
    public static void main(String[] args){
        Subject s1 = new Subject();
        Person p1 = new Person();
        s1.setName("John");
        s1.setSurname("Doe");
        s1.setAge(24);
        s1.setId_no("1123444");
        s1.setType("student");
        s1.setNumber("12A");
        s1.setFloor(3);
        s1.setType("normal");
        s1.setNoOfStudents(10);

        Subject s2 = new Room();
        s2.setNumber("12B");
        s2.setFloor(7);
        s2.setType("tech");

        System.out.println(s1.getNumber()+" " +s1.getType()+ " "+s1.getFloor());
        System.out.println(s2.getNumber()+" " +s2.getType()+ " "+s2.getFloor());
    }
}
