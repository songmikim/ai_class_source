package exam06;

public interface Buyer {
    void buy();

    default void order(){   // 접근제어자 public으로 고정
        System.out.println("Buyer - 주문하기");
    }
}
