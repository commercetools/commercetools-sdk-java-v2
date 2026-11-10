
package com.commercetools.api.models.product_search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchMatchingVariantEntryTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchMatchingVariantEntryBuilder builder) {
        ProductSearchMatchingVariantEntry productSearchMatchingVariantEntry = builder.buildUnchecked();
        Assertions.assertThat(productSearchMatchingVariantEntry).isInstanceOf(ProductSearchMatchingVariantEntry.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductSearchMatchingVariantEntry.builder().id(2) },
                new Object[] { "sku", ProductSearchMatchingVariantEntry.builder().sku("sku") } };
    }

    @Test
    public void id() {
        ProductSearchMatchingVariantEntry value = ProductSearchMatchingVariantEntry.of();
        value.setId(2);
        Assertions.assertThat(value.getId()).isEqualTo(2);
    }

    @Test
    public void sku() {
        ProductSearchMatchingVariantEntry value = ProductSearchMatchingVariantEntry.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }
}
