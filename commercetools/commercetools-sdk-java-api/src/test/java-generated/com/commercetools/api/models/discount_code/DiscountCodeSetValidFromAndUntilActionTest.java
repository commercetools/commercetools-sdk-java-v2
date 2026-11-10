
package com.commercetools.api.models.discount_code;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeSetValidFromAndUntilActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeSetValidFromAndUntilActionBuilder builder) {
        DiscountCodeSetValidFromAndUntilAction discountCodeSetValidFromAndUntilAction = builder.buildUnchecked();
        Assertions.assertThat(discountCodeSetValidFromAndUntilAction)
                .isInstanceOf(DiscountCodeSetValidFromAndUntilAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "validFrom",
                        DiscountCodeSetValidFromAndUntilAction.builder()
                                .validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil", DiscountCodeSetValidFromAndUntilAction.builder()
                        .validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validFrom() {
        DiscountCodeSetValidFromAndUntilAction value = DiscountCodeSetValidFromAndUntilAction.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        DiscountCodeSetValidFromAndUntilAction value = DiscountCodeSetValidFromAndUntilAction.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
