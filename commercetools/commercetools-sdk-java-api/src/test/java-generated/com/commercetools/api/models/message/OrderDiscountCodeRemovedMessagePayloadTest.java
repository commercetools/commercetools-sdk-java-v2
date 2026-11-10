
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderDiscountCodeRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderDiscountCodeRemovedMessagePayloadBuilder builder) {
        OrderDiscountCodeRemovedMessagePayload orderDiscountCodeRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderDiscountCodeRemovedMessagePayload)
                .isInstanceOf(OrderDiscountCodeRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "discountCode", OrderDiscountCodeRemovedMessagePayload.builder()
                .discountCode(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl()) } };
    }

    @Test
    public void discountCode() {
        OrderDiscountCodeRemovedMessagePayload value = OrderDiscountCodeRemovedMessagePayload.of();
        value.setDiscountCode(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl());
        Assertions.assertThat(value.getDiscountCode())
                .isEqualTo(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl());
    }
}
