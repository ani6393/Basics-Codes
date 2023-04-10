public class Abc2 {
    int a = 10;
    static int b = 20;
    public static void main(String[] args)
    {
        Abc2 ob1 = new Abc2();
        System.out.println(ob1.a);
        System.out.println(ob1.b);
        ob1.a = 1000;
        ob1.b = 2000;
        System.out.println(ob1.a);
        System.out.println(ob1.b);
        Abc2 ob2 = new Abc2();
        System.out.println(ob2.a);
        System.out.println(ob2.b);
    }
}
