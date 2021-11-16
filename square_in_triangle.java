import java.util.Scanner;

public class square_in_triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        if (1<=t && t<=Math.pow(10, 3)) {
            for (int i = 0; i < t; i++) {
                int b=sc.nextInt();
                if (1<=b && b<=Math.pow(10, 4)) {
                    b=b/2;
                    b=b*(b-1)/2;
                    System.out.println(b);
                }
            }
        }
    }
}
