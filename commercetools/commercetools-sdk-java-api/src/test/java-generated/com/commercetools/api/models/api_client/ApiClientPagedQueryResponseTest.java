
package com.commercetools.api.models.api_client;

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
public class ApiClientPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApiClientPagedQueryResponseBuilder builder) {
        ApiClientPagedQueryResponse apiClientPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(apiClientPagedQueryResponse).isInstanceOf(ApiClientPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApiClientPagedQueryResponse.builder().limit(7L) },
                new Object[] { ApiClientPagedQueryResponse.builder().offset(3L) },
                new Object[] { ApiClientPagedQueryResponse.builder().count(2L) },
                new Object[] { ApiClientPagedQueryResponse.builder().total(1L) },
                new Object[] { ApiClientPagedQueryResponse.builder()
                        .results(
                            Collections.singletonList(new com.commercetools.api.models.api_client.ApiClientImpl())) } };
    }

    @Test
    public void limit() {
        ApiClientPagedQueryResponse value = ApiClientPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ApiClientPagedQueryResponse value = ApiClientPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ApiClientPagedQueryResponse value = ApiClientPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ApiClientPagedQueryResponse value = ApiClientPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ApiClientPagedQueryResponse value = ApiClientPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.api_client.ApiClientImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.api_client.ApiClientImpl()));
    }
}
