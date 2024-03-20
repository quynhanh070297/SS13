package bai11;

import java.util.TreeMap;

public class SapXep
{
    public static void main(String[] args) {
        // Viet chuong trinh sap xep mang theo thu tu tang dan
        int[] array = {8,2,5,12,3,6,23,8,7,10};
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        //Lap de dua vao tree Map va them 0
        for (int i = 0; i < array.length; i++) {
            treeMap.put(array[i],0);
        }
        // In ra tree Map
        System.out.println(treeMap);

    }
}
