
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartPagedQueryResponseBuilder builder) {
        CartPagedQueryResponse cartPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(cartPagedQueryResponse).isInstanceOf(CartPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", CartPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", CartPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", CartPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", CartPagedQueryResponse.builder().total(1L) },
                new Object[] { "results", CartPagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.cart.CartImpl())) } };
    }

    @Test
    public void limit() {
        CartPagedQueryResponse value = CartPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        CartPagedQueryResponse value = CartPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        CartPagedQueryResponse value = CartPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        CartPagedQueryResponse value = CartPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        CartPagedQueryResponse value = CartPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.cart.CartImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.CartImpl()));
    }
}
