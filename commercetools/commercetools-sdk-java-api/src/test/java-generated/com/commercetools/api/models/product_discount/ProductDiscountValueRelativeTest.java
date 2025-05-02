
package com.commercetools.api.models.product_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountValueRelativeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountValueRelativeBuilder builder) {
        ProductDiscountValueRelative productDiscountValueRelative = builder.buildUnchecked();
        Assertions.assertThat(productDiscountValueRelative).isInstanceOf(ProductDiscountValueRelative.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "permyriad", ProductDiscountValueRelative.builder().permyriad(1L) } };
    }

    @Test
    public void permyriad() {
        ProductDiscountValueRelative value = ProductDiscountValueRelative.of();
        value.setPermyriad(1L);
        Assertions.assertThat(value.getPermyriad()).isEqualTo(1L);
    }
}
