
package com.commercetools.api.models.common;

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
public class PagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PagedQueryResponseBuilder builder) {
        PagedQueryResponse pagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(pagedQueryResponse).isInstanceOf(PagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PagedQueryResponse.builder().limit(7L) },
                new Object[] { PagedQueryResponse.builder().offset(3L) },
                new Object[] { PagedQueryResponse.builder().count(2L) },
                new Object[] { PagedQueryResponse.builder().total(1L) },
                new Object[] {
                        PagedQueryResponse.builder()
                                .results(Collections
                                        .singletonList(new com.commercetools.api.models.common.BaseResourceImpl())) },
                new Object[] { PagedQueryResponse.builder().meta("meta") } };
    }

    @Test
    public void limit() {
        PagedQueryResponse value = PagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        PagedQueryResponse value = PagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        PagedQueryResponse value = PagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        PagedQueryResponse value = PagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        PagedQueryResponse value = PagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.common.BaseResourceImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.BaseResourceImpl()));
    }

    @Test
    public void meta() {
        PagedQueryResponse value = PagedQueryResponse.of();
        value.setMeta("meta");
        Assertions.assertThat(value.getMeta()).isEqualTo("meta");
    }
}
