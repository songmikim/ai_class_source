package exam02;

public class Ex01 {
    public static void main(String[] args) {
        try{
            LoginService2 service2 = new LoginService2();
            service2.process("user01","1234");
        } finally {
            System.out.println("실행코드....");
        }
    }
}
