import java.util.Scanner;

class Operations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a, b;
        System.out.println("Enter Two values");
        a = s.nextInt();
        b = s.nextInt();

        System.out.println("Sum is :" + (a + b));

   
        System.out.println("Substraction is :" + (a - b));

       
        System.out.println("Multiplication is :" + (a * b));

       
        System.out.println("Division is :" + (a / b));
    }
}