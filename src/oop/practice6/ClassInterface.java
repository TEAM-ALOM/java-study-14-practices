package oop.practice6;

class ClassInterface {
    public static void main(String[] args) {
        //Calculator 클래스를 같은 패키지 내에 구현해서 선언해주세요!
        //해당 클래스 내에는 CalculatorMethod를 참조하는 변수 method를 선언해주세요!
        Calculator calculator = new Calculator();

        //CalculatorMethod 인터페이스를 implements 받은 Adder, Subtractor, Divider, Multiplier 클래스를 만들어주세요!

        //calculator 객체의 method 변수를 Adder 클래스로부터 생성된 인스턴스로 설정해 덧셈을 구현해주세요!
        calculator.setMethod(new Adder());
        System.out.println("Adder : " + calculator.run(2, 1));

        //같은 방식으로 뺄셈을 구현해주세요!
        calculator.setMethod(new Subtractor());
        System.out.println("Subtractor : " + calculator.run(6, 2));

        //같은 방식으로 나누기를 구현해주세요!
        calculator.setMethod(new Divider());
        System.out.println("Divider : " + calculator.run(4, 2));

        //같은 방식으로 곱하기를 구현해주세요!
        calculator.setMethod(new Multiplier());
        System.out.println("Multiplier : " + calculator.run(5, 2));

    }
}