import java.math.BigDecimal;

public class Student {
    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private BigDecimal money;


    public Student(String name, String surname, int age, Gender gender, BigDecimal money) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.money = money;
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

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", money=" + money +
                '}';
    }


}
