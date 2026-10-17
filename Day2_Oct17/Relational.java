
package Day2_Oct17;

import java.util.Scanner;

public class Relational {

    int a, b;

    public static void main(String[] args) {

        Relational obj = new Relational();

        obj.Input();
        obj.equalto();
        obj.noteq();
        obj.greaterthan();
        obj.lessthan();
        obj.greaterthanoreq();
        obj.lessthaneq();
    }

    void Input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        sc.close();
    }

    void equalto() {
        System.out.println("A == B: " + (a == b));
    }

    void noteq() {
        System.out.println("A != B: " + (a != b));
    }

    void greaterthan() {
        System.out.println("A > B: " + (a > b));
    }

    void lessthan() {
        System.out.println("A < B: " + (a < b));
    }

    void greaterthanoreq() {
        System.out.println("A >= B: " + (a >= b));
    }

    void lessthaneq() {
        System.out.println("A <= B: " + (a <= b));
    }
}
