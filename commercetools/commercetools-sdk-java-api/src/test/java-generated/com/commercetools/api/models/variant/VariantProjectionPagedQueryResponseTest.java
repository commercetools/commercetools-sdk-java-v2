
package com.commercetools.api.models.variant;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantProjectionPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantProjectionPagedQueryResponseBuilder builder) {
        VariantProjectionPagedQueryResponse variantProjectionPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(variantProjectionPagedQueryResponse)
                .isInstanceOf(VariantProjectionPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", VariantProjectionPagedQueryResponse.builder().limit(7L) },
                new Object[] { "count", VariantProjectionPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", VariantProjectionPagedQueryResponse.builder().total(1L) },
                new Object[] { "offset", VariantProjectionPagedQueryResponse.builder().offset(3L) },
                new Object[] { "results",
                        VariantProjectionPagedQueryResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.api.models.variant.VariantProjectionImpl())) } };
    }

    @Test
    public void limit() {
        VariantProjectionPagedQueryResponse value = VariantProjectionPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void count() {
        VariantProjectionPagedQueryResponse value = VariantProjectionPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        VariantProjectionPagedQueryResponse value = VariantProjectionPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void offset() {
        VariantProjectionPagedQueryResponse value = VariantProjectionPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void results() {
        VariantProjectionPagedQueryResponse value = VariantProjectionPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.variant.VariantProjectionImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.variant.VariantProjectionImpl()));
    }
}
