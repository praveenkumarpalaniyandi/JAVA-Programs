
class overload
{
    void poly(double f)
    {
        System.out.println("welcome");
    }
    void poly(int i)
    {
        System.out.println("hello");
    }
    void poly(String s)
    {
        System.out.println("java");
    }
    public static void main(String args[])
    {
        overload obj=new overload();
        obj.poly(4.4);
        obj.poly(5);
        obj.poly("abc");
    }

}


