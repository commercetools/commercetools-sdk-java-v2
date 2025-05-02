
package com.commercetools.api.models.product_search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchFacetRangesExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchFacetRangesExpressionBuilder builder) {
        ProductSearchFacetRangesExpression productSearchFacetRangesExpression = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetRangesExpression)
                .isInstanceOf(ProductSearchFacetRangesExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "ranges", ProductSearchFacetRangesExpression.builder()
                .ranges(new com.commercetools.api.models.product_search.ProductSearchFacetRangesValueImpl()) } };
    }

    @Test
    public void ranges() {
        ProductSearchFacetRangesExpression value = ProductSearchFacetRangesExpression.of();
        value.setRanges(new com.commercetools.api.models.product_search.ProductSearchFacetRangesValueImpl());
        Assertions.assertThat(value.getRanges())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchFacetRangesValueImpl());
    }
}
