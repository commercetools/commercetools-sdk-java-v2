
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderDiscountCodeStateSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderDiscountCodeStateSetMessageBuilder builder) {
        OrderDiscountCodeStateSetMessage orderDiscountCodeStateSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderDiscountCodeStateSetMessage).isInstanceOf(OrderDiscountCodeStateSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "discountCode", OrderDiscountCodeStateSetMessage.builder()
                        .discountCode(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl()) },
                new Object[] { "state",
                        OrderDiscountCodeStateSetMessage.builder()
                                .state(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive")) },
                new Object[] { "oldState", OrderDiscountCodeStateSetMessage.builder()
                        .oldState(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive")) } };
    }

    @Test
    public void discountCode() {
        OrderDiscountCodeStateSetMessage value = OrderDiscountCodeStateSetMessage.of();
        value.setDiscountCode(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl());
        Assertions.assertThat(value.getDiscountCode())
                .isEqualTo(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl());
    }

    @Test
    public void state() {
        OrderDiscountCodeStateSetMessage value = OrderDiscountCodeStateSetMessage.of();
        value.setState(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive"));
    }

    @Test
    public void oldState() {
        OrderDiscountCodeStateSetMessage value = OrderDiscountCodeStateSetMessage.of();
        value.setOldState(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive"));
        Assertions.assertThat(value.getOldState())
                .isEqualTo(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive"));
    }
}
