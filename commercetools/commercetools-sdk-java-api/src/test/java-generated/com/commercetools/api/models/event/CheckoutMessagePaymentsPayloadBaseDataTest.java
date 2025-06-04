
package com.commercetools.api.models.event;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CheckoutMessagePaymentsPayloadBaseDataTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CheckoutMessagePaymentsPayloadBaseDataBuilder builder) {
        CheckoutMessagePaymentsPayloadBaseData checkoutMessagePaymentsPayloadBaseData = builder.buildUnchecked();
        Assertions.assertThat(checkoutMessagePaymentsPayloadBaseData)
                .isInstanceOf(CheckoutMessagePaymentsPayloadBaseData.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "projectKey",
                        CheckoutMessagePaymentsPayloadBaseData.builder().projectKey("projectKey") },
                new Object[] { "payment",
                        CheckoutMessagePaymentsPayloadBaseData.builder()
                                .payment(new com.commercetools.api.models.payment.PaymentReferenceImpl()) },
                new Object[] { "transactionId",
                        CheckoutMessagePaymentsPayloadBaseData.builder().transactionId("transactionId") },
                new Object[] { "cart",
                        CheckoutMessagePaymentsPayloadBaseData.builder()
                                .cart(new com.commercetools.api.models.cart.CartReferenceImpl()) },
                new Object[] { "order", CheckoutMessagePaymentsPayloadBaseData.builder()
                        .order(new com.commercetools.api.models.order.OrderReferenceImpl()) } };
    }

    @Test
    public void projectKey() {
        CheckoutMessagePaymentsPayloadBaseData value = CheckoutMessagePaymentsPayloadBaseData.of();
        value.setProjectKey("projectKey");
        Assertions.assertThat(value.getProjectKey()).isEqualTo("projectKey");
    }

    @Test
    public void payment() {
        CheckoutMessagePaymentsPayloadBaseData value = CheckoutMessagePaymentsPayloadBaseData.of();
        value.setPayment(new com.commercetools.api.models.payment.PaymentReferenceImpl());
        Assertions.assertThat(value.getPayment())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentReferenceImpl());
    }

    @Test
    public void transactionId() {
        CheckoutMessagePaymentsPayloadBaseData value = CheckoutMessagePaymentsPayloadBaseData.of();
        value.setTransactionId("transactionId");
        Assertions.assertThat(value.getTransactionId()).isEqualTo("transactionId");
    }

    @Test
    public void cart() {
        CheckoutMessagePaymentsPayloadBaseData value = CheckoutMessagePaymentsPayloadBaseData.of();
        value.setCart(new com.commercetools.api.models.cart.CartReferenceImpl());
        Assertions.assertThat(value.getCart()).isEqualTo(new com.commercetools.api.models.cart.CartReferenceImpl());
    }

    @Test
    public void order() {
        CheckoutMessagePaymentsPayloadBaseData value = CheckoutMessagePaymentsPayloadBaseData.of();
        value.setOrder(new com.commercetools.api.models.order.OrderReferenceImpl());
        Assertions.assertThat(value.getOrder()).isEqualTo(new com.commercetools.api.models.order.OrderReferenceImpl());
    }
}
