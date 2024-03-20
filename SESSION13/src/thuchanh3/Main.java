package thuchanh3;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Student student = new Student("Kien", 26, "HH");
        Student Student = new Student("Nam", 20, "HN");
        Student Student2 = new Student("Trung", 19, "HD");
        Student Student3 = new Student("Lan", 30, "HY");

        // So sanh theo tuoi bang Comperator
        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(Student);
        lists.add(Student2);
        lists.add(Student3);
        Collections.sort(lists);
        for (Student st : lists)
        {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi");

        for (Student st : lists)
        {
            System.out.println(st.toString());
        }
    }
}
