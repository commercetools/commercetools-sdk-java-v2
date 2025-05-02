
package com.commercetools.api.models.product_search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchFacetResultCountTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchFacetResultCountBuilder builder) {
        ProductSearchFacetResultCount productSearchFacetResultCount = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetResultCount).isInstanceOf(ProductSearchFacetResultCount.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", ProductSearchFacetResultCount.builder().value(6L) } };
    }

    @Test
    public void value() {
        ProductSearchFacetResultCount value = ProductSearchFacetResultCount.of();
        value.setValue(6L);
        Assertions.assertThat(value.getValue()).isEqualTo(6L);
    }
}
