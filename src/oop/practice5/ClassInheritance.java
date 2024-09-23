package oop.practice5;

public class ClassInheritance {
    public static void main(String[] args) {

        // 나이, 학생 Id, 이름을 입력받는 SejongMember 클래스를 생성하고, 생성자를 통해 객체 3개를 만들어주세요!
        SejongMember s1 = new SejongMember(22, 23010101, "A");
        SejongMember s2 = new SejongMember(24, 21010101, "B");
        SejongMember s3 = new SejongMember(20, 24010101, "C");

        //SejongMember 클래스를 상속 받은 SejongCyberMember 클래스를 생성해주세요!
        //기존에 만들었던 세개의 객체를 바탕으로 정보를 입력받고 거기에 학년을 추가로 받아서 새로운 객체 3개를 만들어주세요!
        SejongCyberMember s4 = new SejongCyberMember(s1.getAge(), s1.getId(), s1.getName(), 2);
        SejongCyberMember s5 = new SejongCyberMember(s2.getAge(), s2.getId(), s2.getName(), 1);
        SejongCyberMember s6 = new SejongCyberMember(s3.getAge(), s3.getId(), s3.getName(), 4);

        //나이, Id, 이름, 학년을 한 줄에 출력하는 메소드를 만들어주세요!
        s4.printInfo();
        s5.printInfo();
        s6.printInfo();
    }
}