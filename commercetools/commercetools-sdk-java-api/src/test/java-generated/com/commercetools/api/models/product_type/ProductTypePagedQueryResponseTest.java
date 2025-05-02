
package com.commercetools.api.models.product_type;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypePagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypePagedQueryResponseBuilder builder) {
        ProductTypePagedQueryResponse productTypePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(productTypePagedQueryResponse).isInstanceOf(ProductTypePagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", ProductTypePagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", ProductTypePagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", ProductTypePagedQueryResponse.builder().count(2L) },
                new Object[] { "total", ProductTypePagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        ProductTypePagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.product_type.ProductTypeImpl())) } };
    }

    @Test
    public void limit() {
        ProductTypePagedQueryResponse value = ProductTypePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ProductTypePagedQueryResponse value = ProductTypePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ProductTypePagedQueryResponse value = ProductTypePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ProductTypePagedQueryResponse value = ProductTypePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ProductTypePagedQueryResponse value = ProductTypePagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.product_type.ProductTypeImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product_type.ProductTypeImpl()));
    }
}
