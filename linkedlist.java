import java.util.LinkedList;

public class linkedlist
{
    public static void main(String[] args) {
        LinkedList<Integer> demo1=new LinkedList<>();
        LinkedList<Integer> demo2=new LinkedList<>();

        demo1.add(4);
        demo1.add(8);
        demo1.add(15);
        demo1.add(19);
        demo2.add(7);
        demo2.add(9);
        demo2.add(10);
        demo2.add(16);

        System.out.println(demo1);
        System.out.println(demo2);
    }
}
