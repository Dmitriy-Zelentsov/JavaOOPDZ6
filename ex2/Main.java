package ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> regularLst = new ArrayList<>();
        regularLst.add("Зеленцов");
        regularLst.add("Дмитрий");
        regularLst.add("Михайлович");
        System.out.println("regularLst " + regularLst);

        // test-------------------------------------------//

        ImmutableList<String> immLst = new ImmutableList<>(regularLst);

        System.out.print("ImmutableList [");
        for (Object s : immLst.getList()) {
            System.out.print(s.toString() + " ");
        }
        System.out.println("]" + "Size = " + immLst.getSize());
        System.out.println(immLst.get(1) + " " + immLst.get(1));

        // test-------------------------------------------//

        MutableList<String> mutLst = new MutableList<>(regularLst);

        System.out.print("MutableList [");
        for (Object s : mutLst.getList()) {
            System.out.print(s.toString() + " ");
        }
        System.out.println("]" + "Size =" + mutLst.getSize());

        mutLst.add("Зеленцов");
        mutLst.remove("1");
        mutLst.set(1, "Дмитрий");
        mutLst.add("2");

        System.out.print("MutableList [");
        for (Object s : mutLst.getList()) {
            System.out.print(s.toString() + " ");
        }
        System.out.println("]" + "Size =" + mutLst.getSize());

    }
}