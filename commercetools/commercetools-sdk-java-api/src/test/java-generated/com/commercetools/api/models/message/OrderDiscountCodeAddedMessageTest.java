
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderDiscountCodeAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderDiscountCodeAddedMessageBuilder builder) {
        OrderDiscountCodeAddedMessage orderDiscountCodeAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderDiscountCodeAddedMessage).isInstanceOf(OrderDiscountCodeAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "discountCode", OrderDiscountCodeAddedMessage.builder()
                .discountCode(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl()) } };
    }

    @Test
    public void discountCode() {
        OrderDiscountCodeAddedMessage value = OrderDiscountCodeAddedMessage.of();
        value.setDiscountCode(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl());
        Assertions.assertThat(value.getDiscountCode())
                .isEqualTo(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl());
    }
}
