import java.util.Scanner;
class alph
{
    public static void main(String args[])
    {
        char c;
        Scanner sc=new Scanner(System.in);
        c=sc.next().charAt(0);
        switch(c)
        {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
        
        
    }
}