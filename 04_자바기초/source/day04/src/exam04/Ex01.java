package exam04;

public class Ex01 {
    public static void main(String[] args) {
        SimpleCalculator cal = new SimpleCalculator();
        int result = cal.add(10, 20);
        System.out.println(result);

        //cal.num = 20;
        System.out.println(cal.num);
        System.out.println(Calculator.num);
    }
}
