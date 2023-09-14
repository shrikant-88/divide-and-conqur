import java.util.Scanner;

public class power {
    public static int power_a_to_b(int a,int b) {
        int result;
        if(b==0) return 1;
        else if(b==1) return a;
        else result = a*power_a_to_b(a, b-1);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter base : ");
        int a = sc.nextInt();
        System.out.print("enter power : ");
        int b = sc.nextInt();
        int result = power_a_to_b(a, b);
        System.out.println(a+"^"+b+" = "+ result);
    }
}
