package ex1;
public class Pin implements UnlockerMethod {

    @Override
    public void unlock() {
        System.out.println("Разблок паролем выполнен");
    }
    
}
