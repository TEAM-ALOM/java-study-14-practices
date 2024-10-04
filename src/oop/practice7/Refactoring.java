package oop.practice7;

import oop.practice7.payment.legacy.LegacyKakaoPaymentService;
import oop.practice7.payment.legacy.LegacyTossPaymentService;
import oop.practice7.payment.newest.AbstractPaymentService;
import oop.practice7.payment.newest.PaymentMethod;

import java.math.BigDecimal;

/**
 * 이 문제는 Java의 클래스와 관련된 여러 키워드를 익히기 위해 작성되었습니다.
 * 여러분들은 todo를 따라 문제를 해결하시되, todo에 제시된 대로 main함수에 코드를 추가하셔야 합니다.
 */
public class Refactoring {
    public static void main(String[] args) {
        // todo: 다양한 결제 방식을 지원하는 결제 서비스를 여러 개 만들어야 합니다.
        //      그런데, 이미 누가 코드를 작성해놓았습니다만 객체지향적이지 않아보이네요.
        //      newest 패키지 속에 있는 추상 클래스와 인터페이스를 사용해서
        //      확장성과 유연성을 가진 새로운 결제 서비스로 리팩토링해보세요!

        // 이 부분은 오래된 코드(레거시 코드)입니다.
        // 간단하게 결제 서비스가 어떻게 동작하는구나, 정도로만 보시고,
        //  과제를 하실 때에는 주석 처리를 해주시면 됩니다.
        LegacyKakaoPaymentService legacyKakaoPaymentService = new LegacyKakaoPaymentService();

        legacyKakaoPaymentService.processPayment("credit", new BigDecimal(10000));
        legacyKakaoPaymentService.processPayment("paypal", new BigDecimal(12000));
        legacyKakaoPaymentService.processPayment("bank transfer", new BigDecimal(7600));
        legacyKakaoPaymentService.processPayment("visa", new BigDecimal(3400)); // 비자 카드는 지원하지 않음!

        LegacyTossPaymentService legacyTossPaymentService = new LegacyTossPaymentService();
        legacyTossPaymentService.processPayment("credit", new BigDecimal(50000));
        legacyTossPaymentService.processPayment("paypal", new BigDecimal(12000));
        legacyTossPaymentService.processPayment("visa", new BigDecimal(23000));
        legacyTossPaymentService.processPayment("cultureland", new BigDecimal(10000));
        legacyTossPaymentService.processPayment("bank transfer", new BigDecimal(10000)); // 계좌 이체는 지원하지 않음!

        // todo: 아래의 새로운 결제 서비스가 동작하도록 레거시 코드를 참고해서 구현해주세요.
        //      구현할 클래스는 newest 패키지 안에 보관해주세요!
        PaymentMethod creditCard = new CreditCardPaymentMethod();
        PaymentMethod paypal = new PayPalPaymentMethod();
        PaymentMethod bankTransfer = new BankTransferPaymentMethod();
        PaymentMethod visa = new VisaPaymentMethod();
        PaymentMethod cultureland = new CulturelandPaymentMethod();

        AbstractPaymentService kakaoPaymentService = new KakaoPaymentService();
        kakaoPaymentService.processPayment(creditCard);
        kakaoPaymentService.processPayment(paypal);
        kakaoPaymentService.processPayment(bankTransfer);
        kakaoPaymentService.processPayment(visa); // 비자 카드도 지원합니다!
        kakaoPaymentService.processPayment(cultureland); // 문화상품권도 지원합니다!

        AbstractPaymentService tossPaymentService = new TossPaymentService();
        tossPaymentService.processPayment(creditCard);
        tossPaymentService.processPayment(paypal);
        tossPaymentService.processPayment(bankTransfer); // 계좌 이체도 지원합니다!
        tossPaymentService.processPayment(visa);
        tossPaymentService.processPayment(cultureland);

        // todo: 이번엔 새로운 결제 방식(ex. 기프티콘, 휴대폰 결제 등)을 만들고,
        //      여러분만의 결제 서비스 클래스를 작성하신 다음, 그 결제 서비스에 추가해보세요.
        //      main함수에서 결제 서비스 속 결제 방식을 실행하는 코드도 작성하셔야 합니다!


    }
}
