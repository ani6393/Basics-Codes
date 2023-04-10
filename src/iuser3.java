import java.util.Scanner;
class iuser3
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter name");
        String name=s.next();
        System.out.println("enter gender");
        char gender=s.next().charAt(0);
        System.out.println("enter age");
        int age=s.nextInt();
        System.out.println("enter phone no");
        long phno=s.nextLong();
        System.out.println("enter address");
        String Address=s.next();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("name:"+name);
        System.out.println("gender:"+gender);
        System.out.println("age:"+age);
        System.out.println("phone number:"+phno);
        System.out.println("address:"+Address);
    }
}