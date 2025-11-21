
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderPaymentAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderPaymentAddedMessageBuilder builder) {
        OrderPaymentAddedMessage orderPaymentAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderPaymentAddedMessage).isInstanceOf(OrderPaymentAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "paymentRef", OrderPaymentAddedMessage.builder()
                .paymentRef(new com.commercetools.api.models.payment.PaymentReferenceImpl()) } };
    }

    @Test
    public void paymentRef() {
        OrderPaymentAddedMessage value = OrderPaymentAddedMessage.of();
        value.setPaymentRef(new com.commercetools.api.models.payment.PaymentReferenceImpl());
        Assertions.assertThat(value.getPaymentRef())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentReferenceImpl());
    }
}
