package TEMA_POO;

public class InvalidDatesException extends Exception{
    public InvalidDatesException() {
        super("Datele au fost introduse incorect. Reincercati!");
    }
}