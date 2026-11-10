
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountGroupCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountGroupCreatedMessagePayloadBuilder builder) {
        DiscountGroupCreatedMessagePayload discountGroupCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(discountGroupCreatedMessagePayload)
                .isInstanceOf(DiscountGroupCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "discountGroup", DiscountGroupCreatedMessagePayload.builder()
                .discountGroup(new com.commercetools.api.models.discount_group.DiscountGroupImpl()) } };
    }

    @Test
    public void discountGroup() {
        DiscountGroupCreatedMessagePayload value = DiscountGroupCreatedMessagePayload.of();
        value.setDiscountGroup(new com.commercetools.api.models.discount_group.DiscountGroupImpl());
        Assertions.assertThat(value.getDiscountGroup())
                .isEqualTo(new com.commercetools.api.models.discount_group.DiscountGroupImpl());
    }
}
