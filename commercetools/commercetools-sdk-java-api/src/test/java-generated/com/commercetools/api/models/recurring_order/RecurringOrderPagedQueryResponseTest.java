
package com.commercetools.api.models.recurring_order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderPagedQueryResponseBuilder builder) {
        RecurringOrderPagedQueryResponse recurringOrderPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderPagedQueryResponse).isInstanceOf(RecurringOrderPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", RecurringOrderPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", RecurringOrderPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", RecurringOrderPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", RecurringOrderPagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        RecurringOrderPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.recurring_order.RecurringOrderImpl())) } };
    }

    @Test
    public void limit() {
        RecurringOrderPagedQueryResponse value = RecurringOrderPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        RecurringOrderPagedQueryResponse value = RecurringOrderPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        RecurringOrderPagedQueryResponse value = RecurringOrderPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        RecurringOrderPagedQueryResponse value = RecurringOrderPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        RecurringOrderPagedQueryResponse value = RecurringOrderPagedQueryResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.api.models.recurring_order.RecurringOrderImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.recurring_order.RecurringOrderImpl()));
    }
}
