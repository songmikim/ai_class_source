package exam01;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) throws Exception{
        Class<Ex01> cls = Ex01.class;

        // Class 클래스 객체가 생성될때 정의된 애노테이션 구현 객체도 생성
        MyAnno myAnno = cls.getAnnotation(MyAnno.class);
        int min = myAnno.min();
        int[] max = myAnno.max();
        System.out.printf("min=%d, max=%s%n", min, Arrays.toString(max));

        // 생성자 위의 애너테이션 정보 가져오기
        Constructor<Ex01> con = cls.getDeclaredConstructor(new Class[] {});
        MyAnno myAnno2 = con.getAnnotation(MyAnno.class);
        int min2 = myAnno2.min();
        int[] max2 = myAnno2.max();
        System.out.printf("min2=%d, max2=%s%n", min2, max2);

        String value = myAnno2.value();
        System.out.printf("min=%d, max=%s, value=%s%n", min2, Arrays.toString(max2), value);

    }
}
