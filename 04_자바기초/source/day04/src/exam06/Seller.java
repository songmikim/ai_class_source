package exam06;

public interface Seller {
    void sell();
    
    default void order(){
        System.out.println("Seller - 주문하기");
        privateMethod();
    }

    private void privateMethod(){
        System.out.println("privateMethod()");
    }

    static void staticMethod(){
        System.out.println("정적 메서드");
    }
}
