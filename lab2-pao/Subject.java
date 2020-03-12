public class Subject {
    private Room room;
    private Person teacher;
    private int noOfStudents;

    public Subject(){
        noOfStudents = 100;
    }

    public String getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(String nr) {
        this.noOfStudents = nr;
    }

}
