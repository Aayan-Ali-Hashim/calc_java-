import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your desired operator");
        char op = in.next().trim().charAt(0);
        int ans = 0;
        while(true) {
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter the two numbers below");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                if(op == '%') {
                        ans = num1 % num2;
                 }
                }
                System.out.println("Your answer is "+ ans);

            } else if (op == 'X' || op == 'x') {
                break;
            } else {
                System.out.println("invalid input");
                break;
            }
        }
    }
}
