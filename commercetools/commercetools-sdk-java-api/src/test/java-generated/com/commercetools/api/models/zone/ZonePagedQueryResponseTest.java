
package com.commercetools.api.models.zone;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ZonePagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ZonePagedQueryResponseBuilder builder) {
        ZonePagedQueryResponse zonePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(zonePagedQueryResponse).isInstanceOf(ZonePagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", ZonePagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", ZonePagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", ZonePagedQueryResponse.builder().count(2L) },
                new Object[] { "total", ZonePagedQueryResponse.builder().total(1L) },
                new Object[] { "results", ZonePagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.zone.ZoneImpl())) } };
    }

    @Test
    public void limit() {
        ZonePagedQueryResponse value = ZonePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ZonePagedQueryResponse value = ZonePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ZonePagedQueryResponse value = ZonePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ZonePagedQueryResponse value = ZonePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ZonePagedQueryResponse value = ZonePagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.zone.ZoneImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.zone.ZoneImpl()));
    }
}
