package bai14;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ReveserOder
{
    public static void main(String[] args)
    {
        // Khoi tao treemap voi Comparator.reverseOder();
        // Them cac phan tu vao treeMap;
        // In ra cac phan tu cua treeMap
        Map<Integer,Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());
        treeMap.put(1,23);
        treeMap.put(2,24);
        treeMap.put(3,27);
        treeMap.put(4,29);
        treeMap.put(5,1);
        treeMap.put(6,5);
        treeMap.put(7,8);
        treeMap.put(8,10);
        int[] array = {1,2,5,3,6,9,8,7,11,15,19};
        // gán giá trị cho mảng
        for (int i = 0; i < array.length; i++) {
            treeMap.put(array[i],0);
        }
        System.out.println(treeMap);
    }
}
