import java.util.Scanner;
public class AnimalAndFruit{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);

	

	for(int something1 = 1; something1 <=2; something1++){
	System.out.print("Enter something: ");
	String something = inputScanner.next();

	if(something.equals("dog")){
	System.out.println("Its an animal");
	} 
	else{
	System.out.println("Its a fruit");
	}

  }
}
}