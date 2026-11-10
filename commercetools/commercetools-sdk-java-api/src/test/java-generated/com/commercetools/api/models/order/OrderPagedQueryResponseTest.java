
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderPagedQueryResponseBuilder builder) {
        OrderPagedQueryResponse orderPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(orderPagedQueryResponse).isInstanceOf(OrderPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", OrderPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", OrderPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", OrderPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", OrderPagedQueryResponse.builder().total(1L) },
                new Object[] { "results", OrderPagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.order.OrderImpl())) } };
    }

    @Test
    public void limit() {
        OrderPagedQueryResponse value = OrderPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        OrderPagedQueryResponse value = OrderPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        OrderPagedQueryResponse value = OrderPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        OrderPagedQueryResponse value = OrderPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        OrderPagedQueryResponse value = OrderPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.order.OrderImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.OrderImpl()));
    }
}
