import java.util.*;
import java.lang.*;
import java.io.*;

interface  one
{
    public void print_geek();
}
interface two
{
    public void print_for();
}
interface three extends one ,two
{
    public void print_geek();
}
class child implements three
{
    public void print_geek()
    {
        System.out.println("geeks");
    }
    public void print_for()
    {
        System.out.println("for");
    }
}

public class mar14
{
    public static void main(String[] args)
    {
        child c=new child();
        c.print_geek();
        c.print_for();
        c.print_geek();

    }
}
