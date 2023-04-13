import java.util.Scanner;
public class SimpleInterest
{
    public static void main(String args[]) 
    {
        float principal, rate of interest, t, sinterest;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = s.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = s.nextFloat();
        System.out.print("Time period for Day or Month or Yearly?(Enter No of Days for Daily,30 for month and 12 for yearly) : ");
        t = s.nextFloat();
        s.close();
      if(t==30)
      {
        t=30;
        sinterest = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +sinterest);
      }
      else if(t==12){
        t=30*12;
        sinterest = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +sinterest);
      }
      else{
        sinterest = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +sinterest);
      }
    }
}