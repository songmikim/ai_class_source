package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "이이름", "컴퓨터과학"); // 생성자
        s1.study();

        Student s2 = new Student(1001, "김이름", "컴퓨터과학"); // 생성자
        s2.study();

        System.out.println(s1==s2);
    }
}
