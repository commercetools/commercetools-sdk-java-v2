
package com.commercetools.api.models.product_selection;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssignedProductSelectionPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssignedProductSelectionPagedQueryResponseBuilder builder) {
        AssignedProductSelectionPagedQueryResponse assignedProductSelectionPagedQueryResponse = builder
                .buildUnchecked();
        Assertions.assertThat(assignedProductSelectionPagedQueryResponse)
                .isInstanceOf(AssignedProductSelectionPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "limit", AssignedProductSelectionPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", AssignedProductSelectionPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", AssignedProductSelectionPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", AssignedProductSelectionPagedQueryResponse.builder().total(1L) },
                new Object[] { "results", AssignedProductSelectionPagedQueryResponse.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.api.models.product_selection.AssignedProductSelectionImpl())) } };
    }

    @Test
    public void limit() {
        AssignedProductSelectionPagedQueryResponse value = AssignedProductSelectionPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        AssignedProductSelectionPagedQueryResponse value = AssignedProductSelectionPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        AssignedProductSelectionPagedQueryResponse value = AssignedProductSelectionPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        AssignedProductSelectionPagedQueryResponse value = AssignedProductSelectionPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        AssignedProductSelectionPagedQueryResponse value = AssignedProductSelectionPagedQueryResponse.of();
        value.setResults(Collections
                .singletonList(new com.commercetools.api.models.product_selection.AssignedProductSelectionImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_selection.AssignedProductSelectionImpl()));
    }
}
