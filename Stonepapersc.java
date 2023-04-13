import java.util.Scanner;
class Stonepapersc{
  public static void main(final String args[]){
    final Scanner s=new Scanner(System.in);
    char person,computer;
      System.out.println("Enter s:scissor,p:paper,r:rock");
    System.out.println("computer:");
    computer=s.next().charAt(0);
      System.out.println("person:");
    person=s.next().charAt(0);
    if (person== 's' && computer=='r')
    {
    System.out.println("computer winner");
    }
    else if (person=='s' && computer=='p')
    {
    System.out.println("person winner");
    }
    
      else if (person=='p' && computer=='r')
    {
    System.out.println("computer winner");
    }
    else if (person=='p' && computer=='s')
    {
    System.out.println("person winner");
    }

    else if (person=='r' && computer=='s')
    {
    System.out.println("person winner");
    }
    else if (person=='r' && computer=='p')
    {
  System.out.println("person winner");
    }
  else 
  {
    System.out.println("matchtie");
  }

  }
}

    
    
    