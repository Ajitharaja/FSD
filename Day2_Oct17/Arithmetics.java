
package Day2_Oct17;

import java.util.Scanner;

public class Arithmetics {

    int a, b;

    public static void main(String[] args) {

        Arithmetics obj = new Arithmetics();

        obj.input();
        obj.add();
        obj.subtract();
        obj.multiply();
        obj.divide();
        obj.modulus();
    }

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        sc.close();
    }

    void add() {
        System.out.println("Addition = " + (a + b));
    }

    void subtract() {
        System.out.println("Subtraction = " + (a - b));
    }

    void multiply() {
        System.out.println("Multiplication = " + (a * b));
    }

    void divide() {
        System.out.println("Division = " + (a / b));
    }

    void modulus() {
        System.out.println("Modulus = " + (a % b));
    }
}
