import java.util.Scanner;

class Sumofno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number,a,sum=0;

     
        while (number !=0) {
            a=number % 10; 
              sum=a+sum;
              number=number/10;
                
                System.out.println("sum of digits" +sum);
            
           
        }
    }
}