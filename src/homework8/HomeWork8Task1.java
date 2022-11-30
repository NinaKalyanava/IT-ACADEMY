package homework8;

public class HomeWork8Task1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setYearOfStudy(2000);
        student.increaseTheYearOfStudy();
        student.increaseTheYearOfStudy();
        System.out.println(student.getYearOfStudy());
    }
}

class Man {
    private String name;
    private int age;
    private String gender;
    private int weight;

    Man() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

class Student extends Man {

    private int yearOfStudy;

    Student() {
        super();
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void increaseTheYearOfStudy() {
        this.yearOfStudy++;
    }
}

