package Classes;

public class BankPermissionException extends RuntimeException {

    BankPermissionException(){};
    BankPermissionException(String msg) {
        super(msg);
    }
}
