import java.util.Scanner;

public class CoinMachiene {

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("This machine will determine a combination of coins.");
	System.out.println("Enter a whole number.");
	int number = scan.nextInt();
	
	int quarters = number / 25;
	int dimes = (number - (quarters*25)) / 10;
	int nickels = (number - ((quarters*25) + (dimes*10))) / 5;
	int pennies = (number - ((quarters*25) + (dimes*10) + (nickels*5)));
	
	System.out.println(quarters + " quarters");
	System.out.println(dimes + " dimes");
	System.out.println(nickels + " nickels");
	System.out.println(pennies + " pennies");	
	}
}
