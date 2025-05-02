
package com.commercetools.api.models.api_client;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApiClientPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApiClientPagedQueryResponseBuilder builder) {
        ApiClientPagedQueryResponse apiClientPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(apiClientPagedQueryResponse).isInstanceOf(ApiClientPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", ApiClientPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", ApiClientPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", ApiClientPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", ApiClientPagedQueryResponse.builder().total(1L) },
                new Object[] { "results", ApiClientPagedQueryResponse.builder()
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
