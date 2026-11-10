
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountValueBuilder builder) {
        ProductDiscountValue productDiscountValue = builder.buildUnchecked();
        Assertions.assertThat(productDiscountValue).isInstanceOf(ProductDiscountValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "type", ProductDiscountValue.builder().type("type") } };
    }

    @Test
    public void type() {
        ProductDiscountValue value = ProductDiscountValue.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }
}
