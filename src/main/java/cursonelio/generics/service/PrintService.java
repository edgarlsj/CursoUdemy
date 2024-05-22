package cursonelio.generics.service;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T> {

    private List<T> list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value);
    }

    public T first() {
        if (!list.isEmpty()) {
           return list.get(0);
        } else {
            throw new IllegalStateException("list empty");
        }

    }


    public void print() {
        StringBuilder sb = new StringBuilder();
        for (T i : list) {
            sb.append(i).append(", ");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2); // Remove the last comma and space
        }
        System.out.println("[ " + sb.toString() + " ]");
    }
}


