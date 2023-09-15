
package com.commercetools.api.models.customer;

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
public class CustomerPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerPagedQueryResponseBuilder builder) {
        CustomerPagedQueryResponse customerPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(customerPagedQueryResponse).isInstanceOf(CustomerPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerPagedQueryResponse.builder().limit(7L) },
                new Object[] { CustomerPagedQueryResponse.builder().offset(3L) },
                new Object[] { CustomerPagedQueryResponse.builder().count(2L) },
                new Object[] { CustomerPagedQueryResponse.builder().total(1L) },
                new Object[] { CustomerPagedQueryResponse.builder()
                        .results(
                            Collections.singletonList(new com.commercetools.api.models.customer.CustomerImpl())) } };
    }

    @Test
    public void limit() {
        CustomerPagedQueryResponse value = CustomerPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        CustomerPagedQueryResponse value = CustomerPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        CustomerPagedQueryResponse value = CustomerPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        CustomerPagedQueryResponse value = CustomerPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        CustomerPagedQueryResponse value = CustomerPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.customer.CustomerImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.customer.CustomerImpl()));
    }
}
