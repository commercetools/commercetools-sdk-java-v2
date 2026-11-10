
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeCreatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeCreatedMessageBuilder builder) {
        DiscountCodeCreatedMessage discountCodeCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(discountCodeCreatedMessage).isInstanceOf(DiscountCodeCreatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "discountCode", DiscountCodeCreatedMessage.builder()
                .discountCode(new com.commercetools.api.models.discount_code.DiscountCodeImpl()) } };
    }

    @Test
    public void discountCode() {
        DiscountCodeCreatedMessage value = DiscountCodeCreatedMessage.of();
        value.setDiscountCode(new com.commercetools.api.models.discount_code.DiscountCodeImpl());
        Assertions.assertThat(value.getDiscountCode())
                .isEqualTo(new com.commercetools.api.models.discount_code.DiscountCodeImpl());
    }
}
