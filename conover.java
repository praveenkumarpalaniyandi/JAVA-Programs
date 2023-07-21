/*------------------constructor overloaing------------*/


public class conover {
    int id;
    String name;
    int age;
    conover(int i,String n)
    {
        id=i;
        name=n;
    }
    conover(int i,String n,int a)
    {
        id=i;
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args)
    {
        conover s1=new conover(111,"praveen");
        conover s2=new conover(222,"manoj",18);
        s1.display();
        s2.display();
    }
}
