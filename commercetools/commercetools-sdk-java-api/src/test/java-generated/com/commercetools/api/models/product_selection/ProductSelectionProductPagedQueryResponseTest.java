
package com.commercetools.api.models.product_selection;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionProductPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionProductPagedQueryResponseBuilder builder) {
        ProductSelectionProductPagedQueryResponse productSelectionProductPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(productSelectionProductPagedQueryResponse)
                .isInstanceOf(ProductSelectionProductPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", ProductSelectionProductPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", ProductSelectionProductPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", ProductSelectionProductPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", ProductSelectionProductPagedQueryResponse.builder().total(1L) },
                new Object[] { "results", ProductSelectionProductPagedQueryResponse.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.api.models.product_selection.AssignedProductReferenceImpl())) } };
    }

    @Test
    public void limit() {
        ProductSelectionProductPagedQueryResponse value = ProductSelectionProductPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ProductSelectionProductPagedQueryResponse value = ProductSelectionProductPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ProductSelectionProductPagedQueryResponse value = ProductSelectionProductPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ProductSelectionProductPagedQueryResponse value = ProductSelectionProductPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ProductSelectionProductPagedQueryResponse value = ProductSelectionProductPagedQueryResponse.of();
        value.setResults(Collections
                .singletonList(new com.commercetools.api.models.product_selection.AssignedProductReferenceImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_selection.AssignedProductReferenceImpl()));
    }
}
