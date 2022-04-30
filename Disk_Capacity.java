import java.util.Scanner;
class disc
{
    public static void main(String args[])
    {
        int t,s,b,c;
        Scanner sc=new Scanner (System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        c=2*t*s*b*512;
        System.out.println(c);
    }
}