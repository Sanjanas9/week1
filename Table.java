import java.util.Scanner;
class Table {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
 System.out.println("enter the number ");
    int num=s.nextInt();
 
     for(int i=1;i<=10;i++)
      System.out.println(num+"*"+i+"="+(num*i));
    
    
    }
}
      