
package com.commercetools.api.models.order_edit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderEditPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderEditPagedQueryResponseBuilder builder) {
        OrderEditPagedQueryResponse orderEditPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(orderEditPagedQueryResponse).isInstanceOf(OrderEditPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", OrderEditPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", OrderEditPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", OrderEditPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", OrderEditPagedQueryResponse.builder().total(1L) },
                new Object[] { "results", OrderEditPagedQueryResponse.builder()
                        .results(
                            Collections.singletonList(new com.commercetools.api.models.order_edit.OrderEditImpl())) } };
    }

    @Test
    public void limit() {
        OrderEditPagedQueryResponse value = OrderEditPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        OrderEditPagedQueryResponse value = OrderEditPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        OrderEditPagedQueryResponse value = OrderEditPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        OrderEditPagedQueryResponse value = OrderEditPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        OrderEditPagedQueryResponse value = OrderEditPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.order_edit.OrderEditImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order_edit.OrderEditImpl()));
    }
}
