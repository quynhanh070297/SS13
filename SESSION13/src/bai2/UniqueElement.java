package bai2;

import java.util.HashMap;
import java.util.Map;

public class UniqueElement
{
    public static void main(String[] args)
    {
        // Tim phan tu duy nhat rtong mang
        // Tao mang so nguyen va mot HashMash de hung phan tu
        int[] arrNumber= {1,2,4,6,8,65,4,8,4,67};
        Map<Integer,Integer> hashMap = new HashMap<>();

        for (int number : arrNumber)
        {
            if (hashMap.containsKey(number))
            {
                hashMap.put(number,hashMap.get(number)+1);

            }else {
                hashMap.put(number,1);
            }
        }
        System.out.println(hashMap);
        Map<Integer,Integer> uniquehashMap = new HashMap<>();
        for (Map.Entry<Integer,Integer>entry : hashMap.entrySet())
        {
            if (entry.getValue() ==1 )
            {
                uniquehashMap.put(entry.getKey(), entry.getValue());
            }
            
        }
        System.out.println(uniquehashMap);
    }
}
