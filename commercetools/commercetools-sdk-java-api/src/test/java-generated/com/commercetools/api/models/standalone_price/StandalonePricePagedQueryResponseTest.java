
package com.commercetools.api.models.standalone_price;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePricePagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePricePagedQueryResponseBuilder builder) {
        StandalonePricePagedQueryResponse standalonePricePagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(standalonePricePagedQueryResponse).isInstanceOf(StandalonePricePagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", StandalonePricePagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", StandalonePricePagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", StandalonePricePagedQueryResponse.builder().count(2L) },
                new Object[] { "total", StandalonePricePagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        StandalonePricePagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.standalone_price.StandalonePriceImpl())) } };
    }

    @Test
    public void limit() {
        StandalonePricePagedQueryResponse value = StandalonePricePagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        StandalonePricePagedQueryResponse value = StandalonePricePagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        StandalonePricePagedQueryResponse value = StandalonePricePagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        StandalonePricePagedQueryResponse value = StandalonePricePagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        StandalonePricePagedQueryResponse value = StandalonePricePagedQueryResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.api.models.standalone_price.StandalonePriceImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.standalone_price.StandalonePriceImpl()));
    }
}
