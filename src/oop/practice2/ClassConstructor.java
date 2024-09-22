package oop.practice2;

/**
 * 이 파일은 문제 제시 및 테스트용 클래스로 절대 수정하지 않습니다.
 * 여러분들은 todo를 따라 문제를 해결하시면 됩니다!
 */
public class ClassConstrutor {
    public static void main(String[] args) {
        // todo: '생성자.java'와 같은 폴더에 Alomy라는 이름을 가진 클래스를 아래 요구사항에 맞게 생성해보세요!
        //      Alomy 클래스는 이름(String)과 학번(String), 나이(int)를 갖는 클래스입니다.

        // todo: 신입생이라서 학번이 없는 사람들이에요~
        //  여러분들이 랜덤하게 학번을 정해주세요!
        //  신입생분들은 모두 나이가 20살입니다!
        Alomy freshAlomy1 = new Alomy("김치볶음");
        Alomy freshAlomy2 = new Alomy("박불고기");
        Alomy freshAlomy3 = new Alomy("이사이다");

        // todo: 복학생들은 이름과 학번, 나이를 모두 기억하고 있어요~
        //  원하는 정보를 다 넘겨줄 수 있어요.
        Alomy returningAlomy1 = new Alomy("최떡볶이","20210156",23);
        Alomy returningAlomy2 = new Alomy("정짬뽕","20190567",24);
        Alomy returningAlomy3 = new Alomy("한라봉","20210478",21);
        Alomy returningAlomy4 = new Alomy("오징어게임","20200389",22);

        // todo: 졸업생들은 학번을 까먹었습니다... :(
        //  이름과 나이만 입력하고 싶다고 하네요... 학번은 빈 값으로 초기화해주세요!
        Alomy graduatedAlomy1 = new Alomy("윤딴콩", 28);
        Alomy graduatedAlomy2 = new Alomy("김모짜", 26);
        Alomy graduatedAlomy3 = new Alomy("배추전", 27);
    }
}
