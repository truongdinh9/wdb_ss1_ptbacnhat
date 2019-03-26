import java.util.Scanner;

public class ptbacnhat {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh ax+b=0 ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("a= ");
        double a = scanner.nextDouble();
        System.out.println("b= ");
        double b = scanner.nextDouble();
        if (a != 0) {
            System.out.println("PT co 1 ngiem: x= " + -b / a);
        } else if (b == 0) {
            System.out.println("PT co vo so nghiem");
        } else System.out.println("PT vo nghiem");


    }
}
