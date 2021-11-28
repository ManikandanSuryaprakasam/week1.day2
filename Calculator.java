package week1.day2;

public class Calculator {
	
	public int add(int num1,int num2){
		return num1+num2;
		
	}
	public double sub(double num1,double num2){
		return num1-num2;
		
	}
	
	public double mul(double num1,double num2){
		return num1*num2;
		
	}
	
		
	public int div(int num1,int num2){
		return num1/num2;
		
	}
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println("Addition:"+calc.add(20, 30));
		System.out.println("Subraction:"+calc.sub(20, 30));
		System.out.println("Multiplication:"+calc.mul(20, 30));
		System.out.println("Division:"+calc.div(300, 30));
		
		
	}
	
}


