
package com.commercetools.api.models.business_unit_search;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitPagedSearchResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitPagedSearchResponseBuilder builder) {
        BusinessUnitPagedSearchResponse businessUnitPagedSearchResponse = builder.buildUnchecked();
        Assertions.assertThat(businessUnitPagedSearchResponse).isInstanceOf(BusinessUnitPagedSearchResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "total", BusinessUnitPagedSearchResponse.builder().total(1L) },
                new Object[] { "limit", BusinessUnitPagedSearchResponse.builder().limit(7) },
                new Object[] { "offset", BusinessUnitPagedSearchResponse.builder().offset(3) },
                new Object[] { "results", BusinessUnitPagedSearchResponse.builder()
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
