
package com.commercetools.api.models.quote;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuotePagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuotePagedQueryResponseBuilder builder) {
        QuotePagedQueryResponse quotePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(quotePagedQueryResponse).isInstanceOf(QuotePagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", QuotePagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", QuotePagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", QuotePagedQueryResponse.builder().count(2L) },
                new Object[] { "total", QuotePagedQueryResponse.builder().total(1L) },
                new Object[] { "results", QuotePagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.quote.QuoteImpl())) } };
    }

    @Test
    public void limit() {
        QuotePagedQueryResponse value = QuotePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        QuotePagedQueryResponse value = QuotePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        QuotePagedQueryResponse value = QuotePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        QuotePagedQueryResponse value = QuotePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        QuotePagedQueryResponse value = QuotePagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.quote.QuoteImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.quote.QuoteImpl()));
    }
}
