package ex2;

import java.util.List;

public class MutableList<T> extends StandartList {

    public MutableList(List list) {
        super(list);
    }
    
    public void set(int index, T value) {
        getList().set(index, value);        
    }

    public void add(T value) {
        getList().add(value);
    }

    public void remove(T value) {
        getList().remove(value);
    }
}