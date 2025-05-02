
package com.commercetools.api.models.customer_search;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSearchRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSearchRequestBuilder builder) {
        CustomerSearchRequest customerSearchRequest = builder.buildUnchecked();
        Assertions.assertThat(customerSearchRequest).isInstanceOf(CustomerSearchRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "query",
                        CustomerSearchRequest.builder()
                                .query(new com.commercetools.api.models.search.SearchQueryImpl()) },
                new Object[] { "sort",
                        CustomerSearchRequest.builder()
                                .sort(Collections
                                        .singletonList(new com.commercetools.api.models.search.SearchSortingImpl())) },
                new Object[] { "limit", CustomerSearchRequest.builder().limit(7) },
                new Object[] { "offset", CustomerSearchRequest.builder().offset(3) } };
    }

    @Test
    public void query() {
        CustomerSearchRequest value = CustomerSearchRequest.of();
        value.setQuery(new com.commercetools.api.models.search.SearchQueryImpl());
        Assertions.assertThat(value.getQuery()).isEqualTo(new com.commercetools.api.models.search.SearchQueryImpl());
    }

    @Test
    public void sort() {
        CustomerSearchRequest value = CustomerSearchRequest.of();
        value.setSort(Collections.singletonList(new com.commercetools.api.models.search.SearchSortingImpl()));
        Assertions.assertThat(value.getSort())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.search.SearchSortingImpl()));
    }

    @Test
    public void limit() {
        CustomerSearchRequest value = CustomerSearchRequest.of();
        value.setLimit(7);
        Assertions.assertThat(value.getLimit()).isEqualTo(7);
    }

    @Test
    public void offset() {
        CustomerSearchRequest value = CustomerSearchRequest.of();
        value.setOffset(3);
        Assertions.assertThat(value.getOffset()).isEqualTo(3);
    }
}
