import java.util.Scanner;
public class Values{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);	

	System.out.print("Enter a number: ");
	int userNumber = scan.nextInt();
	
	int sum = 0;
	
	while(sum < userNumber);
	

	  System.out.println("Enter a number: ");
	 int userNumber2 = scan.nextInt();

	sum += userNumber2 ;
	System.out.println("current sum: "+ sum);

	if(sum == userNumber2){
	System.out.println("target reached");
	} else {
	System.out.println("target exceeded");
     }
  }

}