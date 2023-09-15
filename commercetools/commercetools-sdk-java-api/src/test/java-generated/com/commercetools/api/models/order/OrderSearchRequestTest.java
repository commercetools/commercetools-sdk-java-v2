
package com.commercetools.api.models.order;

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
public class OrderSearchRequestTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSearchRequestBuilder builder) {
        OrderSearchRequest orderSearchRequest = builder.buildUnchecked();
        Assertions.assertThat(orderSearchRequest).isInstanceOf(OrderSearchRequest.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderSearchRequest.builder()
                        .query(new com.commercetools.api.models.order.OrderSearchQueryImpl()) },
                new Object[] { OrderSearchRequest.builder()
                        .sort(Collections
                                .singletonList(new com.commercetools.api.models.order.OrderSearchSortingImpl())) },
                new Object[] { OrderSearchRequest.builder().limit(7) },
                new Object[] { OrderSearchRequest.builder().offset(3) } };
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
