package ex1;
public class Touch implements UnlockerMethod{

    @Override
    public void unlock() { 
        System.out.println("Разблок пальцем выполнен");
    }

}
