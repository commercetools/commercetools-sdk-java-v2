
package com.commercetools.api.models.business_unit_search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitSearchResultTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitSearchResultBuilder builder) {
        BusinessUnitSearchResult businessUnitSearchResult = builder.buildUnchecked();
        Assertions.assertThat(businessUnitSearchResult).isInstanceOf(BusinessUnitSearchResult.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", BusinessUnitSearchResult.builder().id("id") },
                new Object[] { "relevance", BusinessUnitSearchResult.builder().relevance(0.5586561) } };
    }

    @Test
    public void id() {
        BusinessUnitSearchResult value = BusinessUnitSearchResult.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void relevance() {
        BusinessUnitSearchResult value = BusinessUnitSearchResult.of();
        value.setRelevance(0.5586561);
        Assertions.assertThat(value.getRelevance()).isEqualTo(0.5586561);
    }
}
