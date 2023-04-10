import com.sun.jdi.CharType;
import java.util.Scanner;
class user
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name");
        String name=s.next();
        System.out.println("enter Gender");
        char gender=s.next().charAt(0);
        System.out.println("enter age");
        int age=s.nextInt();
        System.out.println("enter Phone number");
        long phno=s.nextLong();
        System.out.println("--------------------------------------------------------");
        System.out.println("name:"+name);
        System.out.println("gender:"+gender);
        System.out.println("age:"+age);
        System.out.println("phno:"+phno);
    }
}
