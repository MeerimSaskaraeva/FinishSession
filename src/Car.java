import java.time.Year;

public class Car {
    private String name;
    private String number;
    private Year isSuer;

    public Car(String name, String number, Year isSuer) {
        this.name = name;
        this.number = number;
        this.isSuer = isSuer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Year getIsSuer() {
        return isSuer;
    }

    public void setIsSuer(Year isSuer) {
        this.isSuer = isSuer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", isSuer=" + isSuer +
                '}';
    }
}
