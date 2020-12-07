package Classes;

public class OutOfBankException extends RuntimeException {

    OutOfBankException(){};
    OutOfBankException(String msg) {
        super(msg);
    }
}
