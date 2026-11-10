
package com.commercetools.api.models.product_search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchFacetStatsExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchFacetStatsExpressionBuilder builder) {
        ProductSearchFacetStatsExpression productSearchFacetStatsExpression = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetStatsExpression).isInstanceOf(ProductSearchFacetStatsExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "stats", ProductSearchFacetStatsExpression.builder()
                .stats(new com.commercetools.api.models.product_search.ProductSearchFacetStatsValueImpl()) } };
    }

    @Test
    public void stats() {
        ProductSearchFacetStatsExpression value = ProductSearchFacetStatsExpression.of();
        value.setStats(new com.commercetools.api.models.product_search.ProductSearchFacetStatsValueImpl());
        Assertions.assertThat(value.getStats())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchFacetStatsValueImpl());
    }
}
