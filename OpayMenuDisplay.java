import java.util.Scanner;
public class OpayMenuDisplay{
	public static void main(String[] args){
	menu();
	}
	public static void menu(){
	Scanner scan = new Scanner(System.in);

	System.out.print("""
	          OPAY MENU

	    Opay... Beyound Banking

	1. Transfer
	2. Airtime & Data
	3. Betting & Electricity
	4. Total Assets
	5. Add Money
	6. Owealth
	7. Withdraw
	8. Card
	0. Back to main menu
""");
	int transfer = scan.nextInt();
	switch(transfer){
	case 1:
	System.out.print("""
	Transfer
	1. Transfer to opay Account
	2. Transfer to Bank Account
""");
break;
	case 2:
	System.out.print("""
	Select an option
	1. Airtime
	2. Data
	0. Back to main menu
""");
break;
	case 3:
	System.out.print("""
	  Select
	1. Betting
	2. Electricity
	0. Back to main menu
""");
	
	case 0:
	menu();
	break;
}
 }
} 