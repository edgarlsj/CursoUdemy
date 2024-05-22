package cursonelio.exerciciotrycatch.exception;

public class DomainException extends  RuntimeException{

    public DomainException() {
    }

    public DomainException(String message) {
        super(message);
    }
}
