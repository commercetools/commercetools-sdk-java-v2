
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchRequestBuilder builder) {
        OrderSearchRequest orderSearchRequest = builder.buildUnchecked();
        Assertions.assertThat(orderSearchRequest).isInstanceOf(OrderSearchRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "query",
                        OrderSearchRequest.builder()
                                .query(new com.commercetools.api.models.order.OrderSearchQueryImpl()) },
                new Object[] { "sort",
                        OrderSearchRequest.builder()
                                .sort(Collections.singletonList(
                                    new com.commercetools.api.models.order.OrderSearchSortingImpl())) },
                new Object[] { "limit", OrderSearchRequest.builder().limit(7) },
                new Object[] { "offset", OrderSearchRequest.builder().offset(3) } };
    }

    @Test
    public void query() {
        OrderSearchRequest value = OrderSearchRequest.of();
        value.setQuery(new com.commercetools.api.models.order.OrderSearchQueryImpl());
        Assertions.assertThat(value.getQuery())
                .isEqualTo(new com.commercetools.api.models.order.OrderSearchQueryImpl());
    }

    @Test
    public void sort() {
        OrderSearchRequest value = OrderSearchRequest.of();
        value.setSort(Collections.singletonList(new com.commercetools.api.models.order.OrderSearchSortingImpl()));
        Assertions.assertThat(value.getSort())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.OrderSearchSortingImpl()));
    }

    @Test
    public void limit() {
        OrderSearchRequest value = OrderSearchRequest.of();
        value.setLimit(7);
        Assertions.assertThat(value.getLimit()).isEqualTo(7);
    }

    @Test
    public void offset() {
        OrderSearchRequest value = OrderSearchRequest.of();
        value.setOffset(3);
        Assertions.assertThat(value.getOffset()).isEqualTo(3);
    }
}
