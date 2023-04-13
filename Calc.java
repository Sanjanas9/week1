import java.util.Scanner;

public class Calc {
  public static void main(String[] args) {

    char operator;
    int number1, number2, result;

    
    Scanner s = new Scanner(System.in);

   
    
    operator = s.next().charAt(0);

    
    System.out.println("Enter first number");
    number1 = s.nextInt();
   
    System.out.println("Enter second number");
    number2 = s.nextInt();
   

    switch (operator) {

    
      case '1':
        result = number1 + number2;
        System.out.println(number1 + " addition " + number2 + " = " + result);
        break;

    
      case '2':
        result = number1 - number2;
        System.out.println(number1 + " substraction " + number2 + " = " + result);
        break;

      
      case '3':
        result = number1 * number2;
        System.out.println(number1 + " multplication " + number2 + " = " + result);
        break;

     
      case '4':
        result = number1 / number2;
        System.out.println(number1 + " division " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

   
  }
}