
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
public class BusinessUnitPagedSearchResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitPagedSearchResponseBuilder builder) {
        BusinessUnitPagedSearchResponse businessUnitPagedSearchResponse = builder.buildUnchecked();
        Assertions.assertThat(businessUnitPagedSearchResponse).isInstanceOf(BusinessUnitPagedSearchResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitPagedSearchResponse.builder().total(1L) },
                new Object[] { BusinessUnitPagedSearchResponse.builder().limit(7) },
                new Object[] { BusinessUnitPagedSearchResponse.builder().offset(3) },
                new Object[] { BusinessUnitPagedSearchResponse.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.api.models.business_unit_search.BusinessUnitSearchResultImpl())) } };
    }

    @Test
    public void total() {
        BusinessUnitPagedSearchResponse value = BusinessUnitPagedSearchResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void limit() {
        BusinessUnitPagedSearchResponse value = BusinessUnitPagedSearchResponse.of();
        value.setLimit(7);
        Assertions.assertThat(value.getLimit()).isEqualTo(7);
    }

    @Test
    public void offset() {
        BusinessUnitPagedSearchResponse value = BusinessUnitPagedSearchResponse.of();
        value.setOffset(3);
        Assertions.assertThat(value.getOffset()).isEqualTo(3);
    }

    @Test
    public void results() {
        BusinessUnitPagedSearchResponse value = BusinessUnitPagedSearchResponse.of();
        value.setResults(Collections
                .singletonList(new com.commercetools.api.models.business_unit_search.BusinessUnitSearchResultImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.business_unit_search.BusinessUnitSearchResultImpl()));
    }
}
