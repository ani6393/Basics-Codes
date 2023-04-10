import java.util.Scanner;
public class factRecur
{
    static int fact=1;
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number");
        int no = s.nextInt();
        factRecur ob = new factRecur();
        ob.calcfact(no);
        System.out.println("factorial of " + no + " is " + fact);
    }
            void calcfact ( int no)
            {
      if(no>=1)
      {
          fact=fact*no;
          calcfact(no-1);
            }
    }
}
