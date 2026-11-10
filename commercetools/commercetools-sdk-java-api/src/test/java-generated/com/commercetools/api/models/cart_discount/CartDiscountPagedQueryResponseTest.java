
package com.commercetools.api.models.cart_discount;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountPagedQueryResponseBuilder builder) {
        CartDiscountPagedQueryResponse cartDiscountPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountPagedQueryResponse).isInstanceOf(CartDiscountPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", CartDiscountPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", CartDiscountPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", CartDiscountPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", CartDiscountPagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        CartDiscountPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.cart_discount.CartDiscountImpl())) } };
    }

    @Test
    public void limit() {
        CartDiscountPagedQueryResponse value = CartDiscountPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        CartDiscountPagedQueryResponse value = CartDiscountPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        CartDiscountPagedQueryResponse value = CartDiscountPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        CartDiscountPagedQueryResponse value = CartDiscountPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        CartDiscountPagedQueryResponse value = CartDiscountPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.cart_discount.CartDiscountImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.cart_discount.CartDiscountImpl()));
    }
}
