package exam02;

import java.util.Optional;

public class Ex01 {
    public static void main(String[] args) {
        String value = "안녕";
        value = null;
        Optional<String> opt = Optional.ofNullable(value);
        //String  value2 = opt.orElse("기본값"); // 값이 null 이면 기본값으로 대체
        //System.out.println(value2);

        String value2 = opt.orElseThrow();  // 값이 null이면

/*        String value2 = opt.orElseGet(() ->{
            // 추가로직
            return "기본값";
        });*/

        /*        if(opt.isPresent()){
        String value2 = opt.get(); // 값이 null 이면 NoSuchElementException 이 발생
        }*/
        System.out.println(value2);
    }
}
