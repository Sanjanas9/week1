import java.util.Scanner;

class Example11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0;

        // System.out.println("Enter Start and Stop values");
        // start=sc.nextInt();
        // stop=sc.nextInt();
        while (number <= 10) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
            number += 1;
        }
    }
}