
package Day4_Oct22;

public class Oops {

    public static void main(String[] args) {

        Bank sbi = new Bank();

        sbi.display();
        Bank.show();
        sbi.assets();

        System.out.println("\nBalance: " + Bank.bal);

        final String name = "Ajeetha";
        System.out.println("Name: " + name);
    }
}

final class Bank {

    static int bal = 50000;

    public void display() {
        System.out.println("Bank display method");
    }

    private final void asset() {
        System.out.println("Gold and property");
    }

    final void assets() {
        System.out.println("Fixed deposit: 1,00,000");
    }

    static void show() {
        System.out.println("Welcome to SBI Bank");
    }
}
