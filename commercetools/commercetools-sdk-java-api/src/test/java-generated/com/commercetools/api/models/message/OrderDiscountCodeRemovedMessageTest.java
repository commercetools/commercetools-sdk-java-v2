
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderDiscountCodeRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderDiscountCodeRemovedMessageBuilder builder) {
        OrderDiscountCodeRemovedMessage orderDiscountCodeRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderDiscountCodeRemovedMessage).isInstanceOf(OrderDiscountCodeRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "discountCode", OrderDiscountCodeRemovedMessage.builder()
                .discountCode(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl()) } };
    }

    @Test
    public void discountCode() {
        OrderDiscountCodeRemovedMessage value = OrderDiscountCodeRemovedMessage.of();
        value.setDiscountCode(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl());
        Assertions.assertThat(value.getDiscountCode())
                .isEqualTo(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl());
    }
}
