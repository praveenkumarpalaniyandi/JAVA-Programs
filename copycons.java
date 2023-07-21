


/*------------------copy constructors----------*/

public class copycons {

    int id;
    String name;

    copycons(int i,String n)
    {
        id=i;
        name=n;
    }
    copycons()
    {
    }
    void display()

    {
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {

        copycons s1=new copycons(111,"manoj");
        copycons s2=new copycons();
        s2.id=s1.id;
        s2.name=s1.name;

        s1.display();
        s2.display();
    }
}
