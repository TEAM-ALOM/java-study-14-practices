package oop.practice7.payment.legacy;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 토스 결제 서비스는 신용카드, 페이팔, 비자, 문화상품권을 지원합니다.
 * 안타깝게도 if-else를 사용하기 때문에 다른 결제 방식은 지원하지 않는다고 하네요...
 */
public class LegacyTossPaymentService {
    public void processPayment(String paymentName, BigDecimal amount) {
        if (paymentName.equals("credit")) {
            log("신용카드로 결제합니다.", amount);
        } else if (paymentName.equals("paypal")) {
            log("페이팔로 결제합니다.", amount);
        } else if (paymentName.equals("visa")) {
            log("비자카드로 결제합니다.", amount);
        } else if (paymentName.equals("cultureland")) {
            log("문화상품권으로 결제합니다.", amount);
        } else {
            log("지원하지 않는 결제 방식입니다.");
        }
    }

    private void log(String paymentResult, BigDecimal amount) {
        String currentTime = getCurrentTime();
        System.out.printf("[%s][TossPayment]\t%-20s\t결제 금액 : %s\n", currentTime, paymentResult, amount);
    }

    private void log(String paymentResult) {
        String currentTime = getCurrentTime();
        System.out.printf("[%s][TossPayment]\t%-20s\n", currentTime, paymentResult);
    }

    private String getCurrentTime() {
        return LocalDateTime.now().toString();
    }
}
