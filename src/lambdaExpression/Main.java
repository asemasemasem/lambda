package lambdaExpression;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduction:");
		Printable printable = () -> {
			System.out.println("Hi there");
		};
		printThing(printable);
	}
	
	public static void printThing(Printable printable) {
		printable.print();
	}

}
