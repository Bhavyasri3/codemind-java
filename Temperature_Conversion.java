import java.util.Scanner;
class temp
{
    public static void main(String args[])
    {
        float c;
        float f;
        Scanner t=new Scanner(System.in);
        c=t.nextFloat();
        f= 32+(c*9)/5;
        System.out.printf("%.2f",f);
    }
}