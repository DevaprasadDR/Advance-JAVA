package Inhertiance;

class Persoon
{
    public void show()
    {
        System.out.println("Student inheriting properties from Person");
    }
}
class Studentt extends Persoon
{
    public void show1()
    {
        System.out.println("I am a Student who belongs to Person class");
    }
}
//child class
class EngineeringStudent extends Studentt
{
    // defining additional properties to the child class
    public void show2()
    {
        System.out.println("Engineering Student inheriting properties from Student");
    }
}
public class Multilevel
{
    public static void main(String args[])
    {
        EngineeringStudent obj = new EngineeringStudent();
        obj.show();
        obj.show1();
        obj.show2();
    }
}
