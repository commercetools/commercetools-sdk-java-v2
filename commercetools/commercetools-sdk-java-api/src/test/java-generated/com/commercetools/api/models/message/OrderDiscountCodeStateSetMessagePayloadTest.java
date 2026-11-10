
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderDiscountCodeStateSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderDiscountCodeStateSetMessagePayloadBuilder builder) {
        OrderDiscountCodeStateSetMessagePayload orderDiscountCodeStateSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderDiscountCodeStateSetMessagePayload)
                .isInstanceOf(OrderDiscountCodeStateSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "discountCode", OrderDiscountCodeStateSetMessagePayload.builder()
                        .discountCode(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl()) },
                new Object[] { "state",
                        OrderDiscountCodeStateSetMessagePayload.builder()
                                .state(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive")) },
                new Object[] { "oldState", OrderDiscountCodeStateSetMessagePayload.builder()
                        .oldState(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive")) } };
    }

    @Test
    public void discountCode() {
        OrderDiscountCodeStateSetMessagePayload value = OrderDiscountCodeStateSetMessagePayload.of();
        value.setDiscountCode(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl());
        Assertions.assertThat(value.getDiscountCode())
                .isEqualTo(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl());
    }

    @Test
    public void state() {
        OrderDiscountCodeStateSetMessagePayload value = OrderDiscountCodeStateSetMessagePayload.of();
        value.setState(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive"));
    }

    @Test
    public void oldState() {
        OrderDiscountCodeStateSetMessagePayload value = OrderDiscountCodeStateSetMessagePayload.of();
        value.setOldState(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive"));
        Assertions.assertThat(value.getOldState())
                .isEqualTo(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive"));
    }
}
