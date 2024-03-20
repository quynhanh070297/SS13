package bai7;

import java.util.HashMap;
import java.util.Map;

public class CopyHashMap
{
    public static void main(String[] args)
    {
        //Bai 7 copy HashMap
        // Tao HashMap
        Map<Integer,Integer> map = new HashMap<>();
        // Thêm ptu vào map
        map.put(1, 1);
        map.put(3, 7);
        map.put(5, 9);
        map.put(7, 19);
        map.put(9, 893);
        map.put(10, 80);
        map.put(4, 2);
        map.put(6, 6);
        map.put(22, 8);
        map.put(11, 9);

        System.out.println(map);
        Map<Integer,Integer> copyHashMap = new HashMap<>();
        copyHashMap.putAll(map);
        System.out.println(map);
    }
}
