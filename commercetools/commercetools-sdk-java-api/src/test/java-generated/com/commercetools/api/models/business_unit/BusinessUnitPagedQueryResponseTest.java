
package com.commercetools.api.models.business_unit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitPagedQueryResponseBuilder builder) {
        BusinessUnitPagedQueryResponse businessUnitPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(businessUnitPagedQueryResponse).isInstanceOf(BusinessUnitPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", BusinessUnitPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", BusinessUnitPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", BusinessUnitPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", BusinessUnitPagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        BusinessUnitPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.business_unit.BusinessUnitImpl())) } };
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
