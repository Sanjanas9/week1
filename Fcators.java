import java.util.Scanner;
class Fcators {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
 System.out.println("enter the number ");
    int num=s.nextInt();
  int count=0;
     for(int i=1;i<=num/2;i++){
       if(num%i==0){
        count++;
       }
     }
    
      System.out.println("the factors of number" +count);
    
    
    }
      
    

}

