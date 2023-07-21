class super_class
{
    int n=20;
    public void display()
    {
        System.out.println("Super class");
    }
}
public class my_method extends super_class
{
    int n=10;
    public void display()
    {
        System.out.println("Sub class");
    }

    public void sub_class()
    {
        my_method sub=new my_method();
        sub.display();
        super.display();
        System.out.println("Sub class Value:"+sub.n);
        System.out.println("Super class Value:"+super.n);
    }

    public static void main(String[] args) {
        my_method obj=new my_method();
        obj.sub_class();
    }
}
