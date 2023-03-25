public class Student {
    private String name;
    private int age;

    public Student(){
        System.out.println("看看我执行了吗？");
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getname(){
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public int getAge(){
       return age;
    }
}
class StudentTest {
    public static void main(String[] args) {
        Student s = new Student("zhangshan", 23);

    }
}