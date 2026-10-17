
package Day2_Oct17;

import java.util.Scanner;

public class Logical {

    int a, b;

    public static void main(String[] args) {

        Logical obj = new Logical();

        obj.Input();
        obj.checkResult();
    }

    void Input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (0 or 1): ");
        a = sc.nextInt();

        System.out.print("Enter second number (0 or 1): ");
        b = sc.nextInt();

        sc.close();
    }

    void checkResult() {
        System.out.println("AND: " + (a == 1 && b == 1));
        System.out.println("OR: " + (a == 1 || b == 1));
        System.out.println("NOT first number: " + !(a == 1));
    }
}
