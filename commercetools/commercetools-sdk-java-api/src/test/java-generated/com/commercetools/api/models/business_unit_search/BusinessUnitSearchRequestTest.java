
package com.commercetools.api.models.business_unit_search;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitSearchRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitSearchRequestBuilder builder) {
        BusinessUnitSearchRequest businessUnitSearchRequest = builder.buildUnchecked();
        Assertions.assertThat(businessUnitSearchRequest).isInstanceOf(BusinessUnitSearchRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "query",
                        BusinessUnitSearchRequest.builder()
                                .query(new com.commercetools.api.models.search.SearchQueryImpl()) },
                new Object[] { "sort",
                        BusinessUnitSearchRequest.builder()
                                .sort(Collections
                                        .singletonList(new com.commercetools.api.models.search.SearchSortingImpl())) },
                new Object[] { "limit", BusinessUnitSearchRequest.builder().limit(7) },
                new Object[] { "offset", BusinessUnitSearchRequest.builder().offset(3) } };
    }

    @Test
    public void query() {
        BusinessUnitSearchRequest value = BusinessUnitSearchRequest.of();
        value.setQuery(new com.commercetools.api.models.search.SearchQueryImpl());
        Assertions.assertThat(value.getQuery()).isEqualTo(new com.commercetools.api.models.search.SearchQueryImpl());
    }

    @Test
    public void sort() {
        BusinessUnitSearchRequest value = BusinessUnitSearchRequest.of();
        value.setSort(Collections.singletonList(new com.commercetools.api.models.search.SearchSortingImpl()));
        Assertions.assertThat(value.getSort())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.search.SearchSortingImpl()));
    }

    @Test
    public void limit() {
        BusinessUnitSearchRequest value = BusinessUnitSearchRequest.of();
        value.setLimit(7);
        Assertions.assertThat(value.getLimit()).isEqualTo(7);
    }

    @Test
    public void offset() {
        BusinessUnitSearchRequest value = BusinessUnitSearchRequest.of();
        value.setOffset(3);
        Assertions.assertThat(value.getOffset()).isEqualTo(3);
    }
}
