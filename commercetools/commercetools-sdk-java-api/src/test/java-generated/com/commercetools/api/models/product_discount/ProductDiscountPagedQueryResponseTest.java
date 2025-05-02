
package com.commercetools.api.models.product_discount;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountPagedQueryResponseBuilder builder) {
        ProductDiscountPagedQueryResponse productDiscountPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(productDiscountPagedQueryResponse).isInstanceOf(ProductDiscountPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", ProductDiscountPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", ProductDiscountPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", ProductDiscountPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", ProductDiscountPagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        ProductDiscountPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.product_discount.ProductDiscountImpl())) } };
    }

    @Test
    public void limit() {
        ProductDiscountPagedQueryResponse value = ProductDiscountPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ProductDiscountPagedQueryResponse value = ProductDiscountPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ProductDiscountPagedQueryResponse value = ProductDiscountPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ProductDiscountPagedQueryResponse value = ProductDiscountPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ProductDiscountPagedQueryResponse value = ProductDiscountPagedQueryResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.api.models.product_discount.ProductDiscountImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.product_discount.ProductDiscountImpl()));
    }
}
