import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int bonus;
        if (b>1000){
            bonus = (int) b / 100;
        } else {
            bonus = 0;
        }
        System.out.println(a + b + bonus);
        System.out.println(bonus);
    }
}
