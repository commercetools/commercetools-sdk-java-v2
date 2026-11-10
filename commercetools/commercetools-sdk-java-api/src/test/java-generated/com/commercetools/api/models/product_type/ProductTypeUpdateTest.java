
package com.commercetools.api.models.product_type;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeUpdateBuilder builder) {
        ProductTypeUpdate productTypeUpdate = builder.buildUnchecked();
        Assertions.assertThat(productTypeUpdate).isInstanceOf(ProductTypeUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", ProductTypeUpdate.builder().version(2L) },
                new Object[] { "actions",
                        ProductTypeUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.product_type.ProductTypeUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ProductTypeUpdate value = ProductTypeUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ProductTypeUpdate value = ProductTypeUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.product_type.ProductTypeUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.product_type.ProductTypeUpdateActionImpl()));
    }
}
