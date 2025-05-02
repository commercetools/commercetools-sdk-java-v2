
package com.commercetools.api.models.customer_group;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupPagedQueryResponseBuilder builder) {
        CustomerGroupPagedQueryResponse customerGroupPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(customerGroupPagedQueryResponse).isInstanceOf(CustomerGroupPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", CustomerGroupPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", CustomerGroupPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", CustomerGroupPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", CustomerGroupPagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        CustomerGroupPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.customer_group.CustomerGroupImpl())) } };
    }

    @Test
    public void limit() {
        CustomerGroupPagedQueryResponse value = CustomerGroupPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        CustomerGroupPagedQueryResponse value = CustomerGroupPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        CustomerGroupPagedQueryResponse value = CustomerGroupPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        CustomerGroupPagedQueryResponse value = CustomerGroupPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        CustomerGroupPagedQueryResponse value = CustomerGroupPagedQueryResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.api.models.customer_group.CustomerGroupImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.customer_group.CustomerGroupImpl()));
    }
}
