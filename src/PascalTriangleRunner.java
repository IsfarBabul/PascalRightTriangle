import java.util.Scanner;
public class PascalTriangleRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Up to what positive integer power should be printed? ");
        int number = scan.nextInt();
        System.out.print("Enable printing powers of previous rows (t/f): ");
        Boolean printPrevRow = scan.nextBoolean();
    }
}
