
package com.commercetools.importapi.models.importcontainers;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImportContainerPagedResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImportContainerPagedResponseBuilder builder) {
        ImportContainerPagedResponse importContainerPagedResponse = builder.buildUnchecked();
        Assertions.assertThat(importContainerPagedResponse).isInstanceOf(ImportContainerPagedResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", ImportContainerPagedResponse.builder().limit(7) },
                new Object[] { "offset", ImportContainerPagedResponse.builder().offset(3L) },
                new Object[] { "count", ImportContainerPagedResponse.builder().count(2L) },
                new Object[] { "total", ImportContainerPagedResponse.builder().total(1L) },
                new Object[] { "results",
                        ImportContainerPagedResponse.builder()
                                .results(Collections.singletonList(
                                    new com.commercetools.importapi.models.importcontainers.ImportContainerImpl())) } };
    }

    @Test
    public void limit() {
        ImportContainerPagedResponse value = ImportContainerPagedResponse.of();
        value.setLimit(7);
        Assertions.assertThat(value.getLimit()).isEqualTo(7);
    }

    @Test
    public void offset() {
        ImportContainerPagedResponse value = ImportContainerPagedResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void count() {
        ImportContainerPagedResponse value = ImportContainerPagedResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ImportContainerPagedResponse value = ImportContainerPagedResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void results() {
        ImportContainerPagedResponse value = ImportContainerPagedResponse.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.importapi.models.importcontainers.ImportContainerImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.importcontainers.ImportContainerImpl()));
    }
}
