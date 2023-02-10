package Inhertiance;

import java.util.Scanner;

//Base class
class Person
{

    String name = "John";
    int age =17;
    String city = "Delhi";
    public void show()
    {
        System.out.println("Student inheriting properties from Person:\n");
    }
}
//child class
class Student extends Person
{
    // defining additional properties to child class

    int marks = 78;
    String tutorial = "University";

    public static void main(String args[])
    {

        Student obj = new Student();
        obj.show();

        System.out.println("Name of the student is: " + obj.name);
        System.out.println("Age of the student is: " + obj.age);
        System.out.println("Student lives in: " + obj.city);
        System.out.println("Student learns from: " + obj.tutorial);
        System.out.println("Marks obtained by the student is: " + obj.marks);
    }
}
