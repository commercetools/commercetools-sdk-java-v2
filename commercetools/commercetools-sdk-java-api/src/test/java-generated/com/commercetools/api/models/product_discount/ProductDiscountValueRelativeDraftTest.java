
package com.commercetools.api.models.product_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountValueRelativeDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountValueRelativeDraftBuilder builder) {
        ProductDiscountValueRelativeDraft productDiscountValueRelativeDraft = builder.buildUnchecked();
        Assertions.assertThat(productDiscountValueRelativeDraft).isInstanceOf(ProductDiscountValueRelativeDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "permyriad", ProductDiscountValueRelativeDraft.builder().permyriad(1L) } };
    }

    @Test
    public void permyriad() {
        ProductDiscountValueRelativeDraft value = ProductDiscountValueRelativeDraft.of();
        value.setPermyriad(1L);
        Assertions.assertThat(value.getPermyriad()).isEqualTo(1L);
    }
}
