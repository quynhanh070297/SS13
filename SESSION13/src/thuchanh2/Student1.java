package thuchanh2;

public class Student1
{
    private String name;
    private int age;
    private String adress;

    public Student1()
    {
    }

    public Student1(String name, int age, String adress)
    {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getAdress()
    {
        return adress;
    }

    public void setAdress(String adress)
    {
        this.adress = adress;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                '}';
    }
}
