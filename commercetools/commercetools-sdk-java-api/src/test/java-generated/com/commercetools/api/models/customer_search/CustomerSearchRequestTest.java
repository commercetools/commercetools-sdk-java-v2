
package com.commercetools.api.models.customer_search;

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
public class CustomerSearchRequestTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerSearchRequestBuilder builder) {
        CustomerSearchRequest customerSearchRequest = builder.buildUnchecked();
        Assertions.assertThat(customerSearchRequest).isInstanceOf(CustomerSearchRequest.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomerSearchRequest.builder()
                        .query(new com.commercetools.api.models.search.SearchQueryImpl()) },
                new Object[] { CustomerSearchRequest.builder()
                        .sort(Collections.singletonList(new com.commercetools.api.models.search.SearchSortingImpl())) },
                new Object[] { CustomerSearchRequest.builder().limit(7) },
                new Object[] { CustomerSearchRequest.builder().offset(3) } };
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
