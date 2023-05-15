import WrongLoginExcptn.WrongLoginException;
import WrongPassExcptn.WrongPassException;

public class Main {
    public static void main(String[] args) {
        try {
            check("hhhh.h", "hjk", "hjk");
        }catch ()
    }
    public static void check(String login, String pass, String pass1) throws WrongLoginException, WrongPassException {
        if ( login.length()>20){
            throw new WrongLoginException;
        }
        if (!pass.equals(pass1)){
            throw new WrongPassException();
        }
    }
}