public class ex3 {
    public static void main(String[] args){
        Room r1 = new Room();
        r1.setNumber("12A");
        r1.setFloor(3);
        r1.setType("normal");

        Room r2 = new Room();
        r2.setNumber("12B");
        r2.setFloor(7);
        r2.setType("tech");

        System.out.println(r1.getNumber()+" " +r1.getType()+ " "+r1.getFloor());
        System.out.println(r2.getNumber()+" " +r2.getType()+ " "+r2.getFloor());
    }
}
