import java.util.Scanner;
class iuser
{
    public static void main(String[] args)
    {
Scanner s=new Scanner(System.in);
        System.out.println("Enter Your Good Name");
        String Name=s.next();
        System.out.println("Enter Your Character");
        char Gender=s.next().charAt(0);
        System.out.println("Enter Your Age");
        int Age=s.nextInt();
        System.out.println("Enter phone number");
        Long Phno =s.nextLong();
        System.out.println("Enter Your Address");
        String Address=s.next();
        System.out.println("========================================================================");
        System.out.println("Name:"+Name);
        System.out.println("Gender:"+Gender);
        System.out.println("Age:"+Age);
        System.out.println("Phno"+Phno);
        System.out.println("Address:"+Address);
    }

}