
package com.commercetools.api.models.staged_quote;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuotePagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuotePagedQueryResponseBuilder builder) {
        StagedQuotePagedQueryResponse stagedQuotePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(stagedQuotePagedQueryResponse).isInstanceOf(StagedQuotePagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", StagedQuotePagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", StagedQuotePagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", StagedQuotePagedQueryResponse.builder().count(2L) },
                new Object[] { "total", StagedQuotePagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        StagedQuotePagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.staged_quote.StagedQuoteImpl())) } };
    }

    @Test
    public void limit() {
        StagedQuotePagedQueryResponse value = StagedQuotePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        StagedQuotePagedQueryResponse value = StagedQuotePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        StagedQuotePagedQueryResponse value = StagedQuotePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        StagedQuotePagedQueryResponse value = StagedQuotePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        StagedQuotePagedQueryResponse value = StagedQuotePagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.staged_quote.StagedQuoteImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.staged_quote.StagedQuoteImpl()));
    }
}
