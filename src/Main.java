import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        University university=new University();
        university.setName("OXFORD");
        university.setDate("1076");
        university.setLocation("ENGLAND");
        university.setStudents("22000");
        String[] array=new String[4];
        array[0]= university.getName();
        array[1]=university.getContinent();
        array[2]= university.getLocation();
        array[3]= university.getPlace();
        System.out.println(Arrays.toString(array));
        School school=new School();
        school.setName("National school");
        school.setDate("2019");
        school.setLocation("London");
        school.setStudents("250");
        String[] massive=new String[4];
        massive[0]= school.getName();
        massive[1]=school.getContinent();
        massive[2]= school.getLocation();
        massive[3]= school.getPlace();
        System.out.println(Arrays.toString(massive));
        Car car=new Car();
        car.setName("BMW");
        car.setDate("1900");
        car.setLocation("Germany");
        car.setStudents("300000");
        String[] massivecar=new String[4];
        massivecar[0]= car.getName();
        massivecar[1]=car.getContinent();
        massivecar[2]= car.getLocation();
        massivecar[3]= car.getPlace();
        System.out.println(Arrays.toString(massivecar));
        Person person=new Person();
        person.setName("Bill Gates");
        person.setDate("1955");
        person.setLocation("USA");
        person.setStudents("1120000");
        String[] massive2=new String[4];
        massive2[0]= person.getName();
        massive2[1]=person.getContinent();
        massive2[2]=person.getLocation();
        massive2[3]= person.getPlace();
        System.out.println(Arrays.toString(massive2));
    }
}