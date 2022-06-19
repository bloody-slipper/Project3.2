import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        double payment = sc.nextDouble();
        int bonus;
        if (payment > 1000) {
            bonus = (int) payment / 100;
        } else {
            bonus = 0;
        }
        System.out.println(balance + payment + bonus);
        System.out.println(bonus);
    }
}
