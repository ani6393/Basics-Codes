public class iGreater2 {
    public static void main(String[] args) {
        int a = 100, b = 300, c = 200;
        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > a && b > c) {
            System.out.println("b is greater");
        } else if (c > a && c > b) {
            System.out.println("c is greater");
        }
    }
}