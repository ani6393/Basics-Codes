public class swap3
{
    public static void main(String[] args) {
        int a=55,b=65,c=30;
        a= a+b+c;
        b= a-(b+c);
        c= a-(b+c);
        a= a-(b+c);
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
    }
}
