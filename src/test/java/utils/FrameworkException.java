package utils;

public class FrameworkException extends RuntimeException{

    public FrameworkException(String message){
        super(message, null, true, false);
    }
}
