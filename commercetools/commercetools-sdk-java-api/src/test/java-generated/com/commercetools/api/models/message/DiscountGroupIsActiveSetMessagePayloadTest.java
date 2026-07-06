
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountGroupIsActiveSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountGroupIsActiveSetMessagePayloadBuilder builder) {
        DiscountGroupIsActiveSetMessagePayload discountGroupIsActiveSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(discountGroupIsActiveSetMessagePayload)
                .isInstanceOf(DiscountGroupIsActiveSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "isActive", DiscountGroupIsActiveSetMessagePayload.builder().isActive(true) },
                new Object[] { "oldIsActive", DiscountGroupIsActiveSetMessagePayload.builder().oldIsActive(true) } };
    }

    @Test
    public void isActive() {
        DiscountGroupIsActiveSetMessagePayload value = DiscountGroupIsActiveSetMessagePayload.of();
        value.setIsActive(true);
        Assertions.assertThat(value.getIsActive()).isEqualTo(true);
    }

    @Test
    public void oldIsActive() {
        DiscountGroupIsActiveSetMessagePayload value = DiscountGroupIsActiveSetMessagePayload.of();
        value.setOldIsActive(true);
        Assertions.assertThat(value.getOldIsActive()).isEqualTo(true);
    }
}
