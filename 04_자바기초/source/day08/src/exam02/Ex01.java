package exam02;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<String> items =  new ArrayList<>();
        items.add("이름1");
        items.add("이름2");
        items.add("이름3");
        items.add("이름4");
        items.add("이름5");
/*
        for (String item: items){
            System.out.println(item);
        }
*/

       /* for(int i = 0; i < items.size(); i++){
           // String name = items.get(i);
           // System.out.println(name);
            items.remove(i);
        }*/   // 결과 [이름2, 이름4] << remove가 될때 배열이 새로 생성되기 때문에 전체 삭제가 안됨.

        for(int i = items.size() - 1; i >= 0; i--){
            items.remove(i);
        }

        System.out.println(items);

    }
}

