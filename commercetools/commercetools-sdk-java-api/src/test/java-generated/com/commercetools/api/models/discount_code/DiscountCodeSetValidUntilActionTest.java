
package com.commercetools.api.models.discount_code;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeSetValidUntilActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeSetValidUntilActionBuilder builder) {
        DiscountCodeSetValidUntilAction discountCodeSetValidUntilAction = builder.buildUnchecked();
        Assertions.assertThat(discountCodeSetValidUntilAction).isInstanceOf(DiscountCodeSetValidUntilAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "validUntil",
                DiscountCodeSetValidUntilAction.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validUntil() {
        DiscountCodeSetValidUntilAction value = DiscountCodeSetValidUntilAction.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
