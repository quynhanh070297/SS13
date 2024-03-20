package bai15;

import java.util.TreeMap;

public class DeleteElement
{
    public static void main(String[] args) {
        //Xoa 1 phan tu ra khoi tree map
        //Tạo tree Map

        int[] array = {8,2,2,12,3,6,9,123,7,63};
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            treeMap.put(array[i],0);
        }
        System.out.println(treeMap);
        treeMap.remove(2);
        System.out.println(treeMap);
    }
}
