package oop.practice4;

/**
 * 이 파일은 문제 제시 및 테스트용 클래스로 절대 수정하지 않습니다.
 * 여러분들은 todo를 따라 문제를 해결하시면 됩니다!
 */
public class 접근제어 {
    public static void main(String[] args) {
        // todo: '접근제어01.java'파일과 같은 폴더에 음식이름(String)과 가격(int)을 갖는 학식 클래스(Haksik.java)를 생성합니다.
        //      학식의 이름과 가격을 마음대로 바꾸지 못하도록 private 접근 제어자를 사용해서 숨겨보세요!
        Haksik 메뉴1 = new Haksik("소금구이덮밥", 5000);
        Haksik 메뉴2 = new Haksik("세종대왕돈가스", 5500);
        Haksik 메뉴3 = new Haksik("순두부찌개", 4500);

        // todo: 가격과 메뉴를 보여주고 싶어요. 콘솔 화면에 출력되도록 각 변수의 값을 가져오는 함수를 만들어보세요!
        System.out.println("음식 : [" + 메뉴1.getMenu() + "] 가격 : [￦" + 메뉴1.getPrice() + "]");
        System.out.println("음식 : [" + 메뉴2.getMenu() + "] 가격 : [￦" + 메뉴2.getPrice() + "]");
        System.out.println("음식 : [" + 메뉴3.getMenu() + "] 가격 : [￦" + 메뉴3.getPrice() + "]");

        // todo: 재료값이 올라가서 가격을 바꿔야 합니다. :( 가격 변수의 값을 main함수에서 바꿔보세요!
        메뉴1.setPrice(5500);
        메뉴2.setPrice(6000);
        메뉴3.setPrice(5300);

        // todo: 가격을 설정할 때 너무 높은 값으로 바꾸려하면 식약청에서 혼내러 온답니다.
        //      학식의 가격을 최소 3000원 ~ 최대 10000원으로 설정하는 함수를 private 접근 제어자를 사용해 작성하고,
        //      setPrice에서 호출하여 검사해보세요! 이 함수가 외부에 노출되면 안됩니다.
        메뉴1.setPrice(99999);
        메뉴2.setPrice(100);
        메뉴3.setPrice(9999);
        System.out.println("음식 : [" + 메뉴1.getMenu() + "] 가격 : [￦" + 메뉴1.getPrice() + "]");
        System.out.println("음식 : [" + 메뉴2.getMenu() + "] 가격 : [￦" + 메뉴2.getPrice() + "]");
        System.out.println("음식 : [" + 메뉴3.getMenu() + "] 가격 : [￦" + 메뉴3.getPrice() + "]");
    }
}
