
package com.commercetools.api.models.product_tailoring;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringPagedQueryResponseBuilder builder) {
        ProductTailoringPagedQueryResponse productTailoringPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(productTailoringPagedQueryResponse)
                .isInstanceOf(ProductTailoringPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", ProductTailoringPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", ProductTailoringPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", ProductTailoringPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", ProductTailoringPagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        ProductTailoringPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.product_tailoring.ProductTailoringImpl())) } };
    }

    @Test
    public void limit() {
        ProductTailoringPagedQueryResponse value = ProductTailoringPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ProductTailoringPagedQueryResponse value = ProductTailoringPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ProductTailoringPagedQueryResponse value = ProductTailoringPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ProductTailoringPagedQueryResponse value = ProductTailoringPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ProductTailoringPagedQueryResponse value = ProductTailoringPagedQueryResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.api.models.product_tailoring.ProductTailoringImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.product_tailoring.ProductTailoringImpl()));
    }
}
