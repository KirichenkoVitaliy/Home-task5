import java.util.Scanner;

public class Maximum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a>b? a:b;
        System.out.println(a<1 || b<1 || a >= 1000 || b>= 1000? "You fill incorrect values" : c );

    }
}

