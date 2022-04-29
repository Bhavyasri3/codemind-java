import java.util.Scanner;
class circle
{
    public static void main(String args[])
    {
        float r;
        double area;
        Scanner c=new Scanner(System.in);
        r=c.nextFloat();
        area=3.14*r*r;
        System.out.printf("%.2f",area);
        
    }
}