package MyExceptions;

public class RoomDoesntExistException extends RuntimeException{
    public RoomDoesntExistException(String message) {
        super(message);
    }
}
