
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartRemovePaymentActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartRemovePaymentActionBuilder builder) {
        CartRemovePaymentAction cartRemovePaymentAction = builder.buildUnchecked();
        Assertions.assertThat(cartRemovePaymentAction).isInstanceOf(CartRemovePaymentAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "payment", CartRemovePaymentAction.builder()
                .payment(new com.commercetools.api.models.payment.PaymentResourceIdentifierImpl()) } };
    }

    @Test
    public void payment() {
        CartRemovePaymentAction value = CartRemovePaymentAction.of();
        value.setPayment(new com.commercetools.api.models.payment.PaymentResourceIdentifierImpl());
        Assertions.assertThat(value.getPayment())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentResourceIdentifierImpl());
    }
}
