
/**
 *
 * @author Clayton
 */

public class Person {
    
    protected  String myName;
    protected  int myAge;
    protected  char myGender;

    public Person(String name, int age, char gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    public String getName() {
        return myName;
    }

    public void setName(String name) {
        this.myName = name;
    }

    public int getAge() {
        return myAge;
    }

    public void setAge(int age) {
        this.myAge = age;
    }

    public char getGender() {
        return myGender;
    }

    public void setGender(char gender) {
        this.myGender = gender;
    }

    @Override
    public String toString() {
        return "Name = " + myName +
                "\nAge =" + myAge +
                "\nGender =" + myGender ;
    }

public class Student extends  Person {
    protected int myIdNum;
    protected float myGpa;

    public Student(String name, int age, char gender, int idNum, float gpa) {
        super(name, age, gender);
        this.myIdNum = idNum;
        this.myGpa = gpa;
    }

    public int getIdNum() {
        return myIdNum;
    }

    public void setIdNum(int idNum) {
        myIdNum = idNum;
    }

    public float getGpa() {
        return myGpa;
    }

    public void setGpa(float gpa) {
        myGpa = gpa;
    }

    @Override
    public String toString() {
        return "Student\n"+super.toString() +
                "\nID Number=" + myIdNum +
                "\nGPA =" + myGpa ;
    }
}
public class Teacher extends Person{
    protected String subject;
    protected double salary;

    public Teacher(String name, int age, char gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher\n"+super.toString()+
                "\nSubject = " + subject + '\'' +
                "\nSalary = " + salary;
    }
}
public class CollegeStudent extends Student {

    protected String major;
    protected int year;

    public CollegeStudent(String name, int age, char gender, int idNum, float gpa, String major, int year) {
        super(name, age, gender, idNum, gpa);
        this.major = major;
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nMajor = " + major +
                "\nYear =" + year;
    }
}
public static void main(String[] args){
    Person bob = new Person("Coach Bob", 27, "M");
    System.out.println(bob);
    
    Student lynne = new Student("Lynne Brooke", 16, F, HS95129, 3.5);
    System.out.println(lynne);
    
    
}
}
