
package com.commercetools.history.models.change_history;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecordPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecordPagedQueryResponseBuilder builder) {
        RecordPagedQueryResponse recordPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(recordPagedQueryResponse).isInstanceOf(RecordPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", RecordPagedQueryResponse.builder().limit(7) },
                new Object[] { "count", RecordPagedQueryResponse.builder().count(2) },
                new Object[] { "total", RecordPagedQueryResponse.builder().total(1) },
                new Object[] { "offset", RecordPagedQueryResponse.builder().offset(3) },
                new Object[] { "results",
                        RecordPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.history.models.change_history.RecordImpl())) } };
    }

    @Test
    public void limit() {
        RecordPagedQueryResponse value = RecordPagedQueryResponse.of();
        value.setLimit(7);
        Assertions.assertThat(value.getLimit()).isEqualTo(7);
    }

    @Test
    public void count() {
        RecordPagedQueryResponse value = RecordPagedQueryResponse.of();
        value.setCount(2);
        Assertions.assertThat(value.getCount()).isEqualTo(2);
    }

    @Test
    public void total() {
        RecordPagedQueryResponse value = RecordPagedQueryResponse.of();
        value.setTotal(1);
        Assertions.assertThat(value.getTotal()).isEqualTo(1);
    }

    @Test
    public void offset() {
        RecordPagedQueryResponse value = RecordPagedQueryResponse.of();
        value.setOffset(3);
        Assertions.assertThat(value.getOffset()).isEqualTo(3);
    }

    @Test
    public void results() {
        RecordPagedQueryResponse value = RecordPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.history.models.change_history.RecordImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.change_history.RecordImpl()));
    }
}
