import javax.swing.*;

class box1
{
    double width;
    double height;
    double depth;

}
class Boxdemo
{
    public static void main(String[]args)
    {
        box1 myBox=new box1();
        double vol;

        myBox.width=10;
        myBox.height=20;
        myBox.depth=15;

        vol = myBox.width*myBox.height*myBox.depth;
        System.out.println("volume is:"+vol);


    }
}
