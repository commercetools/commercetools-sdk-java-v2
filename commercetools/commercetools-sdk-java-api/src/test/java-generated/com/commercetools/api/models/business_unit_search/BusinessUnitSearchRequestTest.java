
package com.commercetools.api.models.business_unit_search;

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
public class BusinessUnitSearchRequestTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitSearchRequestBuilder builder) {
        BusinessUnitSearchRequest businessUnitSearchRequest = builder.buildUnchecked();
        Assertions.assertThat(businessUnitSearchRequest).isInstanceOf(BusinessUnitSearchRequest.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitSearchRequest.builder()
                        .query(new com.commercetools.api.models.search.SearchQueryImpl()) },
                new Object[] { BusinessUnitSearchRequest.builder()
                        .sort(Collections.singletonList(new com.commercetools.api.models.search.SearchSortingImpl())) },
                new Object[] { BusinessUnitSearchRequest.builder().limit(7) },
                new Object[] { BusinessUnitSearchRequest.builder().offset(3) } };
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
