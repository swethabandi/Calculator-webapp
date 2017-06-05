package calculator;


public class BasicCalc
{
	// include variables a, b, c here
	 
	//include getters and setters method to access variables
	
	//include methods for operations
	double a,b,c;
	
		public double getA() {
			
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		
		return b;
	}
	public void setB(double b) {
		
		this.b = b;
	}
	
	
	double Add()
	{
		c=a+b;
		return(c);
	}
	double Subtract()
	{
		c=a-b;
		return(c);
	}
	double Multiply()
	{
		c=a*b;
		return(c);
	}
	double Divide()
	{
		c=a/b;
		return(c);
	}
	
}