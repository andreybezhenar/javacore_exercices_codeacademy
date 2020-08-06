//problem: use classes, methods, and objects to create a simple arithmetic calculator. 
//my decision: 

//class:
public class Calculator
{

//constructor:
public Calculator()
{
}

//method add:
public int add(int a, int b)
{
  int result = a + b;
  return result;  
}

//method substract:
public int substract(int a, int b)
{
  int result = a - b;
  return result;  
}

//method multiply:
public int multiply(int a, int b)
{
  int result = a * b;
  return result;  
}

//method divide:
public int divide(int a, int b)
{
  int result = a / b;
  return result;  
}

//method modulo:
public int modulo(int a, int b)
{
  int result = a%b;
  return result;  
}

//method main:
public static void main(String[] args)
{
Calculator myCalculator = new Calculator();
System.out.println(myCalculator.add(5,7));
System.out.println(myCalculator.substract(45,11));
System.out.println(myCalculator.multiply(5,6));
System.out.println(myCalculator.divide(30,6));
System.out.println(myCalculator.modulo(4,3));
}

}
