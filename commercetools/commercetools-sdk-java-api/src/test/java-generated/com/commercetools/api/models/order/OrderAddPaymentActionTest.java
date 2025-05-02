
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderAddPaymentActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderAddPaymentActionBuilder builder) {
        OrderAddPaymentAction orderAddPaymentAction = builder.buildUnchecked();
        Assertions.assertThat(orderAddPaymentAction).isInstanceOf(OrderAddPaymentAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "payment", OrderAddPaymentAction.builder()
                .payment(new com.commercetools.api.models.payment.PaymentResourceIdentifierImpl()) } };
    }

    @Test
    public void payment() {
        OrderAddPaymentAction value = OrderAddPaymentAction.of();
        value.setPayment(new com.commercetools.api.models.payment.PaymentResourceIdentifierImpl());
        Assertions.assertThat(value.getPayment())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentResourceIdentifierImpl());
    }
}
