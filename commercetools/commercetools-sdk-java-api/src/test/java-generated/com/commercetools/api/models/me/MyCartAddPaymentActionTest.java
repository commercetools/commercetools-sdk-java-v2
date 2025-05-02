
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartAddPaymentActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartAddPaymentActionBuilder builder) {
        MyCartAddPaymentAction myCartAddPaymentAction = builder.buildUnchecked();
        Assertions.assertThat(myCartAddPaymentAction).isInstanceOf(MyCartAddPaymentAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "payment", MyCartAddPaymentAction.builder()
                .payment(new com.commercetools.api.models.payment.PaymentResourceIdentifierImpl()) } };
    }

    @Test
    public void payment() {
        MyCartAddPaymentAction value = MyCartAddPaymentAction.of();
        value.setPayment(new com.commercetools.api.models.payment.PaymentResourceIdentifierImpl());
        Assertions.assertThat(value.getPayment())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentResourceIdentifierImpl());
    }
}
