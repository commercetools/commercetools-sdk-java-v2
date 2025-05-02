
package com.commercetools.api.models.product_discount;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountSetValidFromActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountSetValidFromActionBuilder builder) {
        ProductDiscountSetValidFromAction productDiscountSetValidFromAction = builder.buildUnchecked();
        Assertions.assertThat(productDiscountSetValidFromAction).isInstanceOf(ProductDiscountSetValidFromAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "validFrom",
                ProductDiscountSetValidFromAction.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validFrom() {
        ProductDiscountSetValidFromAction value = ProductDiscountSetValidFromAction.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
