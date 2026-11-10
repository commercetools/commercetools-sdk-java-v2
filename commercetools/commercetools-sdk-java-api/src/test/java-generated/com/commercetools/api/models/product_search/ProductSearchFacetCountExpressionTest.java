
package com.commercetools.api.models.product_search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchFacetCountExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchFacetCountExpressionBuilder builder) {
        ProductSearchFacetCountExpression productSearchFacetCountExpression = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetCountExpression).isInstanceOf(ProductSearchFacetCountExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "count", ProductSearchFacetCountExpression.builder()
                .count(new com.commercetools.api.models.product_search.ProductSearchFacetCountValueImpl()) } };
    }

    @Test
    public void count() {
        ProductSearchFacetCountExpression value = ProductSearchFacetCountExpression.of();
        value.setCount(new com.commercetools.api.models.product_search.ProductSearchFacetCountValueImpl());
        Assertions.assertThat(value.getCount())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchFacetCountValueImpl());
    }
}
