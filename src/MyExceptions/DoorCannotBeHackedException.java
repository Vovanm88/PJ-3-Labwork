package MyExceptions;

public class DoorCannotBeHackedException extends RuntimeException {
    public DoorCannotBeHackedException(String message) {
        super(message);
    }
}
