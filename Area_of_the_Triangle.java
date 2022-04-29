import java.util.Scanner;
class triangle
{
    public static void main(String args[])
    {
        float a,b,c;
        float s;
        double area;
        Scanner r=new Scanner(System.in);
        a=r.nextFloat();
        b=r.nextFloat();
        c=r.nextFloat();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
        
    }
}