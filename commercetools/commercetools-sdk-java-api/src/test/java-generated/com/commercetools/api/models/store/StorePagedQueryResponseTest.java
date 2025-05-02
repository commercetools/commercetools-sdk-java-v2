
package com.commercetools.api.models.store;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StorePagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StorePagedQueryResponseBuilder builder) {
        StorePagedQueryResponse storePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(storePagedQueryResponse).isInstanceOf(StorePagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", StorePagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", StorePagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", StorePagedQueryResponse.builder().count(2L) },
                new Object[] { "total", StorePagedQueryResponse.builder().total(1L) },
                new Object[] { "results", StorePagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.store.StoreImpl())) } };
    }

    @Test
    public void limit() {
        StorePagedQueryResponse value = StorePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        StorePagedQueryResponse value = StorePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        StorePagedQueryResponse value = StorePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        StorePagedQueryResponse value = StorePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        StorePagedQueryResponse value = StorePagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.store.StoreImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.store.StoreImpl()));
    }
}
