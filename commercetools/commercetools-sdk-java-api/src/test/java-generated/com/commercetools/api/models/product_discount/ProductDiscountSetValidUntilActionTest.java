
package com.commercetools.api.models.product_discount;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountSetValidUntilActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountSetValidUntilActionBuilder builder) {
        ProductDiscountSetValidUntilAction productDiscountSetValidUntilAction = builder.buildUnchecked();
        Assertions.assertThat(productDiscountSetValidUntilAction)
                .isInstanceOf(ProductDiscountSetValidUntilAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "validUntil",
                ProductDiscountSetValidUntilAction.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validUntil() {
        ProductDiscountSetValidUntilAction value = ProductDiscountSetValidUntilAction.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
