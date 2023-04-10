import java.util.Scanner;
class calculator2 {
    public static void main(String[] args) {
        String yn;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter First Number");
            int no1 = s.nextInt();
            System.out.println("enter Second Number");
            int no2 = s.nextInt();
            System.out.println("Select symbol(+,-,*,/,%)");
            String sym = s.next();
            int res;
            switch (sym) {
                case "+":
                    res = no1 + no2;
                    System.out.println("Addition:" + res);
                    break;
                case "-":
                    res = no1 - no2;
                    System.out.println("Subtraction is:" + res);
                    break;
                case "*":
                    res = no1 * no2;
                    System.out.println("Multiplication:" + res);
                    break;
                case "/":
                    res = no1 / no2;
                    System.out.println("Division:" + res);
                    break;
                case "%":
                    res =(no1*no2)/100;
                    System.out.println("Percentage:"+res);
                break;
                    default:
                    System.out.println("Invalid Symbol");
            }
            System.out.println("Do you want to continue(press y for yes and n for no)");
            yn = s.next();
        }
        while (yn.equals("y") || yn.equals("Y"));

    }
}

