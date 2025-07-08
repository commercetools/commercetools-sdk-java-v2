
package com.commercetools.api.models.recurrence_policy;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurrencePolicyPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurrencePolicyPagedQueryResponseBuilder builder) {
        RecurrencePolicyPagedQueryResponse recurrencePolicyPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(recurrencePolicyPagedQueryResponse)
                .isInstanceOf(RecurrencePolicyPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", RecurrencePolicyPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", RecurrencePolicyPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", RecurrencePolicyPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", RecurrencePolicyPagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        RecurrencePolicyPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.recurrence_policy.RecurrencePolicyImpl())) } };
    }

    @Test
    public void limit() {
        RecurrencePolicyPagedQueryResponse value = RecurrencePolicyPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        RecurrencePolicyPagedQueryResponse value = RecurrencePolicyPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        RecurrencePolicyPagedQueryResponse value = RecurrencePolicyPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        RecurrencePolicyPagedQueryResponse value = RecurrencePolicyPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        RecurrencePolicyPagedQueryResponse value = RecurrencePolicyPagedQueryResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyImpl()));
    }
}
