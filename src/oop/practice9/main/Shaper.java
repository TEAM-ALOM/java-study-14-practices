package oop.practice9.main;
import java.util.Scanner;
public class Shaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //문제 8번의 심화 문제로 입력받은 모든 도형들의 정보를 목록 보기를 통해 출력하는 문제입니다 적절히 import를 활용해주세요!
        //이 과정에서 일어날 수 있는 오류에 대해서 InvalidShapeException을 사용해주세요!
        //ArrayList를 활용하여 생성된 객체들을 담아주세요!

        while (true) {
            System.out.print("도형을 선택하세요 (1: 원, 2: 사각형, 3: 삼각형, 4: 목록 보기, 5: 종료): ");
            int choice = scanner.nextInt();
            if (choice == 5) {
                break;
            }
            //try-catch를 이용해 오류를 검출해주세요!
            try {
                switch (choice) {
                    case 1:
                        System.out.print("원 반지름을 입력하세요: ");
                        double radius = scanner.nextDouble();
                        //입력받은 반지름을 바탕으로 객체를 만들어 ArrayList에 넣어주세요!

                        break;
                    case 2:
                        System.out.print("사각형의 가로와 세로를 입력하세요: ");
                        double width = scanner.nextDouble();
                        double height = scanner.nextDouble();
                        //입력받은 밑변과 높이를 바탕으로 객체를 만들어 ArrayList에 넣어주세요!

                        break;
                    case 3:
                        System.out.print("삼각형의 세 변을 입력하세요: ");
                        double side1 = scanner.nextDouble();
                        double side2 = scanner.nextDouble();
                        double side3 = scanner.nextDouble();
                        // 삼각형은 한 변의 길이가 다른 두 변의 길이를 합친 것보다 크거나 같다면 만들 수 없습니다.
                        // 해당 에러를 검출하는 코드를 작성해주세요!

                        //만약 에러를 검출하지 않았다면 객체를 만들어 ArrayList에 넣어주세요!

                        break;
                    case 4:
                        // 목록을 출력하는 코드입니다 만들어진 모든 객체들의 도형명, 넓이, 둘레를 한 줄씩 차례대로 출력하는 코드를 작성해주세요!

                        break;
                    default:
                        System.out.println("잘못된 선택입니다.");
                }
            } catch (Exception e) {
                System.out.println("예외 발생: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
