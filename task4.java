import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("Введите x");
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        System.out.println("Введите y");
        double y = s.nextDouble();
        System.out.println("Введите z");
        double z = s.nextDouble();
        double avg = (x+y+z)/3;
        System.out.println(avg);
        if(Math.floor(avg/2)>3)
            System.out.println("Программа выполнена корректно");
    }
}
