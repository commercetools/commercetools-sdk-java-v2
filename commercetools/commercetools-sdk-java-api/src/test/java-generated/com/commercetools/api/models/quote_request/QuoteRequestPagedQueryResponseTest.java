
package com.commercetools.api.models.quote_request;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRequestPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRequestPagedQueryResponseBuilder builder) {
        QuoteRequestPagedQueryResponse quoteRequestPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestPagedQueryResponse).isInstanceOf(QuoteRequestPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", QuoteRequestPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", QuoteRequestPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", QuoteRequestPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", QuoteRequestPagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        QuoteRequestPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.quote_request.QuoteRequestImpl())) } };
    }

    @Test
    public void limit() {
        QuoteRequestPagedQueryResponse value = QuoteRequestPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        QuoteRequestPagedQueryResponse value = QuoteRequestPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        QuoteRequestPagedQueryResponse value = QuoteRequestPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        QuoteRequestPagedQueryResponse value = QuoteRequestPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        QuoteRequestPagedQueryResponse value = QuoteRequestPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.quote_request.QuoteRequestImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.quote_request.QuoteRequestImpl()));
    }
}
