
import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        float a,b;
        double avg;
        Scanner g=new Scanner(System.in);
        a=g.nextFloat();
        b=g.nextFloat();
        avg=(a+b)/2;
        System.out.printf("%.4f",avg);
    }
}
