
package com.commercetools.api.models.customer_search;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerPagedSearchResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerPagedSearchResponseBuilder builder) {
        CustomerPagedSearchResponse customerPagedSearchResponse = builder.buildUnchecked();
        Assertions.assertThat(customerPagedSearchResponse).isInstanceOf(CustomerPagedSearchResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "total", CustomerPagedSearchResponse.builder().total(1L) },
                new Object[] { "limit", CustomerPagedSearchResponse.builder().limit(7) },
                new Object[] { "offset", CustomerPagedSearchResponse.builder().offset(3) },
                new Object[] { "results",
                        CustomerPagedSearchResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.customer_search.CustomerSearchResultImpl())) } };
    }

    @Test
    public void total() {
        CustomerPagedSearchResponse value = CustomerPagedSearchResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void limit() {
        CustomerPagedSearchResponse value = CustomerPagedSearchResponse.of();
        value.setLimit(7);
        Assertions.assertThat(value.getLimit()).isEqualTo(7);
    }

    @Test
    public void offset() {
        CustomerPagedSearchResponse value = CustomerPagedSearchResponse.of();
        value.setOffset(3);
        Assertions.assertThat(value.getOffset()).isEqualTo(3);
    }

    @Test
    public void results() {
        CustomerPagedSearchResponse value = CustomerPagedSearchResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.api.models.customer_search.CustomerSearchResultImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.customer_search.CustomerSearchResultImpl()));
    }
}
