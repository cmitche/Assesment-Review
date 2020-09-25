package x;

public class Cars {
    private int wheels;
    private int doors;
    private int seats;

    public Cars(int wheels, int doors, int seats) {
        this.wheels = wheels;
        this.doors = doors;
        this.seats = seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
