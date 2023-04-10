public class factorial2 {
    public static void main(String[]args){
        long number=12;
        long fact=1;
        for(int i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of "+number+" is "+fact);
    }
}
