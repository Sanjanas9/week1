import java.util.Scanner;

class Sumeo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a, odd = 0, even = 0;

        System.out.println("Enter the number");
        a = s.nextInt();

        while (a != 0) {
            a = a / 10;
            if (a % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Number of Even Digits are " + even);
        System.out.println("Number of Odd Digits are " + odd);
    }
}