package dev.homework.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Accumulate {

    private String id;

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public static <T, R> List<R> accumulate(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T item : list) {
            result.add(function.apply(item));
        }
        return result;
    }
}