package ball_uml;
import java.lang.*;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        double x, y, xDisp, yDisp;
        Ball ball1 = new Ball();
        System.out.println("Координаты мяча по дефолту\n" + ball1.toString());
        Ball ball2 = new Ball(2.3, 4.5);
        System.out.println("Координаты мяча до сдвига\n" + ball2.toString());
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сдвиг мяча по x: ");
        xDisp = input.nextDouble();
        System.out.println("Введите сдвиг мяча по y: ");
        yDisp = input.nextDouble();
        ball2.move(xDisp, yDisp);
        System.out.println("Координаты мяча после сдвига\n" + ball2.toString());
        System.out.println("Введите новую координату x:");
        x = input.nextDouble();
        ball2.setX(x);
        System.out.println("Координата x = " + ball2.getX());
        System.out.println("Введите новую координату y:");
        y = input.nextDouble();
        ball2.setY(y);
        System.out.println("Координата y = " + ball2.getY());
        System.out.println("Введите новые координаты x и y:");
        x = input.nextDouble();
        y = input.nextDouble();
        ball2.setXY(x,y);
        System.out.println("Координаты мяча после изменения координат x и y\n" + ball2.toString());
    }
}
