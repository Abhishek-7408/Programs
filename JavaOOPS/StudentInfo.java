class Student {
    String name;
    int age;

    public void printInfo(){
System.out.println(this.name);
System.out.println(this.age);
    }

    Student(){
        System.out.println("constructor called");
    }

}


public class StudentInfo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Aman";
        s1.age = 24;

        s1.printInfo();
    }
}
