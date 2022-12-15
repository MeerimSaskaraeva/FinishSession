import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Year;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 5, 4, 5, 6, 45, 34, -90, 56};
//        int count = 0;
//        for (int i : array) {
//            if (i > 0) {
//                count++;
//
//            }
//
//        }
//        System.out.println(count);
//        System.out.println(Arrays.stream(array).filter(value -> value > 0).count());


//
//
//        Car car1 = new Car("BMV", "KG8123ASF", Year.of(2012));
//        Car car2 = new Car(null, "KG8143ASF", Year.of(2020));
//        Car car3 = new Car("LEXUS", "KG8523ASF", Year.of(2019));
//        Car car4 = new Car("KIA", "KG8126ASF", Year.of(2016));
//        List<Car> carList = new ArrayList<>();
//        carList.add(car1);
//        carList.add(car2);
//        carList.add(car3);
//        carList.add(car4);


//            for (Car car : carList) {
//                if (car.getIsSuer().isAfter(Year.of(2018)) && car.getName()!=null && car.getName().trim().equals("")) {
//                    //System.out.println(car.getName() + " " + car.getIsSuer());
//                }
//            }

//        carList.stream().filter(car -> car.getIsSuer().isAfter(Year.of(2010))).
//                map(Car::getName).filter(s -> s!=null &&!s.isEmpty()).
//                forEach(System.out::println);

//        List<Integer>integerList=List.of(1,3,4,5,6,7,8,5,6,9);
//        List<Integer>num1=new ArrayList<>();
//        List<Integer>num2=new ArrayList<>();
//        for (Integer integer : integerList) {
//            if (integer%2==1){
//                num1.add(integer);
//                //num1.forEach(System.out::println);
//
//            }else {
//                num2.add(integer);
//               // num2.forEach(System.out::println);
//
//            }

        //      }
//        System.out.println(num1);
//        System.out.println(num2);
//        List<Integer>integerList1=integerList.stream().filter(integer -> integer%2==0).toList();
//        System.out.println(integerList1);

//        List<String>names=List.of("asel","ulan","meerim","meerim");
//        List<String>stringList=names.stream().map(String::toUpperCase).toList();
//        Set<String> stringList1=names.stream().map(String::toUpperCase).collect(Collectors.toSet());
//        System.out.println(stringList);
//        System.out.println(stringList1);




while (true){
    System.out.println("" +
            "\n1 if name contains 'A' " +
            "\n2 older 15 & money more 2000 " +
            "\n3 max money" +
            "\n4 sort FEMALE & more money" +
            "\n5 get all name" +
            "\n6 get money + 1000" +
            "\n7 find first student" +
            "\n8 get TOTAL student" +
            "\nWRITE NUMBER: ");
    Student student1 = new Student("Meerim", "Saskaraeva", 39, Gender.FEMALE, BigDecimal.valueOf(1000));
    Student student2 = new Student("Asel", "Urakunova", 15, Gender.FEMALE, BigDecimal.valueOf(2000));
    Student student3 = new Student("Ulan", "Saskaraeva", 14, Gender.MALE, BigDecimal.valueOf(40000));
    Student student4 = new Student("Lira", "Kaanatova", 30, Gender.FEMALE,BigDecimal.valueOf(20960));
    Student student5 = new Student("Talant", "Mamytov", 34, Gender.MALE, BigDecimal.valueOf(3999));
    Student student6 = new Student("Talant", "Mamytov", 34, Gender.MALE, BigDecimal.valueOf(3999));


    List<Student> studentList = new ArrayList<>();
    studentList.add(student1);
    studentList.add(student2);
    studentList.add(student3);
    studentList.add(student4);
    studentList.add(student5);
    studentList.add(student6);

    Scanner scanner=new Scanner(System.in);
    int press= scanner.nextInt();
        switch (press) {
            case 1 -> {
                List<Student> studentList1 = studentList.stream().filter(student -> student.getName().contains("A")).toList();
                studentList1.forEach(System.out::println);
            }
            case 2 -> studentList.stream().filter(student -> student.getAge() > 15 && student.
                    getMoney().intValue() > 2000).forEach(System.out::println);
            case 3 -> {
                Student student = studentList.stream().max(Comparator.comparing(Student::getMoney)).orElseThrow();
                System.out.println(student);
            }
            case 4 -> System.out.println(studentList.stream().filter(student -> student.getGender().equals(Gender.FEMALE)).
                    max(Comparator.comparing(Student::getMoney)).orElseThrow());
            case 5 -> System.out.println(studentList.stream().map(Student::getName).toList());
            case 6 -> studentList.stream().map(student -> student.getMoney().add(BigDecimal.valueOf(1000))).forEach(System.out::println);
            case 7 -> System.out.println(studentList.stream().findFirst().map(Student::getName).orElseThrow());
            case 8 -> System.out.println(studentList.stream().map(Student::toString).count());

        }
        }
    }
}