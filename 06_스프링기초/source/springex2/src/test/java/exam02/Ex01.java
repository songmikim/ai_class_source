package exam02;

import org.junit.jupiter.api.Test;
import org.koreait.proxy.Calculator;
import org.koreait.proxy.ImplCalculator;
import org.koreait.proxy.PerformanceCalculator;
import org.koreait.proxy.RecCalculator;

public class Ex01 {
    @Test
    void test1(){
        long stime = System.nanoTime(); // 시작시간
        ImplCalculator cal1 = new ImplCalculator();
        long result1 = cal1.factorial(10L);
        long etime = System.nanoTime(); // 종료 시간
        System.out.printf("걸린시간: %d, 값: %d%n", etime - stime, result1);

        stime = System.nanoTime(); // 시작시간
        RecCalculator cal2 = new RecCalculator();
        long result2 = cal2.factorial(10L);
        etime = System.nanoTime(); // 종료 시간
        System.out.printf("걸린시간: %d, 값: %d%n", etime - stime, result2);

        System.out.printf("cal1:%d, cal2:%d%n", result1, result2);

    }

    @Test
    void test2(){
        Calculator cal1 = new PerformanceCalculator(new ImplCalculator());
        long result1 = cal1.factorial(10L);

        Calculator cal2 = new PerformanceCalculator(new RecCalculator());
        long result2 = cal2.factorial(10L);

        System.out.printf("cal1:%d, cal2: %d%n", result1, result2);
    }
}
