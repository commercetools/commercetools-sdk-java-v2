
package com.commercetools.api.models.discount_code;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeSetValidFromActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeSetValidFromActionBuilder builder) {
        DiscountCodeSetValidFromAction discountCodeSetValidFromAction = builder.buildUnchecked();
        Assertions.assertThat(discountCodeSetValidFromAction).isInstanceOf(DiscountCodeSetValidFromAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "validFrom",
                DiscountCodeSetValidFromAction.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validFrom() {
        DiscountCodeSetValidFromAction value = DiscountCodeSetValidFromAction.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
