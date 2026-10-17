
package Day2_Oct17;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter deposit amount: ");
        int deposit = sc.nextInt();

        balance += deposit;
        System.out.println("After Deposit: " + balance);

        System.out.print("Enter withdrawal amount: ");
        int withdraw = sc.nextInt();

        balance -= withdraw;
        System.out.println("After Withdrawal: " + balance);

        sc.close();
    }
}
