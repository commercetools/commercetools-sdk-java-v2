
package com.commercetools.api.models.product_selection;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionUpdateBuilder builder) {
        ProductSelectionUpdate productSelectionUpdate = builder.buildUnchecked();
        Assertions.assertThat(productSelectionUpdate).isInstanceOf(ProductSelectionUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", ProductSelectionUpdate.builder().version(2L) },
                new Object[] { "actions", ProductSelectionUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.product_selection.ProductSelectionUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ProductSelectionUpdate value = ProductSelectionUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ProductSelectionUpdate value = ProductSelectionUpdate.of();
        value.setActions(Collections
                .singletonList(new com.commercetools.api.models.product_selection.ProductSelectionUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_selection.ProductSelectionUpdateActionImpl()));
    }
}
