
package com.commercetools.api.models.product_search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchFacetResultTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchFacetResultBuilder builder) {
        ProductSearchFacetResult productSearchFacetResult = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetResult).isInstanceOf(ProductSearchFacetResult.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ProductSearchFacetResult.builder().name("name") } };
    }

    @Test
    public void name() {
        ProductSearchFacetResult value = ProductSearchFacetResult.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
