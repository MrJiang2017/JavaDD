package jvm;

import java.util.ArrayList;
import java.util.List;

public class ConstantOOM {
    public static void main(String[] args) {
        try {
            List<String> list = new ArrayList<>();
            int item = 0;
            while (true){
                list.add(String.valueOf(item++).intern());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
