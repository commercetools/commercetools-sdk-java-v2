
package com.commercetools.api.models.variant;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantPagedQueryResponseBuilder builder) {
        VariantPagedQueryResponse variantPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(variantPagedQueryResponse).isInstanceOf(VariantPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", VariantPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", VariantPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", VariantPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", VariantPagedQueryResponse.builder().total(1L) },
                new Object[] { "results", VariantPagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.variant.VariantImpl())) } };
    }

    @Test
    public void limit() {
        VariantPagedQueryResponse value = VariantPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        VariantPagedQueryResponse value = VariantPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        VariantPagedQueryResponse value = VariantPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        VariantPagedQueryResponse value = VariantPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        VariantPagedQueryResponse value = VariantPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.variant.VariantImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.variant.VariantImpl()));
    }
}
