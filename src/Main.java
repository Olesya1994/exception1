import WrongLoginExcptn.WrongLoginException;
import WrongPassExcptn.WrongPassException;

public class Main {
    public static void main(String[] args) {
        try {
            check("hhhh_h", "hjk", "hjk");
            System.out.println("Всё ок");
        } catch (WrongLoginException e) {
            System.out.println("Неправильный логин");
        } catch (WrongPassException e) {
            System.out.println("Неправильный пароль");
        }
    }
    public static void check(String login, String pass, String pass1) throws WrongLoginException, WrongPassException {

        if (login.length() > 20 || !login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException();
        }
        if (!pass.equals(pass1)|| !pass.matches("[a-zA-Z0-9_]+")|| !pass1.matches("[a-zA-Z0-9_]+") ) {
            throw new WrongPassException();
        }
    }
}