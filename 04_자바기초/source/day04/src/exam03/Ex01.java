package exam03;

import java.io.InputStream;

public class Ex01 {
    public static void main(String[] args) {
        //Calculator cal = new Calculator();
        //SimpleCalculator cal = new SimpleCalculator();
        // Calculator cal = new SimpleCalculator();     // 이렇게 써도 됨.
        Calculator cal = new ProCalculator();           // 이렇게 써도 됨.
        int result = cal.add(10, 20);
        System.out.println(result);

        System.out.println(cal.num); // 객체의 변수로 생성
        cal.commonMethod();

    }
}
