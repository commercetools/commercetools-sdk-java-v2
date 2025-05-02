
package com.commercetools.api.models.product_search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchFacetDistinctExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchFacetDistinctExpressionBuilder builder) {
        ProductSearchFacetDistinctExpression productSearchFacetDistinctExpression = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetDistinctExpression)
                .isInstanceOf(ProductSearchFacetDistinctExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "distinct", ProductSearchFacetDistinctExpression.builder()
                .distinct(new com.commercetools.api.models.product_search.ProductSearchFacetDistinctValueImpl()) } };
    }

    @Test
    public void distinct() {
        ProductSearchFacetDistinctExpression value = ProductSearchFacetDistinctExpression.of();
        value.setDistinct(new com.commercetools.api.models.product_search.ProductSearchFacetDistinctValueImpl());
        Assertions.assertThat(value.getDistinct())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchFacetDistinctValueImpl());
    }
}
