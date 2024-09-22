package oop.practice3;

/**
 * 이 파일은 문제 제시 및 테스트용 클래스로 절대 수정하지 않습니다.
 * 여러분들은 todo를 따라 문제를 해결하시면 됩니다!
 */
public class ClassKeywords {
    public static void main(String[] args) {
        // todo: 수학에서 등장하는 복소수를 표현할 클래스(ComplexNumber.java)를 작성해보세요!
        //      복소수는 실수(realNumber: int)와 허수(imaginaryNumber: int)로 이루어져 있습니다.
        //      생성자 내부에서는 this 키워드를 사용해 각 멤버 변수를 초기화 해주시고,
        //       멤버 변수는 모두 final 키워드를 사용하여 접근해주세요!
        ComplexNumber real3AndImaginary4 = new ComplexNumber(3, 4);
        ComplexNumber real1AndImaginary7 = new ComplexNumber(1, 7);

        // todo: 복소수의 덧셈만 구현해보겠습니다. 복소수의 덧셈은 다음과 같습니다.
        //      실수는 실수끼리, 허수는 허수끼리 덧셈을 합니다.
        //      덧셈의 결과가 새로운 ComplexNumber 클래스의 인스턴스가 되도록 작성해주세요!
        ComplexNumber real4AndImaginary11 = real3AndImaginary4.plus(real1AndImaginary7);

        // todo: 복소수의 덧셈함수를 사용하기 위해서는 인스턴스를 이용해야 해야하네요? 인스턴스 없이 그냥 할 수는 없을까요?
        //      ComplexNumber 클래스 속에 static을 사용해서 인스턴스로 선언하지 않아도 사용할 수 있는 클래스 함수를 만들어보세요!
        //      이미 구현한 덧셈 함수를 수정하지 마시고 그냥 static 클래스 함수를 새로 만들어주세요~
        ComplextNumber real7AndImaginary15 = ComplexNumber.add(real3AndImaginary4, real4AndImaginary11);

        // 사족: final 키워드가 중요한 이유는 이번 예제처럼 변수 이름들이 전부 명확한 실수값과 허수값으로 표현되어 있을 때
        //       인스턴스 내부의 값이 달라지면 변수 이름과 실제 값이 달라지게 되어 개발할 때 인스턴스의 상태를 신뢰할 수 없게 됩니다.
        //       (내부의 값이 분명히 어떤 값일 것이라고 예상했으나 런타임에서는 그렇지 않은 경우)
        //      그래서 이런 경우에는 값이 변하지 않도록 final 키워드를 사용하는 것이 좋은 방법입니다.
        //      상황에 따라서는 그렇지 않은 경우도 있으니 이 부분은 앞으로 깔끔하고 좋은 코드를 짜는 방법을 공부할 때 활용하면 좋아요!
        //      이 개념을 불변 객체라고 합니다.
    }
}
