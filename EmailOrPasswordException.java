package Talabat;

public class EmailOrPasswordException extends Exception{
    public EmailOrPasswordException(){
        super("The email or password doesn't match");
    }
}
