
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderPaymentRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderPaymentRemovedMessageBuilder builder) {
        OrderPaymentRemovedMessage orderPaymentRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderPaymentRemovedMessage).isInstanceOf(OrderPaymentRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "paymentRef",
                        OrderPaymentRemovedMessage.builder()
                                .paymentRef(new com.commercetools.api.models.payment.PaymentReferenceImpl()) },
                new Object[] { "removedPaymentInfo", OrderPaymentRemovedMessage.builder().removedPaymentInfo(true) } };
    }

    @Test
    public void paymentRef() {
        OrderPaymentRemovedMessage value = OrderPaymentRemovedMessage.of();
        value.setPaymentRef(new com.commercetools.api.models.payment.PaymentReferenceImpl());
        Assertions.assertThat(value.getPaymentRef())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentReferenceImpl());
    }

    @Test
    public void removedPaymentInfo() {
        OrderPaymentRemovedMessage value = OrderPaymentRemovedMessage.of();
        value.setRemovedPaymentInfo(true);
        Assertions.assertThat(value.getRemovedPaymentInfo()).isEqualTo(true);
    }
}
