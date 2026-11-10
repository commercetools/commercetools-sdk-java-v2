
package com.commercetools.api.models.common;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PagedQueryResponseBuilder builder) {
        PagedQueryResponse pagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(pagedQueryResponse).isInstanceOf(PagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", PagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", PagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", PagedQueryResponse.builder().count(2L) },
                new Object[] { "total", PagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        PagedQueryResponse.builder()
                                .results(Collections
                                        .singletonList(new com.commercetools.api.models.common.BaseResourceImpl())) },
                new Object[] { "meta", PagedQueryResponse.builder().meta("meta") } };
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
