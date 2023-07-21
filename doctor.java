import java.util.Scanner;

public class doctor
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.printf("Patient count:");
        int patient=scan.nextInt();
        int income=0;
        int age[]=new int[patient];
        while(patient<20)
        {
            for(int i=0;i<patient;i++) {
                age[i]= scan.nextInt();
            }
            for(int i=0;i<patient;i++)
            {

                if(age[i]>0&&age[i]<17)
                {
                    int fee=200;
                    income+=fee;
                }
                else if(age[i]>=17&&age[i]<40)
                {
                    int fee=400;
                    income+=fee;
                }
                else{
                    int fee=300;
                    income+=fee;
                }
            }
            System.out.println(income);
        }
    }
}
