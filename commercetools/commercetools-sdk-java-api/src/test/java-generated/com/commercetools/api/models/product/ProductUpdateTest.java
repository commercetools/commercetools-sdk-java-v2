
package com.commercetools.api.models.product;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductUpdateBuilder builder) {
        ProductUpdate productUpdate = builder.buildUnchecked();
        Assertions.assertThat(productUpdate).isInstanceOf(ProductUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", ProductUpdate.builder().version(2L) },
                new Object[] { "actions",
                        ProductUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.product.ProductUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ProductUpdate value = ProductUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ProductUpdate value = ProductUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.product.ProductUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.product.ProductUpdateActionImpl()));
    }
}
