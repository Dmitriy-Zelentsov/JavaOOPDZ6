package ex2;

import java.util.ArrayList;
import java.util.List;

public class StandartList<L> implements ListInterface {
    private List<L> list;

    public StandartList(List<L> list) {
        this.list = new ArrayList<>(list);
    }

    public List<L> getList() {
        return list;
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public L get(int index) {
        return list.get(index);
    }

}