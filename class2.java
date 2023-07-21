/*--------------20 feb--------------*/

class class3
{
    int id ;
    String name; //instance variable
    void setvalue(int a,String b)
    {
        id=a;
        name=b;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
}

class class4
{
    int id;
    String name;
}
public class class2 {
    public static void main(String[] args) {

        class3 s1=new class3();
        class3 s2=new class3();
        /*class4 s2=new class4();
        class4 s3=new class4();
        s2.id=10;
        s2.name="praveen";
        s3.id=11;
        s3.name="manoj";
        System.out.println(s2.id+" "+s2.name);
        System.out.println(s3.id+" "+s3.name);*/

        s1.setvalue(1,"praveen");
        s2.setvalue(2,"manoj");
        s1.display();
        s2.display();


       /* System.out.println("id is:"+s1.id);
        System.out.println("name is:"+s1.name); //refrence variable*/
    }
}
