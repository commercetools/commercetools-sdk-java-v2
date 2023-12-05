
package com.commercetools.api.models.staged_quote;

import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class StagedQuotePagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedQuotePagedQueryResponseBuilder builder) {
        StagedQuotePagedQueryResponse stagedQuotePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(stagedQuotePagedQueryResponse).isInstanceOf(StagedQuotePagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedQuotePagedQueryResponse.builder().limit(7L) },
                new Object[] { StagedQuotePagedQueryResponse.builder().offset(3L) },
                new Object[] { StagedQuotePagedQueryResponse.builder().count(2L) },
                new Object[] { StagedQuotePagedQueryResponse.builder().total(1L) },
                new Object[] { StagedQuotePagedQueryResponse.builder()
                        .results(Collections
                                .singletonList(new com.commercetools.api.models.staged_quote.StagedQuoteImpl())) } };
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
