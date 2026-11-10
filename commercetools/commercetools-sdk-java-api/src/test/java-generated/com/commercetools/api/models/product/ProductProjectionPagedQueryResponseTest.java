
package com.commercetools.api.models.product;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductProjectionPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductProjectionPagedQueryResponseBuilder builder) {
        ProductProjectionPagedQueryResponse productProjectionPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(productProjectionPagedQueryResponse)
                .isInstanceOf(ProductProjectionPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", ProductProjectionPagedQueryResponse.builder().limit(7L) },
                new Object[] { "count", ProductProjectionPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", ProductProjectionPagedQueryResponse.builder().total(1L) },
                new Object[] { "offset", ProductProjectionPagedQueryResponse.builder().offset(3L) },
                new Object[] { "results",
                        ProductProjectionPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.product.ProductProjectionImpl())) } };
    }

    @Test
    public void limit() {
        ProductProjectionPagedQueryResponse value = ProductProjectionPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void count() {
        ProductProjectionPagedQueryResponse value = ProductProjectionPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ProductProjectionPagedQueryResponse value = ProductProjectionPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void offset() {
        ProductProjectionPagedQueryResponse value = ProductProjectionPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void results() {
        ProductProjectionPagedQueryResponse value = ProductProjectionPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.product.ProductProjectionImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.ProductProjectionImpl()));
    }
}
