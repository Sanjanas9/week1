import java.util.Scanner;
class Grade{
  public static void main(final String args[]){
    final Scanner s=new Scanner(System.in);
    System.out.println("Enter the score");
    int score;
    score = s.nextInt();
    if(score>90)
      System.out.println("grade A");
    else if( score> 70)
    {
     System.out.println("grade b");
    }
       else if (score > 50)
       {
        System.out.println("grade c");
       }
    else 
       {
   System.out.println("fail");
       }
  }
}