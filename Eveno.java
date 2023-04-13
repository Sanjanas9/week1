import java.util.scanner;   
class Eveno  
{  
   public static void main(String args[])  
   {   
      Scanner s = new Scanner(System.in);   
      System.out.println("Enter a number to check it is even or odd");
     int a=0;
     a = s.nextInt();
     if (a==0)
     {
        System.out.println( " number is zero"+a);
     }
     else if (a%2==0)
     {
        System.out.println( "number is even" +a);
     }
     else
     {
      System.out.println("number is odd" +a);
     }  
   }
}