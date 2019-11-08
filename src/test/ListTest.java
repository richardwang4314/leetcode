package test;

import java.util.*;

/**
 * Created by zihao on 2019/11/8.
 */
public class ListTest {
    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();
        sets.add("aa");
        sets.add("bb");
        sets.add("cc");

        Set<String> sets2 = new HashSet<>();
        sets2.add("bb");
        sets2.add("cc");

        List<String> list=new ArrayList<>();
        list.add("aa");
        list.add("bb");

        Map<String,String> map=new HashMap<>();
        map.put("aa","11");
        map.put("dd","22");

        System.out.println("查看sets是否包含sets2: " + sets.containsAll(sets2));
        System.out.println("查看sets是否包含list: " + sets.containsAll(list));
        System.out.println("查看sets是否包含map: " + sets.containsAll(map.keySet()));
    }
}
