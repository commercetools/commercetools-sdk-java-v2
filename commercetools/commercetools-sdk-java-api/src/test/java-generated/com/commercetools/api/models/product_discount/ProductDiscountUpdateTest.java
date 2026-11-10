
package com.commercetools.api.models.product_discount;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountUpdateBuilder builder) {
        ProductDiscountUpdate productDiscountUpdate = builder.buildUnchecked();
        Assertions.assertThat(productDiscountUpdate).isInstanceOf(ProductDiscountUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", ProductDiscountUpdate.builder().version(2L) },
                new Object[] { "actions", ProductDiscountUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.product_discount.ProductDiscountUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ProductDiscountUpdate value = ProductDiscountUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ProductDiscountUpdate value = ProductDiscountUpdate.of();
        value.setActions(Collections
                .singletonList(new com.commercetools.api.models.product_discount.ProductDiscountUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_discount.ProductDiscountUpdateActionImpl()));
    }
}
