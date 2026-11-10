
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class FilteredFacetResultTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, FilteredFacetResultBuilder builder) {
        FilteredFacetResult filteredFacetResult = builder.buildUnchecked();
        Assertions.assertThat(filteredFacetResult).isInstanceOf(FilteredFacetResult.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "count", FilteredFacetResult.builder().count(2L) },
                new Object[] { "productCount", FilteredFacetResult.builder().productCount(1L) } };
    }

    @Test
    public void count() {
        FilteredFacetResult value = FilteredFacetResult.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void productCount() {
        FilteredFacetResult value = FilteredFacetResult.of();
        value.setProductCount(1L);
        Assertions.assertThat(value.getProductCount()).isEqualTo(1L);
    }
}
