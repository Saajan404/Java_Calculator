import java.util.Scanner;

class Calculator2{
	public static void main(String[] args){
	System.out.println("Calculator");
	
	Scanner sc = new Scanner(System.in);
	
	double a, b;
	char operator;

	System.out.println("Enter your First Number");
	a = sc.nextDouble();
	
	System.out.println("Enter Operator");
	operator = sc.next().charAt(0);

	System.out.println("Enter Your Second Number");
	b = sc.nextDouble();

	double add = a+b ;
	double sub = a-b ;
	double multiple = a*b ;
	double div = a/b;
	double modu = a%b;

	switch(operator){
		case '+':
			System.out.println( a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		case '%':
			System.out.println(a%b);
			break;
		}
	
	}
}