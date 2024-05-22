package cursonelio.trycatch.model.exception;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}
