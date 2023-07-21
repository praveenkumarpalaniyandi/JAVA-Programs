
class shape
{
   public int calculatearea(int length,int breath)
   {
       return length*breath;
   }
}

class tria extends shape
{
    public int calc(int height,int base)
    {
        return height*base;
    }
}
public class rectangle extends tria {
    public static void main(String[] args) {
        rectangle rect=new rectangle();
       // System.out.println(rect.calculatearea(10,5));
        System.out.println( rect.calc(5,7));
        System.out.println(rect.calculatearea(8,7));




    }
}
