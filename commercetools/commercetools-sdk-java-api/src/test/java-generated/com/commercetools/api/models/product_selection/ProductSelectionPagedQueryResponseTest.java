
package com.commercetools.api.models.product_selection;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionPagedQueryResponseBuilder builder) {
        ProductSelectionPagedQueryResponse productSelectionPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(productSelectionPagedQueryResponse)
                .isInstanceOf(ProductSelectionPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", ProductSelectionPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", ProductSelectionPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", ProductSelectionPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", ProductSelectionPagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        ProductSelectionPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.product_selection.ProductSelectionImpl())) } };
    }

    @Test
    public void limit() {
        ProductSelectionPagedQueryResponse value = ProductSelectionPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ProductSelectionPagedQueryResponse value = ProductSelectionPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ProductSelectionPagedQueryResponse value = ProductSelectionPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ProductSelectionPagedQueryResponse value = ProductSelectionPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ProductSelectionPagedQueryResponse value = ProductSelectionPagedQueryResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.api.models.product_selection.ProductSelectionImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.product_selection.ProductSelectionImpl()));
    }
}
