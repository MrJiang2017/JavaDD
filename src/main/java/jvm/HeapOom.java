package jvm;

import java.util.ArrayList;
import java.util.List;

public class HeapOom {
    static class OOMObject{}

    public static void main(String[] args) {
        System.out.println("heapOom start/.....");

        List<OOMObject> list = new ArrayList<>();
        int count = 0;
        while (true){
            System.out.println("count======+"+count++);
            list.add(new OOMObject());
        }
    }
}
