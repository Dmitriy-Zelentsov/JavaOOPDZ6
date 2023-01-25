package ex1;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Iterable<UnlockerMethod> unlocks = Arrays.asList(
            new Touch(),
            new Face(),
            new Pin()
        );

        for (UnlockerMethod part : unlocks)
            part.unlock();
    }
}
