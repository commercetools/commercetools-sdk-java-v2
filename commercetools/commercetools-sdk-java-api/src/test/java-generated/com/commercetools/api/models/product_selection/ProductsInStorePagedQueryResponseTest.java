
package com.commercetools.api.models.product_selection;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductsInStorePagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductsInStorePagedQueryResponseBuilder builder) {
        ProductsInStorePagedQueryResponse productsInStorePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(productsInStorePagedQueryResponse).isInstanceOf(ProductsInStorePagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", ProductsInStorePagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", ProductsInStorePagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", ProductsInStorePagedQueryResponse.builder().count(2L) },
                new Object[] { "total", ProductsInStorePagedQueryResponse.builder().total(1L) },
                new Object[] { "results", ProductsInStorePagedQueryResponse.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.api.models.product_selection.ProductSelectionAssignmentImpl())) } };
    }

    @Test
    public void limit() {
        ProductsInStorePagedQueryResponse value = ProductsInStorePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ProductsInStorePagedQueryResponse value = ProductsInStorePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ProductsInStorePagedQueryResponse value = ProductsInStorePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ProductsInStorePagedQueryResponse value = ProductsInStorePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ProductsInStorePagedQueryResponse value = ProductsInStorePagedQueryResponse.of();
        value.setResults(Collections
                .singletonList(new com.commercetools.api.models.product_selection.ProductSelectionAssignmentImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_selection.ProductSelectionAssignmentImpl()));
    }
}
