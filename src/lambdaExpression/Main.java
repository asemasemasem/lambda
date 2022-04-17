package lambdaExpression;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable printable = () -> {
			System.out.println("Hi there");
		};
		printThing(printable);
	}
	
	public static void printThing(Printable printable) {
		printable.print();
	}

}
