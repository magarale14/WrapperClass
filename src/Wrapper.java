/* This program is to create wrapper objects, auto boxing and unboxing usage,converting string using valueOf and parseInt
 * Author: Reeta 
 * Date: 8/21/18
 */
public class Wrapper {
	
	public static void main(String[] args) {
		
		//  auto boxing
		int value = 10;
		Integer integerobject1 = Integer.valueOf(value);
		System.out.println(integerobject1);
		
		Integer integerobject2 = value;
		System.out.println(integerobject2); 
		
		
		// unboxing		
		Integer integerobject3 = new Integer(40);
		System.out.println(integerobject3);
		
		int a = integerobject1.intValue();
		int b = integerobject1;
		System.out.println(b);
	
		Double number1 = new Double("21.22"); 
		double number = 21.22;
		System.out.println(number);
		number = number1.valueOf(number);// Converting String to Double using valueOf
  
		
		//Integar number2 = new Integar(50);
		String number11 = "50";
		int number3 = Integer.parseInt(number11); // Converting String to Integer using parseInt
		System.out.println(number3);
	
}	

}
