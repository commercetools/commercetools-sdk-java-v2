
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MessagePagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MessagePagedQueryResponseBuilder builder) {
        MessagePagedQueryResponse messagePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(messagePagedQueryResponse).isInstanceOf(MessagePagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", MessagePagedQueryResponse.builder().limit(7L) },
                new Object[] { "count", MessagePagedQueryResponse.builder().count(2L) },
                new Object[] { "total", MessagePagedQueryResponse.builder().total(1L) },
                new Object[] { "offset", MessagePagedQueryResponse.builder().offset(3L) },
                new Object[] { "results", MessagePagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.message.MessageImpl())) } };
    }

    @Test
    public void limit() {
        MessagePagedQueryResponse value = MessagePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void count() {
        MessagePagedQueryResponse value = MessagePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        MessagePagedQueryResponse value = MessagePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void offset() {
        MessagePagedQueryResponse value = MessagePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void results() {
        MessagePagedQueryResponse value = MessagePagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.message.MessageImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.message.MessageImpl()));
    }
}
