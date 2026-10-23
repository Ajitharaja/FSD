package Day3_Oct21;
import java.util.Scanner;
public class Ploym {


	



	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Puppy p = new Puppy();

	        System.out.print("Enter an integer: ");
	        int a = sc.nextInt();
	        p.sound(a);

	        System.out.print("Enter a decimal number: ");
	        double b = sc.nextDouble();
	        p.sound(b);

	        sc.nextLine();

	        System.out.print("Enter puppy name: ");
	        String name = sc.nextLine();
	        p.sound(name);

	        sc.close();
	    }
	}

	class Animal {
	    void sound(double number) {
	        System.out.println("Animal sound: " + number);
	    }
	}

	class Dog extends Animal {
	    void sound(int number) {
	        System.out.println("Dog sound: " + number);
	    }
	}

	class Puppy extends Dog {
	    void sound(String name) {
	        System.out.println("Puppy name: " + name);
	    }
	

	
}
