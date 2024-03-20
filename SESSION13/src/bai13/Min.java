package bai13;

import java.util.Map;
import java.util.TreeMap;

public class Min
{
    public static void main(String[] args)
    {
        //Tạo treemap
        int[] array = {8,2,2,12,3,6,9,123,7,63};
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        //Duyet qua mang tu xap xep theo chieu tang dan
        for (int i = 0; i < array.length; i++) {
            treeMap.put(array[i],0);
        }
        System.out.println(treeMap);
        // Tạo đối tượng entry và gán giá trị là firstEntry() của tree map
        Map.Entry<Integer,Integer> firstEntry = treeMap.firstEntry();
        System.out.println(firstEntry);
    }
}
