import java.util.Scanner;
class Perfectno {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
 System.out.println("enter the number to check whether it is perfect or not ");
    int num=s.nextInt();
    int sum=0;

     for(int i=1;i<=num/2;i++){
       if(num%i==0){
         sum=sum+i;
       }
     }
    
    if(sum==num)
      System.out.println("Number is perfect:");
    else
    {
       System.out.println("Number is not perfect:");
      
    
    }
      
    

}
}

