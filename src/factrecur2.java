import java.util.Scanner;
    class FactRecur2
    {
        public static void main(String[] args)
        {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter any number:");
            int no=s.nextInt();
            int fact;
            FactRecur2 ob=new FactRecur2();
            fact=ob.calcFact(no);
            System.out.println("factorial of " + no + " is " + fact);
        }
        int calcFact(int no)
        {
            if(no>=1)
            {
                return (no*calcFact(no-1));
            }
return 1;
        }
    }
