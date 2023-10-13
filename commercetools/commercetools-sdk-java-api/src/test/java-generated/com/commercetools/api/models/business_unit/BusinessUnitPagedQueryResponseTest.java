
package com.commercetools.api.models.business_unit;

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
public class BusinessUnitPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitPagedQueryResponseBuilder builder) {
        BusinessUnitPagedQueryResponse businessUnitPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(businessUnitPagedQueryResponse).isInstanceOf(BusinessUnitPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitPagedQueryResponse.builder().limit(7L) },
                new Object[] { BusinessUnitPagedQueryResponse.builder().offset(3L) },
                new Object[] { BusinessUnitPagedQueryResponse.builder().count(2L) },
                new Object[] { BusinessUnitPagedQueryResponse.builder().total(1L) },
                new Object[] { BusinessUnitPagedQueryResponse.builder()
                        .results(Collections
                                .singletonList(new com.commercetools.api.models.business_unit.BusinessUnitImpl())) } };
    }

    @Test
    public void limit() {
        BusinessUnitPagedQueryResponse value = BusinessUnitPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        BusinessUnitPagedQueryResponse value = BusinessUnitPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        BusinessUnitPagedQueryResponse value = BusinessUnitPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        BusinessUnitPagedQueryResponse value = BusinessUnitPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        BusinessUnitPagedQueryResponse value = BusinessUnitPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.business_unit.BusinessUnitImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.business_unit.BusinessUnitImpl()));
    }
}
