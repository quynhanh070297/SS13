package thuchanh1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap
{
    public static void main(String[] args)
    {
        //Tao hash Map de luu danh sach SV
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Quynh Anh", 18);
        hashMap.put("Quynh Em", 16);
        hashMap.put("Quynh Trang", 17);
        hashMap.put("Quynh Lan", 19);
        hashMap.put("Quynh Phuong", 20);
        hashMap.put("Quynh Quynh", 1);
        hashMap.put("Quynh Huong", 2);
        System.out.println("Cac phan tu trong Hash Map la");
        System.out.println(hashMap);

        // Tree Map de luu tru doi tuong sinh vien theo thu tu giam dan
        Map <String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

        //Tao doi tuong voi linkedHashMap

        Map<String, Integer> abc = new LinkedHashMap<>(  16, 0.75f,true);
        //Hash table // tu tim hieu them

        abc.put("a", 1);
        abc.put("b", 2);
        abc.put("c", 3);
        abc.put("d", 4);
        abc.put("e", 5);
        abc.put("f", 6);

        System.out.println(abc.get("a"));


    }
}
