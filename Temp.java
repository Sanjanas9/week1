import java.util.Scanner;
class Tempconv{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Fahrenheit to celsius(1) or celsius to Fahrenheit(2) ");
      int num = s.nextInt();

    if (num == 1)
    {
      System.out.println("the choice is fahrenheit to celsius");
      System.out.println("enter fahrenheit value");
      double value = s.nextDouble();
      double valueFinal = (value -32)* 5/9;
      System.out.println("celsius is:");
    }
    else if(num == 2)
    {
      System.out.println("the choice is celsius to fahrenheit");
      System.out.println("enter celsius value");
      double value = s.nextDouble();
      double valueFinal = value2 * 1.8 + 32;
      System.out.println("fahrenheit is:");
      
    }
    else 
    {
      System.out.ln("not a valid choice!");
    }
  }
}


