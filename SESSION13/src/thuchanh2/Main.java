package thuchanh2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        Student1 student1 = new Student1("Nam",20, "Hanoi");
        Student1 student12 = new Student1("Nam",20, "Hanoi");
        Student1 student13 = new Student1("Nam",20, "Hanoi");

        Map<Integer, Student1> studentMap = new HashMap<Integer, Student1>();

        studentMap.put(1,student1);
        studentMap.put(2, student12);
        studentMap.put(3, student13);
        studentMap.put(4,student1);

        for (Map.Entry<Integer, Student1>student : studentMap.entrySet())
        {
            System.out.println(student.toString());
        }
        System.out.println(" .......Set");
        Set<Student1> student1s = new HashSet<Student1>();
        student1s.add(student1);
        student1s.add(student12);
        student1s.add(student13);
        student1s.add(student1);

        for (Student1 student: student1s)
        {
            System.out.println(student.toString());
        }
    }
}
