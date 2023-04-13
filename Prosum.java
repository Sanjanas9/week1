import java.util.Scanner;
class Prosum{
   public static void main(String args[]) {
 
   Scanner s=new Scanner(System.in);
      System.out.println("Enter number");
     int n;
     n=s.nextInt();
 int sum = 0 ;
        int product = 1;
       
        if (n > 0)
        {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
         
        
         n= product-sum;
        }
        System.out.println("sum is:" +n);
    }
}
