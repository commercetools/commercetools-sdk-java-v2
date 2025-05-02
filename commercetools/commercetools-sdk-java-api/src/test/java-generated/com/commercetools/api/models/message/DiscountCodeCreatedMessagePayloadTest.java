
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeCreatedMessagePayloadBuilder builder) {
        DiscountCodeCreatedMessagePayload discountCodeCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(discountCodeCreatedMessagePayload).isInstanceOf(DiscountCodeCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "discountCode", DiscountCodeCreatedMessagePayload.builder()
                .discountCode(new com.commercetools.api.models.discount_code.DiscountCodeImpl()) } };
    }

    @Test
    public void discountCode() {
        DiscountCodeCreatedMessagePayload value = DiscountCodeCreatedMessagePayload.of();
        value.setDiscountCode(new com.commercetools.api.models.discount_code.DiscountCodeImpl());
        Assertions.assertThat(value.getDiscountCode())
                .isEqualTo(new com.commercetools.api.models.discount_code.DiscountCodeImpl());
    }
}
