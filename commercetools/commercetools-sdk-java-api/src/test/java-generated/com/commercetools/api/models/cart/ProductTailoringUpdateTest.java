
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringUpdateBuilder builder) {
        ProductTailoringUpdate productTailoringUpdate = builder.buildUnchecked();
        Assertions.assertThat(productTailoringUpdate).isInstanceOf(ProductTailoringUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", ProductTailoringUpdate.builder().version(2L) },
                new Object[] { "actions", ProductTailoringUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.product_tailoring.ProductTailoringUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ProductTailoringUpdate value = ProductTailoringUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ProductTailoringUpdate value = ProductTailoringUpdate.of();
        value.setActions(Collections
                .singletonList(new com.commercetools.api.models.product_tailoring.ProductTailoringUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_tailoring.ProductTailoringUpdateActionImpl()));
    }
}
