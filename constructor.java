/*-----------------feb 20 constructor with arguments------------------*/

public class constructor {
    constructor(int i,int j) //this is the constructor with argument
    {
        int a=i;
        int b=j;

        System.out.println("sum is:"+(a+b));
    }

    public static void main(String[] args)
    {
        constructor b=new constructor(9,9);
    }
}
