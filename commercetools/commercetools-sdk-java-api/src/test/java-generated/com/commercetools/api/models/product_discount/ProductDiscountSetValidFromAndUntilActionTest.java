
package com.commercetools.api.models.product_discount;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountSetValidFromAndUntilActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountSetValidFromAndUntilActionBuilder builder) {
        ProductDiscountSetValidFromAndUntilAction productDiscountSetValidFromAndUntilAction = builder.buildUnchecked();
        Assertions.assertThat(productDiscountSetValidFromAndUntilAction)
                .isInstanceOf(ProductDiscountSetValidFromAndUntilAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "validFrom",
                        ProductDiscountSetValidFromAndUntilAction.builder()
                                .validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil", ProductDiscountSetValidFromAndUntilAction.builder()
                        .validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validFrom() {
        ProductDiscountSetValidFromAndUntilAction value = ProductDiscountSetValidFromAndUntilAction.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        ProductDiscountSetValidFromAndUntilAction value = ProductDiscountSetValidFromAndUntilAction.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
