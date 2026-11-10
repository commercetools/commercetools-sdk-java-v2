
package com.commercetools.api.models.state;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StatePagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StatePagedQueryResponseBuilder builder) {
        StatePagedQueryResponse statePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(statePagedQueryResponse).isInstanceOf(StatePagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", StatePagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", StatePagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", StatePagedQueryResponse.builder().count(2L) },
                new Object[] { "total", StatePagedQueryResponse.builder().total(1L) },
                new Object[] { "results", StatePagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.state.StateImpl())) } };
    }

    @Test
    public void limit() {
        StatePagedQueryResponse value = StatePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        StatePagedQueryResponse value = StatePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        StatePagedQueryResponse value = StatePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        StatePagedQueryResponse value = StatePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        StatePagedQueryResponse value = StatePagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.state.StateImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.state.StateImpl()));
    }
}
