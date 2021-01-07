import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int result;

        try{
            System.out.println("Enter 2 numbers:");
            a = sc.nextInt();
            b = sc.nextInt();
            result = a + b;
        }
        catch (Exception ex)
        {
            result = -1;
            System.out.println("Error");
        }
        System.out.println(result);

        int c;
        int d;
        int result2;

        try{
            System.out.println("Enter 2 numbers:");
            c = sc.nextInt();
            d = sc.nextInt();
            result2 = c - d;
        }
        catch (Exception ex)
        {
            result2 = -1;
            System.out.println("Error");
        }
        System.out.println(result2);

        int e;
        int f;
        int g;
        int h;
        int result3;

        try{
            System.out.println("Enter 4 numbers:");
            e = sc.nextInt();
            f = sc.nextInt();
            g = sc.nextInt();
            h = sc.nextInt();
            result3 = e + f + g + h;
        }
        catch (Exception ex)
        {
            result3 = -1;
            System.out.println("Error");
        }
        System.out.println(result3);
    }
}
