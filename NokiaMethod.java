public class NokiaMethod{

	public static void main(String[] args){
	
	menu("Gift", 29 , 5000.00, "yam");
	pratice("Ayomide" , "pink" , "oninyechi");
	call();
	 }
	public static void menu(String name,int age, double amount,String food){
	System.out.println("My name is "+ name + " i am "+ age + " years old "+ " i spent " + amount + " today " + " and i love eating " + food);
	//My name is Gift , I am 29 years old, i spent 5000.00 today, and I love eating yam.

	
	}

	public static void pratice(String name,String color, String namee){
	System.out.println("my name is "+ name + " my best color is " + color + " and the name of my friend is " + namee);
	//my name is Ayomide, my best color is pink, and the name of my friend is oninyechi

	
	}
	public static void call(){
	System.out.println("My name is Gift");
	}
	}