
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderPagedSearchResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderPagedSearchResponseBuilder builder) {
        OrderPagedSearchResponse orderPagedSearchResponse = builder.buildUnchecked();
        Assertions.assertThat(orderPagedSearchResponse).isInstanceOf(OrderPagedSearchResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "total", OrderPagedSearchResponse.builder().total(1L) },
                new Object[] { "offset", OrderPagedSearchResponse.builder().offset(3L) },
                new Object[] { "limit", OrderPagedSearchResponse.builder().limit(7L) },
                new Object[] { "hits", OrderPagedSearchResponse.builder()
                        .hits(Collections.singletonList(new com.commercetools.api.models.order.HitImpl())) } };
    }

    @Test
    public void total() {
        OrderPagedSearchResponse value = OrderPagedSearchResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void offset() {
        OrderPagedSearchResponse value = OrderPagedSearchResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void limit() {
        OrderPagedSearchResponse value = OrderPagedSearchResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void hits() {
        OrderPagedSearchResponse value = OrderPagedSearchResponse.of();
        value.setHits(Collections.singletonList(new com.commercetools.api.models.order.HitImpl()));
        Assertions.assertThat(value.getHits())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.HitImpl()));
    }
}
