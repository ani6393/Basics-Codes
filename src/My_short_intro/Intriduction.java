package My_short_intro;

import java.util.Scanner;

public class Intriduction
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("What's your full name ?");
        String name=sc.nextLine();
        System.out.println(name+" ok,Thank you For giving the Answer |");
        System.out.println("What's your Father's Name ?");
        String father= sc.nextLine();
        System.out.println("Mr."+father+ " OK |");
        System.out.println("What's your Mother Name ?");
        String mother= sc.nextLine();
        System.out.println("Mrs."+mother+" OK |");
        System.out.println("What's your Qualification ?");
        String qu=sc.nextLine();
        System.out.println("Your Qualification is good for My Requirement|");
        System.out.println("What's Your Age");
        String age=sc.nextLine();
        System.out.println("your age is "+age+" |");
        System.out.println("what's your Current City ?");
        String city=sc.nextLine();
        System.out.println("This is your City "+city+" |");
    }
}


