import java.io.*;
class person
{
    String name;
    int age;

person()
{
    name="Raja";
    age=24;
}
person(String name,int age)
{
    this.name=name;
    this.age=age;
}
    public static void main(String args[])
    {
        person p=new person();
        System.out.println(p.name+" "+ p.age);
        person p1=new person("Rani" , 25);
        System.out.print(p1.name+" " +p1.age);
    }
}
