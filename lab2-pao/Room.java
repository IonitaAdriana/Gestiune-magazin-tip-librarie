public class Room {
    private String number;
    private int floor;
    private String type;

    public Room(){
        type = "normal";
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String nr) {
        this.number = nr;
    }


    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor1) {
        this.floor = floor1;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}