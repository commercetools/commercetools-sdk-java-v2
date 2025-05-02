
package com.commercetools.api.models.product_search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchResultTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchResultBuilder builder) {
        ProductSearchResult productSearchResult = builder.buildUnchecked();
        Assertions.assertThat(productSearchResult).isInstanceOf(ProductSearchResult.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductSearchResult.builder().id("id") },
                new Object[] { "matchingVariants", ProductSearchResult.builder()
                        .matchingVariants(
                            new com.commercetools.api.models.product_search.ProductSearchMatchingVariantsImpl()) },
                new Object[] { "productProjection", ProductSearchResult.builder()
                        .productProjection(new com.commercetools.api.models.product.ProductProjectionImpl()) } };
    }

    @Test
    public void id() {
        ProductSearchResult value = ProductSearchResult.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void matchingVariants() {
        ProductSearchResult value = ProductSearchResult.of();
        value.setMatchingVariants(new com.commercetools.api.models.product_search.ProductSearchMatchingVariantsImpl());
        Assertions.assertThat(value.getMatchingVariants())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchMatchingVariantsImpl());
    }

    @Test
    public void productProjection() {
        ProductSearchResult value = ProductSearchResult.of();
        value.setProductProjection(new com.commercetools.api.models.product.ProductProjectionImpl());
        Assertions.assertThat(value.getProductProjection())
                .isEqualTo(new com.commercetools.api.models.product.ProductProjectionImpl());
    }
}
