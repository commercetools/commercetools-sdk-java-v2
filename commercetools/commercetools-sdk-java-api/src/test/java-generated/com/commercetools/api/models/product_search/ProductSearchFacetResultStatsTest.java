
package com.commercetools.api.models.product_search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchFacetResultStatsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchFacetResultStatsBuilder builder) {
        ProductSearchFacetResultStats productSearchFacetResultStats = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetResultStats).isInstanceOf(ProductSearchFacetResultStats.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "min", ProductSearchFacetResultStats.builder().min("min") },
                new Object[] { "max", ProductSearchFacetResultStats.builder().max("max") },
                new Object[] { "mean", ProductSearchFacetResultStats.builder().mean("mean") },
                new Object[] { "sum", ProductSearchFacetResultStats.builder().sum("sum") },
                new Object[] { "count", ProductSearchFacetResultStats.builder().count(2L) } };
    }

    @Test
    public void min() {
        ProductSearchFacetResultStats value = ProductSearchFacetResultStats.of();
        value.setMin("min");
        Assertions.assertThat(value.getMin()).isEqualTo("min");
    }

    @Test
    public void max() {
        ProductSearchFacetResultStats value = ProductSearchFacetResultStats.of();
        value.setMax("max");
        Assertions.assertThat(value.getMax()).isEqualTo("max");
    }

    @Test
    public void mean() {
        ProductSearchFacetResultStats value = ProductSearchFacetResultStats.of();
        value.setMean("mean");
        Assertions.assertThat(value.getMean()).isEqualTo("mean");
    }

    @Test
    public void sum() {
        ProductSearchFacetResultStats value = ProductSearchFacetResultStats.of();
        value.setSum("sum");
        Assertions.assertThat(value.getSum()).isEqualTo("sum");
    }

    @Test
    public void count() {
        ProductSearchFacetResultStats value = ProductSearchFacetResultStats.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }
}
