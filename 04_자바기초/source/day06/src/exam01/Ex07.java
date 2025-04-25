package exam01;

public class Ex07 {
    public static void main(String[] args) throws UserIdException, UserPwException{
        LoginService service = new LoginService();
        try {
            service.process("user02", "123");
        } catch (UserIdException | UserPwException e) {
            System.out.println(e.getMessage());
        }
    }
}
