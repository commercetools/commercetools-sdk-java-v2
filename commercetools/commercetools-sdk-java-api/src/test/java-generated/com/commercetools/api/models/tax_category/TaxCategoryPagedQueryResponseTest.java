
package com.commercetools.api.models.tax_category;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxCategoryPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxCategoryPagedQueryResponseBuilder builder) {
        TaxCategoryPagedQueryResponse taxCategoryPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(taxCategoryPagedQueryResponse).isInstanceOf(TaxCategoryPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", TaxCategoryPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", TaxCategoryPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", TaxCategoryPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", TaxCategoryPagedQueryResponse.builder().total(1L) },
                new Object[] { "results",
                        TaxCategoryPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.tax_category.TaxCategoryImpl())) } };
    }

    @Test
    public void limit() {
        TaxCategoryPagedQueryResponse value = TaxCategoryPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        TaxCategoryPagedQueryResponse value = TaxCategoryPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        TaxCategoryPagedQueryResponse value = TaxCategoryPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        TaxCategoryPagedQueryResponse value = TaxCategoryPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        TaxCategoryPagedQueryResponse value = TaxCategoryPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.tax_category.TaxCategoryImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.tax_category.TaxCategoryImpl()));
    }
}
