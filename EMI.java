import java.util.Scanner;
class EMI
{
    public static void main(String args[]) 
    {
       Scanner s = new Scanner(System.in);
        Double p,r;
      System.out.print("Enter the Principal : ");
       p = s.nextDouble(); 
       System.out.print("Enter the Rate of interest : " );
       
         r = s.nextDouble();
     
        int n;
       System.out.print("number of month: ");
       n =s.nextInt();
 Double EMI =(p*r*Math.pow(1+r,n))/(Math.pow(1+r,n)-1);                                  
            System.out.print("EMI is: "+EMI);
      }
    }


      

      