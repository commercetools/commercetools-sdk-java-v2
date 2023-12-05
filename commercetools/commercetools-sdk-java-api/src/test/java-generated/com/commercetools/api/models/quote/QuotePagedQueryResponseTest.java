
package com.commercetools.api.models.quote;

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
public class QuotePagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuotePagedQueryResponseBuilder builder) {
        QuotePagedQueryResponse quotePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(quotePagedQueryResponse).isInstanceOf(QuotePagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { QuotePagedQueryResponse.builder().limit(7L) },
                new Object[] { QuotePagedQueryResponse.builder().offset(3L) },
                new Object[] { QuotePagedQueryResponse.builder().count(2L) },
                new Object[] { QuotePagedQueryResponse.builder().total(1L) },
                new Object[] { QuotePagedQueryResponse.builder()
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
