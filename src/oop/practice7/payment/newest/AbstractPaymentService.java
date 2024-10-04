package oop.practice7.payment.newest;

/**
 * 모든 결제 서비스는 이 abstract 클래스를 상속받아 구현되어야 합니다.
 */
public abstract class AbstractPaymentService {
    /**
     * 결제 방식을 인자로 전달받아 결제를 실행하는 함수입니다.
     * 레거시 코드에서 본 것처럼 적절한 메세지를 콘솔창에 출력해야합니다.
     * final 키워드이므로, @Override가 불가능합니다. 이 곳에서 공통 로직을 작성해주세요!
     *
     * @param paymentMethod PaymentMethod를 구현한 클래스의 인스턴스
     */
    public final void processPayment(PaymentMethod paymentMethod) { }

    /**
     * 결제 결과에 대해 간단하게 콘솔창에 출력하는 함수입니다.
     * 레거시 코드를 참고해서 어떻게 출력했는지 살펴보고 자유롭게 구현해주시면 됩니다.
     * 이 곳에서 공통 로직을 작성하셔도 좋습니다!
     */
    protected void logProcessingPayment(String paymentResult) { }

    /**
     * 결제 서비스의 이름을 반환하는 함수입니다.
     *
     * @return 결제 서비스 이름
     */
    protected abstract String getPaymentServiceName();
}
