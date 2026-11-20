package fall.pkg2026;


public class Complex {
	
	private int real;
	private int imaginary;
	
	public Complex(){
		// TODO initialize real and imaginary with a value (e.g., 0)  
                this.real = 0;
                this.imaginary = 0;
	}
	
	public Complex(int x, int y){
		// TODO initialize real and imaginary with the inputs x and y respectively  
                this.real = x;
                this.imaginary = y;
	}
	
	public Complex add (Complex x, Complex y) {
		// TODO add two complex numbers  x and y
                this.real = x.real + y.real;
                this.imaginary= x.imaginary + y.imaginary;
		return this;
	}

	public Complex subtract (Complex x, Complex y) {
		// TODO subtract the complex number y from the complex number x  
                this.real = x.real - y.real;
                this.imaginary= x.imaginary - y.imaginary;
		return this;
	}
	
	public void display () {
		// Display the real and imaginary parts of the given complex number.  
		System.out.println("("+real+","+imaginary+")");
		
	}

	public static void main(String[] args) {
		// TODO 
		// Here is an example of a test program
		Complex num1=new Complex(5, 8);
		Complex num2=new Complex(2, -9);
		System.out.println("The two numbers:");
		num1.display();
		num2.display();
		Complex num3=new Complex();
		Complex num4=new Complex();
			
		System.out.println("The sum:");
		num3.add(num1, num2);
		num3.display();
		
		System.out.println("The difference:");
		num4.subtract(num1, num2);
		num4.display();
		
	}

}

