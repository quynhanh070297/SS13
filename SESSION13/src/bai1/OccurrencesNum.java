package bai1;

import java.util.HashMap;
import java.util.Map;

public class OccurrencesNum
{
    public static void main(String[] args)
    {
      int[] arr = {1,2,7,3,4,56,645,75,7};
      Map<Integer,Integer> map = new HashMap<>();

        // Khai bao mot mang bat ky
        // Duyet map qua tung phan tu
        for (int number : arr)
        {
            if (map.containsKey(number))
            {
                map.put(number,map.get(number)+1);

            }else {
                map.put(number,1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Integer,Integer>entry : map.entrySet())
        {
            System.out.println("Key :" +entry.getKey());
            System.out.println("Value :" + entry.getValue()  );
        }
    }
}
