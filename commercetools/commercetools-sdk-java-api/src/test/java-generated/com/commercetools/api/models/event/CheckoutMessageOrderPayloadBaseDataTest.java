
package com.commercetools.api.models.event;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CheckoutMessageOrderPayloadBaseDataTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CheckoutMessageOrderPayloadBaseDataBuilder builder) {
        CheckoutMessageOrderPayloadBaseData checkoutMessageOrderPayloadBaseData = builder.buildUnchecked();
        Assertions.assertThat(checkoutMessageOrderPayloadBaseData)
                .isInstanceOf(CheckoutMessageOrderPayloadBaseData.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "projectKey", CheckoutMessageOrderPayloadBaseData.builder().projectKey("projectKey") },
                new Object[] { "cart",
                        CheckoutMessageOrderPayloadBaseData.builder()
                                .cart(new com.commercetools.api.models.cart.CartReferenceImpl()) },
                new Object[] { "payments",
                        CheckoutMessageOrderPayloadBaseData.builder()
                                .payments(Collections.singletonList(
                                    new com.commercetools.api.models.payment.PaymentReferenceImpl())) },
                new Object[] { "errors", CheckoutMessageOrderPayloadBaseData.builder()
                        .errors(
                            Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl())) } };
    }

    @Test
    public void projectKey() {
        CheckoutMessageOrderPayloadBaseData value = CheckoutMessageOrderPayloadBaseData.of();
        value.setProjectKey("projectKey");
        Assertions.assertThat(value.getProjectKey()).isEqualTo("projectKey");
    }

    @Test
    public void cart() {
        CheckoutMessageOrderPayloadBaseData value = CheckoutMessageOrderPayloadBaseData.of();
        value.setCart(new com.commercetools.api.models.cart.CartReferenceImpl());
        Assertions.assertThat(value.getCart()).isEqualTo(new com.commercetools.api.models.cart.CartReferenceImpl());
    }

    @Test
    public void payments() {
        CheckoutMessageOrderPayloadBaseData value = CheckoutMessageOrderPayloadBaseData.of();
        value.setPayments(Collections.singletonList(new com.commercetools.api.models.payment.PaymentReferenceImpl()));
        Assertions.assertThat(value.getPayments())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.payment.PaymentReferenceImpl()));
    }

    @Test
    public void errors() {
        CheckoutMessageOrderPayloadBaseData value = CheckoutMessageOrderPayloadBaseData.of();
        value.setErrors(Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl()));
        Assertions.assertThat(value.getErrors())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl()));
    }
}
