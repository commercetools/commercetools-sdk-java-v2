
package com.commercetools.api.models.extension;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionPagedQueryResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionPagedQueryResponseBuilder builder) {
        ExtensionPagedQueryResponse extensionPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(extensionPagedQueryResponse).isInstanceOf(ExtensionPagedQueryResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", ExtensionPagedQueryResponse.builder().limit(7L) },
                new Object[] { "offset", ExtensionPagedQueryResponse.builder().offset(3L) },
                new Object[] { "count", ExtensionPagedQueryResponse.builder().count(2L) },
                new Object[] { "total", ExtensionPagedQueryResponse.builder().total(1L) },
                new Object[] { "results", ExtensionPagedQueryResponse.builder()
                        .results(
                            Collections.singletonList(new com.commercetools.api.models.extension.ExtensionImpl())) } };
    }

    @Test
    public void limit() {
        ExtensionPagedQueryResponse value = ExtensionPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        ExtensionPagedQueryResponse value = ExtensionPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ExtensionPagedQueryResponse value = ExtensionPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ExtensionPagedQueryResponse value = ExtensionPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ExtensionPagedQueryResponse value = ExtensionPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.extension.ExtensionImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.extension.ExtensionImpl()));
    }
}
