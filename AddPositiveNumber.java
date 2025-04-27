import java.util.Scanner;
public class AddPositiveNumber{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int sum = 0;
	int userNumber = 0;
	do{
	System.out.print("Enter a number: ");
	userNumber = scan.nextInt();

	if(userNumber >= 0){
	sum += userNumber;
	}
	
	}
	while(userNumber >= 0);
	System.out.print("the sum is: "+ sum);
	
}
}
