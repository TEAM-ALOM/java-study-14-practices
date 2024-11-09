package oop.practice8.main;
import java.util.Scanner;

public class Shaper {
    public static void main(String[] args) {
        //다음 작성드린 코드를 기반으로 Shapes 패키지의 Circle, Rectangle 클래스를 채우고 가져와서 사용해주세요!
        Scanner scanner = new Scanner(System.in);
        System.out.print("직사각형의 가로의 길이를 입력해주세요: ");
        int width = scanner.nextInt();
        System.out.print("직사각형의 세로의 길이를 입력해주세요: ");
        int height = scanner.nextInt();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("직사각형의 넓이: "+ rectangle.fullSize());
        System.out.print("원의 반지름: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("원의 넓이: " + circle.fullSize());
        scanner.close();
    }
}
