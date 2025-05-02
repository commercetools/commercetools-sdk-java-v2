
package com.commercetools.api.models.customer_search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSearchResultTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSearchResultBuilder builder) {
        CustomerSearchResult customerSearchResult = builder.buildUnchecked();
        Assertions.assertThat(customerSearchResult).isInstanceOf(CustomerSearchResult.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CustomerSearchResult.builder().id("id") },
                new Object[] { "relevance", CustomerSearchResult.builder().relevance(0.5586561) } };
    }

    @Test
    public void id() {
        CustomerSearchResult value = CustomerSearchResult.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void relevance() {
        CustomerSearchResult value = CustomerSearchResult.of();
        value.setRelevance(0.5586561);
        Assertions.assertThat(value.getRelevance()).isEqualTo(0.5586561);
    }
}
