package exam03;

public class Ex03 {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(100);
        Integer num2 = Integer.valueOf(200);

        int result =  num1 + num2;  // num1.intValue() + num2.intValue(); 자동으로 추가됨.
        System.out.println(result);

    }
}
