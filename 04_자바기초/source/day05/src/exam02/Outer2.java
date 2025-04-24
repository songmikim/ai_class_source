package exam02;

public class Outer2 {
    private int num1 = 100;
    private static int num2 = 200;

    public void instanceMethod(){}

    /*
    * 정적 내부 클래스
    * */
    static class Inner{
        public void method() {
            System.out.println("정적 내부 클래스");
            System.out.println(num2);

        }
    }
}
